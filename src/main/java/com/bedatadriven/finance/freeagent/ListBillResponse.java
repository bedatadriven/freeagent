package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class ListBillResponse extends GenericJson {

  @Key
  private List<Bill> bills;

  public List<Bill> getBills() {
    return bills;
  }

  public void setBills(List<Bill> bills) {
    this.bills = bills;
  }
}
