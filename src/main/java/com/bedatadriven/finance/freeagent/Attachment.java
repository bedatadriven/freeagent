package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Key;
import com.google.common.io.ByteSource;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class Attachment extends GenericJson {

  @Key
  private String url;

  @Key("content_src")
  private String contentSource;

  @Key("content_type")
  private String contentType;

  @Key("file_name")
  private String filename;

  @Key("file_size")
  private long fileSize;

  /**
   * binary data of the file being attached encoded as base64
   */
  @Key
  private String data;


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getContentSource() {
    return contentSource;
  }

  public void setContentSource(String contentSource) {
    this.contentSource = contentSource;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public long getFileSize() {
    return fileSize;
  }

  public void setFileSize(long fileSize) {
    this.fileSize = fileSize;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public void setData(File file) throws IOException {
    setData(Files.asByteSource(file));
  }

  public void setData(ByteSource byteSource) throws IOException {
    this.data = Base64.encodeBase64String(byteSource.read());
  }

  public void setData(byte[] data) throws IOException {
    setData(ByteSource.wrap(data));
  }
}
