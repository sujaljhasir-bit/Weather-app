package com.cfs.Weather_app.dto;

public class Condition {
    public String text;
    public String icon;
    public int code;

    public Condition(int code, String icon, String text) {
        this.code = code;
        this.icon = icon;
        this.text = text;
    }

    public Condition() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
