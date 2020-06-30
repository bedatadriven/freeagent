package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

import java.math.BigDecimal;

public class Explanation extends GenericJson {
  @Key
  private String url;

  @Key("bank_account")
  private String bankAccount;

  @Key("bank_transaction")
  private String bankTransaction;

  @Key
  private String type;

  @Key("dated_on")
  private String datedOn;

  /**
   * Value of the explanation in the company's native currency
   */
  @Key("gross_value") @JsonString
  private BigDecimal grossValue;

  @Key("sales_tax_rate") @JsonString
  private BigDecimal salesTaxRate;

  @Key("manual_sales_tax_amount") @JsonString
  private BigDecimal manualSalesTaxAmount;

  @Key
  private String description;

  @Key
  private String category;

  @Key
  private Attachment attachment;

  @Key("paid_bill")
  private String paidBill;

  @Key("foreign_currency_value") @JsonString
  private BigDecimal foreignCurrencyValue;

  @Key("transfer_bank_account")
  private String transferBankAccount;

  @Key("paid_invoice")
  private String paidInvoice;

  @Key("paid_user")
  private String paidUser;

  @Key("marked_for_review")
  private boolean markedForReview;

  public String getUrl() {
    return url;
  }

  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }

  public String getBankTransaction() {
    return bankTransaction;
  }

  public void setBankTransaction(String bankTransaction) {
    this.bankTransaction = bankTransaction;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDatedOn() {
    return datedOn;
  }

  public void setDatedOn(String datedOn) {
    this.datedOn = datedOn;
  }

  public BigDecimal getGrossValue() {
    return grossValue;
  }

  public void setGrossValue(BigDecimal grossValue) {
    this.grossValue = grossValue;
  }

  public BigDecimal getSalesTaxRate() {
    return salesTaxRate;
  }

  public void setSalesTaxRate(BigDecimal salesTaxRate) {
    this.salesTaxRate = salesTaxRate;
  }

  public BigDecimal getManualSalesTaxAmount() {
    return manualSalesTaxAmount;
  }

  public void setManualSalesTaxAmount(BigDecimal manualSalesTaxAmount) {
    this.manualSalesTaxAmount = manualSalesTaxAmount;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Attachment getAttachment() {
    return attachment;
  }

  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }

  public String getPaidBill() {
    return paidBill;
  }

  public void setPaidBill(String paidBill) {
    this.paidBill = paidBill;
  }

  public BigDecimal getForeignCurrencyValue() {
    return foreignCurrencyValue;
  }

  public void setForeignCurrencyValue(BigDecimal foreignCurrencyValue) {
    this.foreignCurrencyValue = foreignCurrencyValue;
  }

  public String getTransferBankAccount() {
    return transferBankAccount;
  }

  public void setTransferBankAccount(String transferBankAccount) {
    this.transferBankAccount = transferBankAccount;
  }

  public String getPaidInvoice() {
    return paidInvoice;
  }

  public void setPaidInvoice(String paidInvoice) {
    this.paidInvoice = paidInvoice;
  }

  public String getPaidUser() {
    return paidUser;
  }

  public void setPaidUser(String paidUser) {
    this.paidUser = paidUser;
  }

  public boolean isMarkedForReview() {
    return markedForReview;
  }

  public void setMarkedForReview(boolean markedForReview) {
    this.markedForReview = markedForReview;
  }
}
