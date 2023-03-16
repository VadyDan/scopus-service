package com.example.scopusservice.repository;

import com.example.scopusservice.model.entity.Asjc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsjcRepository extends JpaRepository<Asjc, Long> {
    Asjc findByCode(Long code);
}
