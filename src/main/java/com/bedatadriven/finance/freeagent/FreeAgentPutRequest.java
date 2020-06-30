package com.bedatadriven.finance.freeagent;

import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;

import java.io.IOException;

public class FreeAgentPutRequest extends AbstractGoogleClientRequest<Void> {

  public FreeAgentPutRequest(
    FreeAgent client, String method, String uriTemplate) {
    super(
      client,
      method,
      uriTemplate,
      new EmptyContent(),
      Void.class);
    getRequestHeaders().setAccept("application/json");
    setDisableGZipContent(true);
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
