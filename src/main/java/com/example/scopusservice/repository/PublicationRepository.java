package com.example.scopusservice.repository;

import com.example.scopusservice.model.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
    Publication findByName(String name);
}
