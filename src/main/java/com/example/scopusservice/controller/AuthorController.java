package com.example.scopusservice.controller;

import com.example.scopusservice.model.dto.AuthorDTO;
import com.example.scopusservice.service.AuthorService;
import com.example.scopusservice.util.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;
    private static Logger log = Logger.getLogger(AuthorController.class.getName());

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/save")
    public AuthorDTO saveAuthor(@RequestBody AuthorDTO authorDTO) throws ValidationException {
        log.info("Handling save author: " + authorDTO);
        return authorService.saveAuthor(authorDTO);
    }

    @GetMapping("/findAll")
    public List<AuthorDTO> findAllAuthors() {
        log.info("Handling find all authors request");
        return authorService.findAll();
    }

    @GetMapping("/findByName")
    public AuthorDTO findByName(@RequestParam String name) {
        log.info("Handling find author by name request: " + name);
        return authorService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        log.info("Handling delete author request: " + id);
        authorService.deleteAuthor(id);
        return ResponseEntity.ok().build();
    }
}
