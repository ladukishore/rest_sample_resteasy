package com.lkd.rest;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ldash
 *
 */
@XmlRootElement(name = "weather")
public class Weather {

    String city;
    float temperature;
    Date date;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Weather [city=" + city + ", date=" + date + ",temp=" + temperature + "]";
    }

}
