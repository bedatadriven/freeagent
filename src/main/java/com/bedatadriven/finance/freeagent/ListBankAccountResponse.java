package com.bedatadriven.finance.freeagent;

import com.google.api.client.util.Key;

import java.util.List;

public class ListBankAccountResponse {


  @Key("bank_accounts")
  private List<BankAccount> bankAccounts;

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }
}
