package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class InvoiceResponse extends GenericJson {

  @Key
  private Invoice invoice;

  public InvoiceResponse(Invoice invoice) {
    this.invoice = invoice;
  }

  public InvoiceResponse() {
  }

  public Invoice getInvoice() {
    return invoice;
  }
}
