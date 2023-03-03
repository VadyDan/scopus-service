package com.example.scopusservice.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Author {
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "author_id_seq",
            sequenceName = "author_id_seq",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_id_seq"
    )
    private Long id;

    @Basic(optional = false)
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "scopus_id")
    private Long scopusId;

    @Column(name = "h_index")
    private Long hIndex;

    @Column(name = "organization_id")
    private Long organizationId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScopusId() {
        return scopusId;
    }

    public void setScopusId(Long scopusId) {
        this.scopusId = scopusId;
    }

    public Long gethIndex() {
        return hIndex;
    }

    public void sethIndex(Long hIndex) {
        this.hIndex = hIndex;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && Objects.equals(id, author.id) && Objects.equals(scopusId, author.scopusId) && Objects.equals(hIndex, author.hIndex) && Objects.equals(organizationId, author.organizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, scopusId, hIndex, organizationId);
    }
}
