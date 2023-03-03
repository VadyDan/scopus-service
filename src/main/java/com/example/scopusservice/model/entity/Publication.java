package com.example.scopusservice.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Publication {
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @SequenceGenerator(
            name = "publication_id_seq",
            sequenceName = "publication_id_seq",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "publication_id_seq"
    )
    private Long id;

    @Basic(optional = false)
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "type", length = 255)
    private String type;

    @Column(name = "abstract")
    private String abstr;

    @Column(name = "english")
    private Boolean english;

    @Column(name = "pages_num")
    private Integer pagesNum;

    @Column(name = "doi", unique = true, length = 255)
    private String doi;

    @Column(name = "eid", unique = true, length = 255)
    private String eid;

    @Column(name = "pubmed_id", unique = true)
    private Long pubmedId;

    @Column(name = "views_num")
    private Long viewsNum;

    @Column(name = "citations_num")
    private Long citationsNum;

    @Column(name = "open_access", length = 255)
    private String openAccess;

    @Column(name = "correspondence_address", length = 255)
    private String correspondenceAddress;

    @Column(name = "date_year")
    private Long dateYear;

    @Column(name = "topic_cluster_num")
    private Long topicClusterNum;

    @Column(name = "topic_num")
    private Long topicNum;

    @Column(name = "publication_source_id")
    private Long publicationSourceId;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbstr() {
        return abstr;
    }

    public void setAbstr(String abstr) {
        this.abstr = abstr;
    }

    public Boolean getEnglish() {
        return english;
    }

    public void setEnglish(Boolean english) {
        this.english = english;
    }

    public Integer getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(Integer pagesNum) {
        this.pagesNum = pagesNum;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Long getPubmedId() {
        return pubmedId;
    }

    public void setPubmedId(Long pubmedId) {
        this.pubmedId = pubmedId;
    }

    public Long getViewsNum() {
        return viewsNum;
    }

    public void setViewsNum(Long viewsNum) {
        this.viewsNum = viewsNum;
    }

    public Long getCitationsNum() {
        return citationsNum;
    }

    public void setCitationsNum(Long citationsNum) {
        this.citationsNum = citationsNum;
    }

    public String getOpenAccess() {
        return openAccess;
    }

    public void setOpenAccess(String openAccess) {
        this.openAccess = openAccess;
    }

    public Long getDateYear() {
        return dateYear;
    }

    public void setDateYear(Long dateYear) {
        this.dateYear = dateYear;
    }

    public String getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    public void setCorrespondenceAddress(String correspondenceAddress) {
        this.correspondenceAddress = correspondenceAddress;
    }

    public Long getTopicClusterNum() {
        return topicClusterNum;
    }

    public void setTopicClusterNum(Long topicClusterNum) {
        this.topicClusterNum = topicClusterNum;
    }

    public Long getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(Long topicNum) {
        this.topicNum = topicNum;
    }

    public Long getPublicationSourceId() {
        return publicationSourceId;
    }

    public void setPublicationSourceId(Long publicationSourceId) {
        this.publicationSourceId = publicationSourceId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publication)) return false;
        Publication that = (Publication) o;
        return id.equals(that.id) && name.equals(that.name) && Objects.equals(type, that.type) && Objects.equals(abstr, that.abstr) && Objects.equals(english, that.english) && Objects.equals(pagesNum, that.pagesNum) && Objects.equals(doi, that.doi) && Objects.equals(eid, that.eid) && Objects.equals(pubmedId, that.pubmedId) && Objects.equals(viewsNum, that.viewsNum) && Objects.equals(citationsNum, that.citationsNum) && Objects.equals(openAccess, that.openAccess) && Objects.equals(correspondenceAddress, that.correspondenceAddress) && Objects.equals(dateYear, that.dateYear) && Objects.equals(topicClusterNum, that.topicClusterNum) && Objects.equals(topicNum, that.topicNum) && Objects.equals(publicationSourceId, that.publicationSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, abstr, english, pagesNum, doi, eid, pubmedId, viewsNum, citationsNum, openAccess, correspondenceAddress, dateYear, topicClusterNum, topicNum, publicationSourceId);
    }
}
