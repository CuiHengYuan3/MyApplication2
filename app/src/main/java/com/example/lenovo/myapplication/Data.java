package com.example.lenovo.myapplication;

public class Data {
    private String imageUrl;
    private String title;

    public Data(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {

        return imageUrl;
    }

    public String getTitle() {
        return title;
    }
}
