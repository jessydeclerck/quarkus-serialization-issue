package org.acme;

import org.acme.dto.DateDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.ZonedDateTime;

@Produces(MediaType.APPLICATION_JSON)
@Path("/hello")
public class ExampleResource {

    @GET
    public DateDto hello() {
        return new DateDto(ZonedDateTime.now());
    }
}