package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class InvoiceItemList extends GenericJson {

  @Key
  private List<InvoiceItem> items;

  public InvoiceItemList(List<InvoiceItem> items) {
    this.items = items;
  }

  public List<InvoiceItem> getItems() {
    return items;
  }

  public void setItems(List<InvoiceItem> items) {
    this.items = items;
  }


}
