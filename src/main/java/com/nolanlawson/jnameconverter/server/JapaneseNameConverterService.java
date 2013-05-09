package com.nolanlawson.jnameconverter.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/convert")
public class JapaneseNameConverterService {

    @GET
    @Path("/")
    public Response getMsg(@QueryParam("q") String query) {

        String output = "Jersey say : " + query;

        return Response.status(200).entity(output).build();

    }

}
