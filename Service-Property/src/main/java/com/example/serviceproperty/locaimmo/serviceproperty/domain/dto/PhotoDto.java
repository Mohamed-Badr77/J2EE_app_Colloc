package com.example.serviceproperty.locaimmo.serviceproperty.domain.dto;

public class PhotoDto {

    private Long id;
    private String url;
    private Long adId; // id de l'annonce

    public PhotoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }
}
