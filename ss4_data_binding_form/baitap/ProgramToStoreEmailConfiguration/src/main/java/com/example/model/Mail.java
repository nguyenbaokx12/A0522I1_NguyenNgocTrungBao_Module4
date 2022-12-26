package com.example.model;

public class Mail {
    private String language;
    private int pageSize;
    private boolean spams;
    private String signature;

    public Mail() {
    }

    public Mail(String language, int pageSize, boolean spams, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spams = spams;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpams() {
        return spams;
    }

    public void setSpams(boolean spams) {
        this.spams = spams;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
