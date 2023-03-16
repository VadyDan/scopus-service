package com.example.scopusservice.repository;

import com.example.scopusservice.model.entity.PublicationAsjc;
import com.example.scopusservice.model.entity.PublicationAsjcPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationAsjcRepository extends JpaRepository<PublicationAsjc, PublicationAsjcPK> {
    PublicationAsjc findByAsjcCode(Long asjcCode);
    PublicationAsjc findByPublicationId (Long publicationId);
}
