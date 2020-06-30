package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

import java.math.BigDecimal;

public class JournalEntry extends GenericJson {

  @Key
  private String url;

  @Key
  private String category;

  @Key("debit_value")
  @JsonString
  private BigDecimal debitValue;

  @Key
  private String user;

  @Key
  private String description;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public BigDecimal getDebitValue() {
    return debitValue;
  }

  public void setDebitValue(BigDecimal debitValue) {
    this.debitValue = debitValue;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
