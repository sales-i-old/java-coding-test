package com.salesi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * A health check resource
 *
 * @author sales-i
 */
@Path("health")
@Produces(MediaType.TEXT_PLAIN)
public class HealthResource {

    /**
     * Health check endpoint
     *
     * @return plain text 'alive' to state the api is healthy
     */
    @GET
    public String getHealthCheck() {
        return "alive";
    }
}
