package com.quanghuyabc9.rest.service;

import com.quanghuyabc9.rest.model.HelloRecord;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloRecord hello()
    {
        return new HelloRecord("Hello from Jakarta EE");
    }
}