package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.Key;

import java.math.BigDecimal;

public class Bill extends GenericJson {

  @Key
  private String url;

  @Key
  private String contact;

  @Key
  private String category;

  @Key
  private String reference;

  @Key("dated_on")
  private String datedOn;

  @Key("due_on")
  private String dueOn;

  @Key
  private String currency;

  @Key("total_value") @JsonString
  private BigDecimal totalValue;

  @Key
  private String comments;

  @Key("due_value") @JsonString
  private BigDecimal dueValue;

  @Key("sales_tax_value") @JsonString
  private BigDecimal salesTaxValue;

  @Key("sales_tax_rate") @JsonString
  private BigDecimal salesTaxRate;

  @Key
  private String status;

  @Key("rebill_type")
  private String rebillType;

  @Key
  private String rebillFactor;

  @Key
  private String rebillToProject;

  @Key("rebilled_on_invoice_item")
  private String rebilledOnInvoiceItem;

  @Key("updated_at")
  private DateTime updatedAt;

  @Key("created_at")
  private DateTime createdAt;


  @Key
  private Attachment attachment;

  public long getId() {
    return FreeAgentId.fromUrl(url);
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getDatedOn() {
    return datedOn;
  }

  public void setDatedOn(String datedOn) {
    this.datedOn = datedOn;
  }

  public String getDueOn() {
    return dueOn;
  }

  public void setDueOn(String dueOn) {
    this.dueOn = dueOn;
  }

  public BigDecimal getSalesTaxRate() {
    return salesTaxRate;
  }

  public void setSalesTaxRate(BigDecimal salesTaxRate) {
    this.salesTaxRate = salesTaxRate;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(BigDecimal totalValue) {
    this.totalValue = totalValue;
  }

  public BigDecimal getDueValue() {
    return dueValue;
  }

  public void setDueValue(BigDecimal dueValue) {
    this.dueValue = dueValue;
  }

  public BigDecimal getSalesTaxValue() {
    return salesTaxValue;
  }

  public void setSalesTaxValue(BigDecimal salesTaxValue) {
    this.salesTaxValue = salesTaxValue;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getRebillType() {
    return rebillType;
  }

  public void setRebillType(String rebillType) {
    this.rebillType = rebillType;
  }

  public String getRebillFactor() {
    return rebillFactor;
  }

  public void setRebillFactor(String rebillFactor) {
    this.rebillFactor = rebillFactor;
  }

  public String getRebillToProject() {
    return rebillToProject;
  }

  public void setRebillToProject(String rebillToProject) {
    this.rebillToProject = rebillToProject;
  }

  public String getRebilledOnInvoiceItem() {
    return rebilledOnInvoiceItem;
  }

  public void setRebilledOnInvoiceItem(String rebilledOnInvoiceItem) {
    this.rebilledOnInvoiceItem = rebilledOnInvoiceItem;
  }

  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public DateTime getCreatedAt() {
    return createdAt;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }
}
