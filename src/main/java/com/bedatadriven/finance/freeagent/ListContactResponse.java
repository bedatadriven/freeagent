package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class ListContactResponse extends GenericJson {

  @Key
  private List<Contact> contacts;

  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }
}
