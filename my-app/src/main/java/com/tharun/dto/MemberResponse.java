package com.tharun.dto;
 
public class MemberResponse {
  private Response response;

  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

  public static class Response {
    private int count;
    private String status;

    public int getId() {
      return count;
    }

    public void setId(int id) {
      this.count = id;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

  }

  public static class MemberDetailsResponse extends Response {
    private Member member;

    public Member getMember() {
      return member;
    }

    public void setMember(Member member) {
      this.member = member;
    }
  }

  public static class Member {
    private int id;
    private String name;
    private String whitelabel_support_email;
    private String reselling_description;

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

    public String getWhitelabel_support_email() {
      return whitelabel_support_email;
    }

    public void setWhitelabel_support_email(String whitelabel_support_email) {
      this.whitelabel_support_email = whitelabel_support_email;
    }

    public String getReselling_description() {
      return reselling_description;
    }

    public void setReselling_description(String reselling_description) {
      this.reselling_description = reselling_description;
    }

  }

}
