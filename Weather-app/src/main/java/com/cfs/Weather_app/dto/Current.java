package com.cfs.Weather_app.dto;

public class Current {
    public int last_updated_epoch;
    public String last_updated;
    public double temp_c;
    public int temp_f;
    public int is_day;
    public Condition condition;
    public double wind_mph;
    public double wind_kph;
    public int wind_degree;
    public String wind_dir;
    public int pressure_mb;
    public double pressure_in;
    public int precip_mm;
    public int precip_in;
    public int humidity;
    public int cloud;
    public double feelslike_c;
    public double feelslike_f;
    public double windchill_c;
    public int windchill_f;
    public double heatindex_c;
    public int heatindex_f;
    public double dewpoint_c;
    public int dewpoint_f;
    public int vis_km;
    public int vis_miles;
    public double uv;
    public double gust_mph;
    public double gust_kph;
    public int will_it_rain;
    public int chance_of_rain;
    public int will_it_snow;
    public int chance_of_snow;
    public double wetbulb_c;
    public double wetbulb_f;
    public double short_rad;
    public double diff_rad;
    public int dni;
    public int gti;

    public Current(int chance_of_rain, int chance_of_snow, int cloud, Condition condition, double dewpoint_c, int dewpoint_f, double diff_rad, int dni, double feelslike_c, double feelslike_f, int gti, double gust_kph, double gust_mph, double heatindex_c, int heatindex_f, int humidity, int is_day, String last_updated, int last_updated_epoch, int precip_in, int precip_mm, double pressure_in, int pressure_mb, double short_rad, double temp_c, int temp_f, double uv, int vis_km, int vis_miles, double wetbulb_c, double wetbulb_f, int will_it_rain, int will_it_snow, int wind_degree, String wind_dir, double wind_kph, double wind_mph, double windchill_c, int windchill_f) {
        this.chance_of_rain = chance_of_rain;
        this.chance_of_snow = chance_of_snow;
        this.cloud = cloud;
        this.condition = condition;
        this.dewpoint_c = dewpoint_c;
        this.dewpoint_f = dewpoint_f;
        this.diff_rad = diff_rad;
        this.dni = dni;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.gti = gti;
        this.gust_kph = gust_kph;
        this.gust_mph = gust_mph;
        this.heatindex_c = heatindex_c;
        this.heatindex_f = heatindex_f;
        this.humidity = humidity;
        this.is_day = is_day;
        this.last_updated = last_updated;
        this.last_updated_epoch = last_updated_epoch;
        this.precip_in = precip_in;
        this.precip_mm = precip_mm;
        this.pressure_in = pressure_in;
        this.pressure_mb = pressure_mb;
        this.short_rad = short_rad;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.uv = uv;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.wetbulb_c = wetbulb_c;
        this.wetbulb_f = wetbulb_f;
        this.will_it_rain = will_it_rain;
        this.will_it_snow = will_it_snow;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.wind_kph = wind_kph;
        this.wind_mph = wind_mph;
        this.windchill_c = windchill_c;
        this.windchill_f = windchill_f;
    }

    public Current() {
    }

    public int getChance_of_rain() {
        return chance_of_rain;
    }

    public void setChance_of_rain(int chance_of_rain) {
        this.chance_of_rain = chance_of_rain;
    }

    public int getChance_of_snow() {
        return chance_of_snow;
    }

    public void setChance_of_snow(int chance_of_snow) {
        this.chance_of_snow = chance_of_snow;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getDewpoint_c() {
        return dewpoint_c;
    }

    public void setDewpoint_c(double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public int getDewpoint_f() {
        return dewpoint_f;
    }

    public void setDewpoint_f(int dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public double getDiff_rad() {
        return diff_rad;
    }

    public void setDiff_rad(double diff_rad) {
        this.diff_rad = diff_rad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public int getGti() {
        return gti;
    }

    public void setGti(int gti) {
        this.gti = gti;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public void setGust_mph(double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public double getHeatindex_c() {
        return heatindex_c;
    }

    public void setHeatindex_c(double heatindex_c) {
        this.heatindex_c = heatindex_c;
    }

    public int getHeatindex_f() {
        return heatindex_f;
    }

    public void setHeatindex_f(int heatindex_f) {
        this.heatindex_f = heatindex_f;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(int last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public int getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(int precip_in) {
        this.precip_in = precip_in;
    }

    public int getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(int precip_mm) {
        this.precip_mm = precip_mm;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public int getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(int pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public double getShort_rad() {
        return short_rad;
    }

    public void setShort_rad(double short_rad) {
        this.short_rad = short_rad;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public int getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(int temp_f) {
        this.temp_f = temp_f;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public int getVis_km() {
        return vis_km;
    }

    public void setVis_km(int vis_km) {
        this.vis_km = vis_km;
    }

    public int getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(int vis_miles) {
        this.vis_miles = vis_miles;
    }

    public double getWetbulb_c() {
        return wetbulb_c;
    }

    public void setWetbulb_c(double wetbulb_c) {
        this.wetbulb_c = wetbulb_c;
    }

    public double getWetbulb_f() {
        return wetbulb_f;
    }

    public void setWetbulb_f(double wetbulb_f) {
        this.wetbulb_f = wetbulb_f;
    }

    public int getWill_it_rain() {
        return will_it_rain;
    }

    public void setWill_it_rain(int will_it_rain) {
        this.will_it_rain = will_it_rain;
    }

    public int getWill_it_snow() {
        return will_it_snow;
    }

    public void setWill_it_snow(int will_it_snow) {
        this.will_it_snow = will_it_snow;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(int wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public double getWindchill_c() {
        return windchill_c;
    }

    public void setWindchill_c(double windchill_c) {
        this.windchill_c = windchill_c;
    }

    public int getWindchill_f() {
        return windchill_f;
    }

    public void setWindchill_f(int windchill_f) {
        this.windchill_f = windchill_f;
    }
}
