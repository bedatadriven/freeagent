package com.bedatadriven.finance.freeagent;

import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.json.JsonHttpContent;

import java.io.IOException;

public class FreeAgentRequest<T> extends AbstractGoogleClientRequest<T> {

  public FreeAgentRequest(
    FreeAgent client, String method, String uriTemplate, Object content, Class<T> responseClass) {
    super(
      client,
      method,
      uriTemplate,
      jsonContent(client, content),
      responseClass);
    getRequestHeaders().setAccept("application/json");
    setDisableGZipContent(true);
  }

  private static HttpContent jsonContent(FreeAgent client, Object content) {
    if(content == null) {
      return null;
    }
    JsonHttpContent httpContent = new JsonHttpContent(client.getJsonFactory(), content);
    httpContent.setMediaType(new HttpMediaType("application/json"));
    return httpContent;
  }

  @Override
  protected GoogleJsonResponseException newExceptionOnError(HttpResponse response) {
    GoogleJsonError errorObject = new GoogleJsonError();
    try {
      errorObject.setMessage(response.parseAsString());
    } catch (IOException e) {
      errorObject.setMessage("");
    }
    return new GoogleJsonResponseException(new HttpResponseException.Builder(
      response.getStatusCode(),
      response.getStatusMessage(),
      response.getHeaders())
      .setMessage(errorObject.getMessage()), errorObject);
  }
}
