package com.example.scopusservice.repository;

import com.example.scopusservice.model.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector, Long> {
    Sector findByName(String name);
}
