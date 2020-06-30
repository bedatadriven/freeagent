package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class ExplanationResponse extends GenericJson {

  @Key("bank_transaction_explanation")
  private Explanation bankTransactionExplanation;

  public ExplanationResponse() {
  }

  public ExplanationResponse(Explanation explanation) {
    this.bankTransactionExplanation = explanation;
  }

  public Explanation getBankTransactionExplanation() {
    return bankTransactionExplanation;
  }

  public void setBankTransactionExplanation(Explanation bankTransactionExplanation) {
    this.bankTransactionExplanation = bankTransactionExplanation;
  }
}
