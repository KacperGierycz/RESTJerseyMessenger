package rest.jersey.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
@Produces(MediaType.TEXT_PLAIN)
public class MessageResource {
	
	@GET
	public String getMessage() {
		
		return "Hello World";
	}
	

}
