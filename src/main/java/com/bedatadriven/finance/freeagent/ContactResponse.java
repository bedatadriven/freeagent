package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class ContactResponse extends GenericJson {

  @Key
  private Contact contact;

  public ContactResponse() {
  }

  public ContactResponse(Contact contact) {
    this.contact = contact;
  }

  public Contact getContact() {
    return contact;
  }

}
