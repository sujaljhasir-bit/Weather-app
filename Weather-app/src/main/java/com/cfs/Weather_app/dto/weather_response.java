package com.cfs.Weather_app.dto;

public class weather_response {

    private String city;

    private String condition;
    private String region;
    private double temperature;
    private String country;

    public weather_response() {
    }

    public weather_response(String city, String condition, String country, String region, double temperature) {
        this.city = city;
        this.condition = condition;
        this.country = country;
        this.region = region;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
