package com.cfs.Weather_app.service;


import com.cfs.Weather_app.dto.Root;
import com.cfs.Weather_app.dto.weather_response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class weather_service {
    @Value("${weather.api.key}")
    private String apikey;
    @Value("${weather.api.url}")
    private String apiurl;
    private RestTemplate template=new RestTemplate();
    public String test(){
        return "good";
    }
    public weather_response getData(String city){
        String url=apiurl+"?key="+apikey+"&q"+city;
        Root response=template.getForObject(url,Root.class);
        weather_response Weather_response=new weather_response();

        Weather_response.setCity(response.getLocation().name);
        Weather_response.setCountry(response.getLocation().country);
        Weather_response.setRegion(response.getLocation().region);
        int condition= Integer.parseInt(String.valueOf(response.getCurrent().getCondition().getCode()));
        Weather_response.setCountry(String.valueOf(condition));
        Weather_response.setTemperature(Double.parseDouble(String.valueOf(String.valueOf(response.getCurrent().getTemp_c()))));
        Root weather_response;
        return Weather_response;
    }

}
