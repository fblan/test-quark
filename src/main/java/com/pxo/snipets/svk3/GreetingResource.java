package com.pxo.snipets.svk3;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.net.URISyntaxException;

@Path("/rest/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{world}")
    public String hello(@PathParam("world")String world) {
        URISyntaxException toto;
        return "Hello "+world+" from Fred!!!:)";
    }
}
