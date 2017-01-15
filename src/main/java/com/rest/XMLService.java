package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


//to return a XML file, annotated the service method with @Produces("application/xml")
//RESTEasy will convert the JAXB annotated object into XML file, and return back to the client


@Path("/xml/user")
public class XMLService {

	@GET
	@Path("/get")
	@Produces("application/xml")
	public User getUserInXML() {

		User user = new User();
		user.setUsername("nabil");
		user.setPassword("password");
		user.setPin(123456);
		
		return user; 

	}

}

//when run on tomcat add this xml/user/get to the url to see the xml return data