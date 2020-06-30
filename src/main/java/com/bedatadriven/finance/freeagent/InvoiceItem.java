package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

import java.math.BigDecimal;

public class InvoiceItem extends GenericJson {

  @Key
  private String url;


  @Key
  private int position;

  @Key("item_type")
  private String itemType;

  @Key @JsonString
  private BigDecimal quantity;

  @Key
  private String description;

  @Key @JsonString
  private BigDecimal price;

  @Key("sales_tax_rate")
  private String salesTaxRate;

  @Key
  private String category;

  @Key
  private String project;


  public String getDescription() {
    return description;
  }

  public String getUrl() {
    return url;
  }

  public int getPosition() {
    return position;
  }

  public String getItemType() {
    return itemType;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  /**
   * The unit price
   */
  public BigDecimal getPrice() {
    return price;
  }

  public String getSalesTaxRate() {
    return salesTaxRate;
  }

  public String getCategory() {
    return category;
  }

  public String getProject() {
    return project;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setSalesTaxRate(String salesTaxRate) {
    this.salesTaxRate = salesTaxRate;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setProject(String project) {
    this.project = project;
  }




}
