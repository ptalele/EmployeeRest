/**
 * 
 */
package com.concord.rest.service.boot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Anisha
 *
 */
@Path("rest")
public class EmployeeRestService {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GET
	@Path("/{id}")
	public Response getEmployee(@PathParam("id") String id) {

		String output = "Jersey say : " + id;
		logger.info(output);
		return Response.status(200).entity(output).build();

	}

}
