package com.salesi.resources;

import com.salesi.entity.ToDo;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;


/**
 * A health check resource
 *
 * @author sales-i
 */
@Path("health")
@Produces(MediaType.TEXT_PLAIN)
public class CreateToDo {

    /**
     * Health check endpoint
     *
     * @return plain text 'alive' to state the api is healthy
     */

    @POST
    public  ArrayList<ToDo> createToDoList(ArrayList<ToDo> toDoList) {

           return null;

    }
}
