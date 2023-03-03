package com.example.scopusservice.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "topic_cluster", schema = "public", catalog = "scopus")
public class TopicCluster {
    @Id
    @Basic(optional = false)
    @Column(name = "num", nullable = false)
    private Long num;

    @Basic(optional = false)
    @Column(name = "name", nullable = false, unique = true, length = 255)
    private String name;

    @Basic(optional = false)
    @Column(name = "prominence_percentile", nullable = false)
    private Double prominencePercentile;


    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProminencePercentile() {
        return prominencePercentile;
    }

    public void setProminencePercentile(Double prominencePercentile) {
        this.prominencePercentile = prominencePercentile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TopicCluster)) return false;
        TopicCluster that = (TopicCluster) o;
        return num.equals(that.num) && name.equals(that.name) && prominencePercentile.equals(that.prominencePercentile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, prominencePercentile);
    }
}
