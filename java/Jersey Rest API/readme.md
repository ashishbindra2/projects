## Tools & Technology
- Eclipse IDE EE Version: 2021-03 (4.19.0).
- Maven
- jersey 1.19.4/3.0.3

# Annotation
 + @path() 
# Error
- The superclass "javax.servlet.http.HttpServlet" was not found on the Java Build Path
-  right click on project, go to property,select taget runtime slect server(tomcat)
-  HTTP Status 500 – Internal Server Error --> use this @Produces(MediaType.APPLICATION_XML)
-  SEVERE: MessageBodyWriter not found for media type=application/xml--> use this @XmlRootElement
-  if not solve use following given dependency
-  <dependency>
 <groupId>jakarta.xml.bind</groupId>
 <artifactId>jakarta.xml.bind-api</artifactId>
 <version>3.0.1</version>
</dependency>

<dependency>
 <groupId>org.glassfish.jersey.media</groupId>
 <artifactId>jersey-media-jaxb</artifactId>
</dependency>
 
<dependency>
 <groupId>com.sun.xml.bind</groupId>
 <artifactId>jaxb-osgi</artifactId>
 <version>3.0.1</version>
</dependency>
-


# Warrning
+ WARNING: The following warnings have been detected: WARNING: A resource, Resource{"students", 0 child resources, 0 resource methods, 0 sub-resource locator, 0 method handler classes, 0 method handler instances}, with path "students" is empty. It has no resource (or sub resource) methods neither sub resource locators defined.
+ use @GET for above error solution.
+ 

# port
- open apachi folder 
- open conf folder
- open server.xml file 
- changer port throgh connector port

# Rest API
- if you want to send state of object as jason/xml.
- we can send request and get reponse
- A RESTful API is an architectural style for an application program interface (API) that uses HTTP requests to access and use data. That data can be used to GET, PUT, POST and DELETE data types, which refers to the reading, updating, creating and deleting of operations concerning resources
- jersey & Sparing for implentation 
-  ## HTTP Method
 + C -> Create -> POST
 + R -> Read -> GET
 + U -> Update -> PUT
 + D -> Delete -> DELETE
- Rest is just concept 

# MySQL 

# Jersey
-JAX-RS is an specification (just a definition) and Jersey is a JAX-RS implementation. Jersey framework is more than the JAX-RS Reference Implementation. Jersey provides its own API that extend the JAX-RS toolkit with additional features and utilities to further simplify RESTful service and client development.


