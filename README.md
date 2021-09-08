# RESTJerseyMessenger

It's a REST implementation of a Jersey Java EE of a messenger application.

Overview
The REST API is set up to receive and send JSON payload and save it in a database(in memory HashTable for simplicity).
End points are Profile,Message,Comment use of REST API naming convention.
<br>
Giving links with content for front end to process.
<br>
There are Users(Profile) they post Messages, other users can Comment.

Application is listening for JSON MediaType.
All CRUD opperation aviable.

#How to runn:
To runn this Jersey keep the moste cerefull attention to exact POM dependencies, JRE Java 1.7, Server Tomcat 9, Eclipse Version 2020-09 (4.17.0).
Well there can be a lot that can be mismach it's not a SpringBoot, all this tecnologies are develop separatly but are supporting one eachother
<br>
I was obout to write the README since morning but the application just did't start Tomcat coldn't start servlet.
This is how I figure out how Jersey development can be a Road Throo Hell. 
Spend all morning to sort this bug out found some usefull information online [be developer to developer guide](http://itsystemengineer.blogspot.com/2017/09/restful-api-jax-rs-jersey-2-on-tomcat-9.html)
 and one [from Tomcat itself](http://tomcat.apache.org/whichversion.html).

Jersey is a wonderful system and the efects are great but have to be carefull at setup.

<br>

# How it works:

* Tomcat is handling the servlet responding to requests via http//domain/messenger/webapi stated in web.xml
* Main models Profile,Message,Comments; messages are holding links to URI with fields setters and getters
* Resources are handling the CRUD request and posting responses with call to services they are the most importatnt will describe in details later on
* Services are the connectors between the databases custom logics and Resouces they are responding.
* Database is a simple device of HashMaps in memory
* Custom Exception hanlers for data no found ex." Not found"
* Links are deployed after get to messages explanation later on







