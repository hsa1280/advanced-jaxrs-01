package org.shian.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/*
 * can't make this class to be Singleton, since Singleton instance
 * will be created before the uri is constructed, so we can access
 * the path param or query param
 */
@Path("{pathParam}/test")
public class MyResource {
	
	/*
	 * The reason to put query param and path param in the class level
	 * is that all the class methods can use them
	 * 
	 */
	@PathParam("pathParam") private String pathParamExample;
	@QueryParam("query") private String queryParamExample;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		return "It works! Path param used " + pathParamExample + " and Query param used " +  queryParamExample;
	}
}
