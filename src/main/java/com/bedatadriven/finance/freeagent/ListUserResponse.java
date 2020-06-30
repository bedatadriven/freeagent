package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class ListUserResponse extends GenericJson {

  @Key
  private List<FreeAgentUser> users;

  public ListUserResponse() {
  }

  public ListUserResponse(List<FreeAgentUser> users) {
    this.users = users;
  }

  public List<FreeAgentUser> getUsers() {
    return users;
  }

  public void setUsers(List<FreeAgentUser> users) {
    this.users = users;
  }
}
