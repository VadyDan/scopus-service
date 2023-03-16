package com.example.scopusservice.repository;

import com.example.scopusservice.model.entity.PublicationAuthor;
import com.example.scopusservice.model.entity.PublicationAuthorPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationAuthorRepository extends JpaRepository<PublicationAuthor, PublicationAuthorPK> {
    PublicationAuthor findByAuthorId(Long authorId);
    PublicationAuthor findByPublicationId(Long publicationId);
}
