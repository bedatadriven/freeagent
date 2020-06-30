package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class ListBankTransactionResponse extends GenericJson {

  @Key("bank_transactions")
  private List<BankTransaction> transactions;

  public List<BankTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<BankTransaction> transactions) {
    this.transactions = transactions;
  }
}

