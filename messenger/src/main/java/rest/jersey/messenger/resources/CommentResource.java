package rest.jersey.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rest.jersey.messenger.model.Comment;
import rest.jersey.messenger.service.CommentService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	
	private CommentService commentService;
	
	@GET
	public List<Comment> getAllComments(@PathParam("messageId")long messageId){
		return commentService.getAllComments(messageId);
	}
	
	@POST
	public Comment addMessage(@PathParam("messageId") {
		
	}
	
	@GET
	@Path("/{commentId}")
	public String test2(@PathParam("commentId")long commentId,@PathParam("messageID")long messageID) {
		return "return of method test2 in commentID is: " + commentId + "messageId is: "+ messageID;
	}

}
