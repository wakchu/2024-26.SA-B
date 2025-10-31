package com.example.androidintermedio.model;

import java.io.Serializable;

public class Product implements Serializable {
    Long id;
    String product_title;
    String title_description;
    String url_thumbnail;

    public Product(long id, String title, String title_description,
                   String url_thumbnail) throws IllegalArgumentException {
        this.id = id;
        this.product_title = title;
        this.title_description = title_description;
        this.isValidUrl(url_thumbnail);
        this.url_thumbnail = url_thumbnail;
    }

    private void isValidUrl(String url) throws IllegalArgumentException {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            throw new IllegalArgumentException("Invalid URL: " + url);
        }
    }

    public Long getId() {
        return id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public String getTitle_description() {
        return title_description;
    }

    public String getUrl_thumbnail() {
        return url_thumbnail;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public void setTitle_description(String title_description) {
        this.title_description = title_description;
    }

    public void setUrl_thumbnail(String url_thumbnail) {
        this.url_thumbnail = url_thumbnail;
    }
}

