package com.tharun.client;

import java.io.IOException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.tharun.clientResponse.MemberClientResponse;

public class MemberServiceClient {
public static void main(String args[]) throws JsonParseException, JsonMappingException, ClientHandlerException, UniformInterfaceException, IOException
{
  Client client = Client.create();
  //Get
 
  WebResource webResource = client.resource("http://localhost:9999/member/getMember");
  WebResource.Builder builder = webResource.getRequestBuilder();
  NewCookie c = new NewCookie("name", "Hello_world!");
   
      builder = builder.cookie(c);
   
  
  
  
  ClientResponse response = builder.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
  if (response.getStatus() != 200) {
    throw new RuntimeException("Failed : HTTP error code : "
   + response.getStatus());
 }
 ObjectMapper mapper = new ObjectMapper();
 String repsonseString = response.getEntity(String.class);
// MemberClientResponse resp = mapper.readValue(repsonseString , MemberClientResponse.class);
 System.out.println("Output Member Client :"+repsonseString);
 System.out.println(repsonseString);
  
}
}
