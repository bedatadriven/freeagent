package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class ListCategoryResponse extends GenericJson {

  @Key("admin_expenses_categories")
  private List<Category> admin;

  @Key("cost_of_sales_categories")
  private List<Category> costOfSales;

  @Key("income_categories")
  private List<Category> income;

  @Key("general_categories")
  private List<Category> general;

  public List<Category> getAdmin() {
    return admin;
  }

  public List<Category> getCostOfSales() {
    return costOfSales;
  }

  public List<Category> getIncome() {
    return income;
  }

  public List<Category> getGeneral() {
    return general;
  }
}
