package com.albertoruvel.helidon.rest;

import com.albertoruvel.helidon.data.dto.response.SayHi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class TestResource {

    @Path("sayHi")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response sayHi() {
        return Response.ok(new SayHi()).build();
    }
}
