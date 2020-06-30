package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class JournalSetResponse extends GenericJson {

  @Key("journal_set")
  private JournalSet journalSet;


  public JournalSetResponse(JournalSet journalSet) {
    this.journalSet = journalSet;
  }

  public JournalSetResponse() {
  }

  public JournalSet getJournalSet() {
    return journalSet;
  }

  public void setJournalSet(JournalSet journalSet) {
    this.journalSet = journalSet;
  }

}
