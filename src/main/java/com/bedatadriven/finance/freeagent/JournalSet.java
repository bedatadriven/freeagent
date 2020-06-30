package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

public class JournalSet extends GenericJson {

  private String url;

  @Key("dated_on")
  private String datedOn;

  @Key
  private String description;


  @Key("journal_entries")
  private List<JournalEntry> entries;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDatedOn() {
    return datedOn;
  }

  public void setDatedOn(String datedOn) {
    this.datedOn = datedOn;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<JournalEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<JournalEntry> entries) {
    this.entries = entries;
  }
}
