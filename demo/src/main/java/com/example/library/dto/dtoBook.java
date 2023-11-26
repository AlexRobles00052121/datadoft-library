package com.example.library.dto;

public class dtoBook {
    private String name;
    private String summary;
    private Double price;
    private String stage;
    private String image;

    private Long genreid;

    private Long userid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getGenre() {
        return genreid;
    }

    public void setGenre(Long genre) {
        this.genreid = genre;
    }

    public Long getUser() {
        return userid;
    }

    public void setUser(Long user) {
        this.userid = user;
    }
}
