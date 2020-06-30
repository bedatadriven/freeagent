package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

import java.math.BigDecimal;
import java.util.List;

public class Invoice extends GenericJson {

  @Key
  private String url;

  @Key
  private String reference;

  @Key
  private String status;

  @Key
  private String contact;

  @Key
  private String project;

  @Key("dated_on")
  private String datedOn;

  @Key("due_on")
  private String dueOn;

  @Key
  private String currency;

  @Key
  private String comments;

  @Key("client_contact_name")
  private String clientContactName;

  @Key("net_value")
  @JsonString
  private BigDecimal netValue;

  @Key("exchange_rate")
  @JsonString
  private BigDecimal exchangeRage;

  @Key("total_value")
  @JsonString
  private BigDecimal totalValue;

  @Key("paid_value")
  @JsonString
  private BigDecimal paidValue;

  @Key("due_value")
  @JsonString
  private BigDecimal dueValue;

  @Key("created_at")
  @JsonString
  private String createdAt;

  @Key("updated_at")
  @JsonString
  private String updatedAt;

  @Key("invoice_items")
  private List<InvoiceItem> items;

  @Key("payment_terms_in_days")
  private int paymentTermsInDays;

  @Key("involves_sales_tax")
  private boolean involvesSalesTax;

  public String getUrl() {
    return url;
  }

  public String getStatus() {
    return status;
  }

  public String getContact() {
    return contact;
  }

  public String getProject() {
    return project;
  }

  public String getDatedOn() {
    return datedOn;
  }

  public String getDueOn() {
    return dueOn;
  }

  public String getCurrency() {
    return currency;
  }

  public String getComments() {
    return comments;
  }

  public String getClientContactName() {
    return clientContactName;
  }

  public BigDecimal getNetValue() {
    return netValue;
  }

  public BigDecimal getExchangeRage() {
    return exchangeRage;
  }

  public BigDecimal getTotalValue() {
    return totalValue;
  }

  public BigDecimal getPaidValue() {
    return paidValue;
  }

  public BigDecimal getDueValue() {
    return dueValue;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public List<InvoiceItem> getItems() {
    return items;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public void setDatedOn(String datedOn) {
    this.datedOn = datedOn;
  }

  public void setDueOn(String dueOn) {
    this.dueOn = dueOn;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public void setClientContactName(String clientContactName) {
    this.clientContactName = clientContactName;
  }

  public void setNetValue(BigDecimal netValue) {
    this.netValue = netValue;
  }

  public void setExchangeRage(BigDecimal exchangeRage) {
    this.exchangeRage = exchangeRage;
  }

  public void setTotalValue(BigDecimal totalValue) {
    this.totalValue = totalValue;
  }

  public void setPaidValue(BigDecimal paidValue) {
    this.paidValue = paidValue;
  }

  public void setDueValue(BigDecimal dueValue) {
    this.dueValue = dueValue;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setItems(List<InvoiceItem> items) {
    this.items = items;
  }

  public String getReference() {
    return reference;
  }

  public boolean isInvolvesSalesTax() {
    return involvesSalesTax;
  }

  public void setInvolvesSalesTax(boolean involvesSalesTax) {
    this.involvesSalesTax = involvesSalesTax;
  }
}

