package com.bedatadriven.finance.freeagent;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class Contact extends GenericJson {

  @Key
  private String url;

  @Key
  private String email;

  @Key("organisation_name")
  private String organizationName;

  @Key("first_name")
  private String firstName;

  @Key("last_name")
  private String lastName;

  @Key("country")
  private String country;

  @Key
  private String status;

  @Key("sales_tax_registration_number")
  private String salesTaxRegistrationNumber;

  /**
   * First line of the address
   */
  @Key
  private String address1;

  @Key
  private String address2;

  @Key
  private String address3;

  @Key
  private String town;

  @Key
  private String region;

  @Key
  private String postcode;

  public String getUrl() {
    return url;
  }

  public long getId() {
    return FreeAgentId.fromUrl(url);
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSalesTaxRegistrationNumber() {
    return salesTaxRegistrationNumber;
  }

  public void setSalesTaxRegistrationNumber(String salesTaxRegistrationNumber) {
    this.salesTaxRegistrationNumber = salesTaxRegistrationNumber;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }
}
