package com.example.scopusservice.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "publication_asjc", schema = "public", catalog = "scopus")
@IdClass(PublicationAsjcPK.class)
public class PublicationAsjc {
    @Id
    @Basic(optional = false)
    @Column(name = "asjc_code", nullable = false)
    private Long asjcCode;

    @Id
    @Basic(optional = false)
    @Column(name = "publication_id", nullable = false)
    private Long publicationId;


    public Long getAsjcCode() {
        return asjcCode;
    }

    public void setAsjcCode(Long asjcCode) {
        this.asjcCode = asjcCode;
    }

    public Long getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(Long publicationId) {
        this.publicationId = publicationId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicationAsjc that = (PublicationAsjc) o;
        return asjcCode.equals(that.asjcCode) && publicationId.equals(that.publicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asjcCode, publicationId);
    }
}
