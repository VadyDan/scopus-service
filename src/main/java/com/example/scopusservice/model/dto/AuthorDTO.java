package com.example.scopusservice.model.dto;

import jakarta.validation.constraints.NotNull;

public class AuthorDTO {
    @NotNull
    private Long id;
    @NotNull
    private String name;
    private Long scopusId;
    private Long hIndex;
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
}
