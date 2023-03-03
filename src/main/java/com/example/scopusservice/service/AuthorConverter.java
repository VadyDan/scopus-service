package com.example.scopusservice.service;

import com.example.scopusservice.model.dto.AuthorDTO;
import com.example.scopusservice.model.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorConverter {
    public Author fromAuthorDTOToAuthor(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setId(authorDTO.getId());
        author.setName(authorDTO.getName());
        author.setScopusId(authorDTO.getScopusId());
        author.sethIndex(authorDTO.gethIndex());
        author.setOrganizationId(authorDTO.getOrganizationId());
        return author;
    }
    public AuthorDTO fromAuthorToAuthorDTO(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        authorDTO.setScopusId(author.getScopusId());
        authorDTO.sethIndex(author.gethIndex());
        authorDTO.setOrganizationId(author.getOrganizationId());
        return authorDTO;
    }
}
