package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.ArrayList;
import java.util.List;

public class Statement extends GenericJson {

  @Key
  private List<StatementTransaction> statement;

  public Statement() {
  }

  public Statement(List<StatementTransaction> statement) {
    this.statement = statement;
  }

  public List<StatementTransaction> getStatement() {
    return statement;
  }

  public void add(StatementTransaction transaction) {
    if(statement == null) {
      statement = new ArrayList<>();
    }
    statement.add(transaction);
  }
}
