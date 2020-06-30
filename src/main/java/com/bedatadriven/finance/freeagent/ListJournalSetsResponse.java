package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class ListJournalSetsResponse extends GenericJson {

  @Key("journal_sets")
  private List<JournalSet> journalSets;

  public List<JournalSet> getJournalSets() {
    return journalSets;
  }
}
