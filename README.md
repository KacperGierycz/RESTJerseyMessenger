# RESTJerseyMessenger

It's a REST implementation of a Jersey Java EE of a messenger application.

Overview
The REST API is set up to receive JSON payload and save it in a database(in memory HashTable for simplicity).
<br>
Giving links with content for front end to process.
<br>
There are Users(Profile) they post Messages, other users can Comment.

Application is listening for JSON MediaType.
All CRUD opperation aviable.

How to runn:
To runn this Jersey keep the moste cerefull attention to exact POM dependencies, JRE Java 1.7, Server Tomcat 9, Eclipse Version 2020-09 (4.17.0).
Well there can be a lot that can be mismach it's not a SpringBoot, all this tecnologies are develop separatly but are supporting one eachother there is a version mismach.
<br>
I was obout to write the README since morning but the application just did't start Tomcat coldn't start servlet.
This is how I figure out how Jersey development can be a Road Throo Hell. 
Yes found some usefull information online [be developer to developer guide](http://itsystemengineer.blogspot.com/2017/09/restful-api-jax-rs-jersey-2-on-tomcat-9.html)
 and one [from Tomcat itself](http://tomcat.apache.org/whichversion.html).

On soving the bug wich ocured from nowhere whene I was about to runn for a README writing purposes. Suddenly the Jersye was using it's version from the other bundle
