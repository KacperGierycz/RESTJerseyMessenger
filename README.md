# RESTJerseyMessenger

It's a REST implementation of a Jersey Java EE of a messenger application.

Overview
The REST API is set up to receive and send JSON payload and save it in a database(in memory HashTable for simplicity).
Endpoints are Profile, Message, Comment use of REST API naming convention.
<br>
Giving links with content for the front end to the process.
<br>
There are Users(Profile) who post Messages, other users can Comment.

Application is listening for JSON MediaType.
All CRUD operations are available.

#How to run:
To run this Jersey keep the most careful attention to exact POM dependencies, JRE Java 1.7, Server Tomcat 9, Eclipse Version 2020-09 (4.17.0).
Well there can be a lot that can be mismatch it's not a SpringBoot, all these technologies are developed separately but are supporting one other
<br>
I was about to write the README since morning but the application just didn't start Tomcat couldn't start the servlet.
This is how I figure out how Jersey development can be a Road Throo Hell. 
Spend all morning to sort this bug out found some useful information online [be a developer to developer guide](http://itsystemengineer.blogspot.com/2017/09/restful-api-jax-rs-jersey-2-on-tomcat-9.html)
 and one [from Tomcat itself](http://tomcat.apache.org/whichversion.html).

Jersey is a wonderful system and the effects are great but have to be careful at setup.

<br>

# How it works:

* Tomcat is handling the servlet responding to requests via http//domain/messenger/web API stated in web.xml
* Main models: Profile, Message, Comment; messages are holding links to URI with fields setters and getters
* Resources are handling the CRUD request and posting responses with a call to services they are the most important will describe in detail later on
* Services are the connectors between the database's custom logics and Resouces they are responding to.
* Database is a simple device of HashMaps in memory
* Custom Exception handlers for data no found ex." Not found"
* Links are deployed after getting to messages explanation later on

# The Resources 
resources are using javax.ws.rs. annotations 
@Path(/messages)
@Comsumes @Produces (MediaType.App..Jason)
injecting service
@GET,@POST,@PUT,@DELETE,@PUT
on singel once with ID @PATH(/{messageId}) then in method paramether @PathParam ("messageId")
when there is a response in method paramether @Context UriInfo to Response.create(uri) from uri.getPath...

# Creation of Links happens in Resource when a call to get message Strings are invoking get Uri Self, Profile, Comments and putting them into the message. 
GetUrifor gets UriInfo , and builds URI with URI builder and path.


![get message](https://user-images.githubusercontent.com/57790974/132459066-120b03fa-5880-492b-8c3d-1dbfc481517e.jpg)







