package org.wasil.controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("/")
public class HelloController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap hello() {
        return new HashMap(){{
            put("hello", "world");
        }};
    }
}