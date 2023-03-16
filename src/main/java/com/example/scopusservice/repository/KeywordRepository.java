package com.example.scopusservice.repository;

import com.example.scopusservice.model.entity.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
    Keyword findByWord(String word);
}
