package com.tharun.client;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.tharun.dto.Employee;
 
 
public class JsonClient {
 
  public static void main(String[] args) throws JsonParseException, JsonMappingException, ClientHandlerException, UniformInterfaceException, IOException {
    Client client = Client.create();
    //Get
    WebResource webResource = client.resource("http://localhost:9999/employee/getEmployee");
    ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
    if (response.getStatus() != 200) {
       throw new RuntimeException("Failed : HTTP error code : "
      + response.getStatus());
    }
    ObjectMapper mapper = new ObjectMapper();
   Employee e =  mapper.readValue(response.getEntity(String.class), Employee.class);
    System.out.println("Output json client .... \n");
    System.out.println(e);
    //Post
    String emp = mapper.writeValueAsString(e);
    webResource = client.resource("http://localhost:9999/employee/postEmployee");
    webResource.accept("application/json").post(ClientResponse.class, emp);    
  }
}