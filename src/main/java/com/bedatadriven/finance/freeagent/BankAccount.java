package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class BankAccount extends GenericJson {

  @Key
  private String url;

  @Key
  private String name;

  @Key
  private String currency;

  @Key
  private String status;

  public long getId() {
    return FreeAgentId.fromUrl(url);
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean isActive() {
    return "active".equals(status);
  }
}
