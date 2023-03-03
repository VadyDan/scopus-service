package com.example.scopusservice.service;

import com.example.scopusservice.model.dto.AuthorDTO;
import com.example.scopusservice.model.entity.Author;
import com.example.scopusservice.repository.AuthorRepository;
import com.example.scopusservice.util.ValidationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Service
public class DefaultAuthorService implements AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorConverter authorConverter;

    public DefaultAuthorService(AuthorRepository authorRepository, AuthorConverter authorConverter) {
        this.authorRepository = authorRepository;
        this.authorConverter = authorConverter;
    }

    @Override
    public AuthorDTO saveAuthor(AuthorDTO authorDTO) {
        try {
            validateAuthorDto(authorDTO);
            Author savedAuthor = authorRepository.save(authorConverter.fromAuthorDTOToAuthor(authorDTO));
            return authorConverter.fromAuthorToAuthorDTO(savedAuthor);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteAuthor(Long authorId) {
        authorRepository.deleteById(authorId);
    }

    @Override
    public AuthorDTO findByName(String name) {
        Author author = authorRepository.findByName(name);
        if (author != null) {
            return authorConverter.fromAuthorToAuthorDTO(author);
        }
        return null;
    }

    @Override
    public List<AuthorDTO> findAll() {
        return authorRepository.findAll()
                .stream()
                .map(authorConverter::fromAuthorToAuthorDTO)
                .collect(Collectors.toList());
    }

    private void validateAuthorDto(AuthorDTO authorDTO) throws ValidationException {
        if (isNull(authorDTO)) {
            throw new ValidationException("Object author is null!");
        }
        if (isNull(authorDTO.getName()) || authorDTO.getName().isEmpty()) {
            throw new ValidationException("Author's 'name' is empty!");
        }
    }
}
