package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

import java.math.BigDecimal;
import java.util.List;

public class BankTransaction extends GenericJson {

  @Key
  private String url;

  @Key @JsonString
  private BigDecimal amount;

  @Key("bank_account")
  private String bankAccountUrl;

  @Key("dated_on")
  private String datedOn;

  @Key
  private String description;

  @Key("unexplained_amount") @JsonString
  private BigDecimal unexplainedAmount;

  @Key("is_manual")
  private boolean manual;

  @Key("bank_transaction_explanations")
  private List<Explanation> explanations;


  public String getUrl() {
    return url;
  }

  public long getId() {
    return FreeAgentId.fromUrl(getUrl());
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getBankAccountUrl() {
    return bankAccountUrl;
  }

  public void setBankAccountUrl(String bankAccountUrl) {
    this.bankAccountUrl = bankAccountUrl;
  }

  public String getDatedOn() {
    return datedOn;
  }

  public void setDatedOn(String datedOn) {
    this.datedOn = datedOn;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getUnexplainedAmount() {
    return unexplainedAmount;
  }

  public void setUnexplainedAmount(BigDecimal unexplainedAmount) {
    this.unexplainedAmount = unexplainedAmount;
  }

  public boolean isManual() {
    return manual;
  }

  public void setManual(boolean manual) {
    this.manual = manual;
  }

  public List<Explanation> getExplanations() {
    return explanations;
  }
}
