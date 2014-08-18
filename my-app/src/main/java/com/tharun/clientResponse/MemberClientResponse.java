package com.tharun.clientResponse;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "response")
public class MemberClientResponse {
  private Response response;

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Response {
    private String status;

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    private Member member;

    public Member getMember() {
      return member;
    }

    public void setMember(Member member) {
      this.member = member;
    }

    @Override
    public String toString() {
      return "Response [status=" + status + ", member=" + member + "]";
    }

  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Member {
    private int id;
    private String name;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return "  [id=" + id + ", name=" + name + "]";
    }

  }

  @Override
  public String toString() {
    return "MemberServiceResponse [response=" + response + "]";
  }

  
}