package org.shian.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// when extending the Application, the app will take care of setting up
// servlet, uri mapping. This is the same as having a web.xml, but it is 
// simpler; the api path will be webapi/*
@ApplicationPath("webapi")
public class MyApp extends Application{
	
}
