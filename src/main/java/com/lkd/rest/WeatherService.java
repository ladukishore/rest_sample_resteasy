package com.lkd.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.MediaType;

/**
 * @author ldash
 *
 */
@Path("/weather")
public class WeatherService {

    @GET
    @Path("/forecast")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response getTemperature(@QueryParam("city") String city, @QueryParam("date") String date) {

        Weather weather = new Weather();
        weather.setCity(city);
        weather.setDate(fromDateQueryParameter(date));
        weather.setTemperature(15); // hard coded the temperature
        ResponseBuilder builder = Response.ok(weather);

        return builder.build();

    }

    @POST
    @Path("/forecast")
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response createTemperature(Weather weather) {
        // stored the temperature for a city with date
        String result = "Temperature stored : " + weather;
        return Response.status(201).entity(result).build();

    }
    
    /**
     * Convert a String date parameter (format <code>yyyy-MM-dd</code>) into a Date.
     */
    protected Date fromDateQueryParameter(final String dateParam) {
        if (dateParam != null) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd").parse(dateParam);
            } catch (final ParseException e) {
                throw new org.jboss.resteasy.spi.BadRequestException("Unable to parse date querystring parameter " + dateParam);
            }
        } else {
            return null;
        }
    }


}
