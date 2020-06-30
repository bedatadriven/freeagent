package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class Category extends GenericJson {
  @Key
  private String url;

  @Key
  private String description;

  @Key("nominal_code")
  private String nominalCode;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getNominalCode() {
    return nominalCode;
  }

  public void setNominalCode(String nominalCode) {
    this.nominalCode = nominalCode;
  }
}
