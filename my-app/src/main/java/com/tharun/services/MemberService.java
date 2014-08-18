package com.tharun.services;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import com.tharun.dto.MemberResponse;

 
@Path("/member")
public class MemberService {
  @GET
  @Path("/getMember")
  @Produces(MediaType.APPLICATION_JSON)
  public MemberResponse status(@Context Request request, @CookieParam(value = "name") String localLastVisited) {
    System.out.println(localLastVisited);
    
    MemberResponse memberResponse = new MemberResponse();
    MemberResponse.MemberDetailsResponse response = new MemberResponse.MemberDetailsResponse();
    response.setStatus("OK");
    memberResponse.setResponse(response);
    MemberResponse.Member data = new MemberResponse.Member();
    data.setId(4114);
    data.setName("Tharun Tej");
    response.setMember(data);
    return memberResponse;
  }
}
