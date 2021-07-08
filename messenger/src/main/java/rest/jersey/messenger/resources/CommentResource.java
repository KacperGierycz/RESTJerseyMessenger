package rest.jersey.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	
	@GET
	public String test() {	
	return "test";
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("commentId")long commentId,@PathParam("messageID")long messageID) {
		return "return of method test2 in commentID is: " + commentId + "messageId is: "+ messageID;
	}

}
