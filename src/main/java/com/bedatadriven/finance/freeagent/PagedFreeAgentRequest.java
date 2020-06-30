package com.bedatadriven.finance.freeagent;

import com.google.api.client.util.Key;

public class PagedFreeAgentRequest<I, T extends ListResponse<I>> extends FreeAgentRequest<T> {
  @Key
  protected int page;

  @Key("per_page")
  protected int perPage;

  public PagedFreeAgentRequest(FreeAgent client, String method, String uriTemplate, Object content, Class<T> responseClass) {
    super(client, method, uriTemplate, content, responseClass);
  }


  public PagedFreeAgentRequest<I, T> setPage(int pageNumber) {
    this.page = pageNumber;
    return this;
  }

  public PagedFreeAgentRequest<I, T> setPerPage(int count) {
    this.perPage = page;
    return this;
  }

}
