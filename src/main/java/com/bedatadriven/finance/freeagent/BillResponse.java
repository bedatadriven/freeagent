package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class BillResponse extends GenericJson {

  @Key
  private Bill bill;

  public BillResponse() {
  }

  public BillResponse(Bill bill) {
    this.bill = bill;
  }

  public Bill getBill() {
    return bill;
  }

  public void setBill(Bill bill) {
    this.bill = bill;
  }
}
