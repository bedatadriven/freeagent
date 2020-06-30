package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StatementTransaction extends GenericJson {


  @Key("dated_on")
  private String datedOn;

  @Key @JsonString
  private BigDecimal amount;

  @Key
  private String description;

  public StatementTransaction() {
  }

  public StatementTransaction(LocalDate datedOn, BigDecimal amount, String description) {
    this.datedOn = datedOn.toString();
    this.amount = amount;
    this.description = description;
  }

  public String getDatedOn() {
    return datedOn;
  }

  public void setDatedOn(String datedOn) {
    this.datedOn = datedOn;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
