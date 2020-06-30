package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class BankTransactionResponse extends GenericJson {

  @Key("bank_transaction")
  private BankTransaction bankTransaction;

  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }

  public void setBankTransaction(BankTransaction bankTransaction) {
    this.bankTransaction = bankTransaction;
  }
}
