package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class FreeAgentUser extends GenericJson {

  public static final String EMPLOYEE_ROLE = "Employee";

  @Key
  private String url;

  @Key
  private String email;

  @Key("first_name")
  private String firstName;

  @Key("last_name")
  private String lastName;

  @Key("role")
  private String role;


  public String getUrl() {
    return url;
  }

  public String getEmail() {
    return email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getRole() {
    return role;
  }
}
