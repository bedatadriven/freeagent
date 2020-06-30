package com.bedatadriven.finance.freeagent;

public class FreeAgentId {
  public static long fromUrl(String url) {
    int finalSlash = url.lastIndexOf('/');
    String id = url.substring(finalSlash + 1);
    return Long.parseLong(id);
  }
}
