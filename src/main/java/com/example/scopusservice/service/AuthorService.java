package com.example.scopusservice.service;

import com.example.scopusservice.model.dto.AuthorDTO;
import com.example.scopusservice.util.ValidationException;

import java.util.List;

public interface AuthorService {
    AuthorDTO saveAuthor(AuthorDTO AuthorDTO) throws ValidationException;

    void deleteAuthor(Long AuthorId);

    AuthorDTO findByName(String name);

    List<AuthorDTO> findAll();
}