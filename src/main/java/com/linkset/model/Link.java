package com.linkset.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private Long linksetId;
    private String name;
    private String href;
    private String description;

    public Link() {
    }

    public Link(Long linksetId, String name, String href, String description) {
        this.linksetId = linksetId;
        this.name = name;
        this.href = href;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLinksetId() {
        return linksetId;
    }

    public void setLinksetId(Long linksetId) {
        this.linksetId = linksetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
