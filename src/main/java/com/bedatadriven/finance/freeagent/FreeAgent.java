package com.bedatadriven.finance.freeagent;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;

import java.io.IOException;
import java.time.LocalDate;

public class FreeAgent extends AbstractGoogleJsonClient {

  public static final GenericUrl TOKEN_SERVER_URL = new GenericUrl("https://api.freeagent.com/v2/token_endpoint");
  public static final String AUTHORIZATION_URL = "https://api.freeagent.com/v2/approve_app";

  public static class Builder extends AbstractGoogleJsonClient.Builder {

    private static final String ROOT_URL = "https://api.freeagent.com/";
    private static final String SERVICE_PATH = "v2/";

    /**
     * @param transport              HTTP transport
     * @param jsonFactory            JSON factory
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
      super(transport, jsonFactory, ROOT_URL, SERVICE_PATH, httpRequestInitializer, /* legacyDataWrapper */ false);
    }

    @Override
    public FreeAgent.Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }

    @Override
    public FreeAgent build() {
      return new FreeAgent(this);
    }
  }

  private FreeAgent(Builder builder) {
    super(builder);
  }

  public class Bills {


    public class Get extends FreeAgentRequest<BillResponse> {

      @Key
      private final long id;

      private Get(long id) {
        super(FreeAgent.this, "GET", "bills/{id}", null, BillResponse.class);
        this.id = id;
      }
    }
    public class List extends FreeAgentRequest<ListBillResponse> {

      @Key
      private String contact;

      private List() {
        super(FreeAgent.this, "GET", "bills", null, ListBillResponse.class);
      }

      public List setContact(String url) {
        this.contact = url;
        return this;
      }
    }

    public class Create extends FreeAgentRequest<BillResponse> {
      public Create(Bill bill) {
        super(FreeAgent.this, "POST", "bills", new BillResponse(bill),  BillResponse.class);
      }
    }

    public Get get(long billId) {
      return new Get(billId);
    }

    public List list() {
      return new List();
    }

    public Create create(Bill bill) {
      return new Create(bill);
    }
  }

  public class BankAccounts {

    public class List extends FreeAgentRequest<ListBankAccountResponse> {

      private List() {
        super(FreeAgent.this, "GET", "bank_accounts", null, ListBankAccountResponse.class);
      }
    }

    public List list() { return new List(); }

  }

  public class BankTransactions {

    public class List extends FreeAgentRequest<ListBankTransactionResponse> {

      @Key("bank_account")
      private final long bankAccountId;

      @Key
      private String view;

      private List(long bankAccountId) {
        super(FreeAgent.this, "GET", "bank_transactions", null, ListBankTransactionResponse.class);
        this.bankAccountId = bankAccountId;
      }

      public List unexplained() {
        this.view = "unexplained";
        return this;
      }

      public List markedForReview() {
        this.view = "marked_for_review";
        return this;
      }
    }

    public class Get extends FreeAgentRequest<BankTransactionResponse> {

      @Key
      private final long id;

      private Get(long id) {
        super(FreeAgent.this, "GET", "bank_transactions/{id}", null, BankTransactionResponse.class);
        this.id = id;
      }
    }

    public class Upload extends FreeAgentRequest<Void> {
      @Key("bank_account")
      private final long bankAccountId;

      public Upload(long bankAccountId, Statement statement) {
        super(FreeAgent.this, "POST", "bank_transactions/statement", statement, Void.class);
        this.bankAccountId = bankAccountId;
      }

      @Override
      public Void execute() throws IOException {
        executeUnparsed();
        return null;
      }
    }

    public List list(long bankAccountId) {
      return new List(bankAccountId);
    }

    public Upload uploadStatement(long bankAccountId, Statement statement) {
      return new Upload(bankAccountId, statement);
    }

    public Get get(long transactionId) {
      return new Get(transactionId);
    }
  }

  public class Contacts {

    public class List extends FreeAgentRequest<ListContactResponse>  {
      @Key
      private int page;

      @Key("per_page")
      private int perPage;

      private List() {
        super(FreeAgent.this, "GET", "contacts", null, ListContactResponse.class);
      }

      public List setPage(int pageNumber) {
        this.page = pageNumber;
        return this;
      }

      public List setPerPage(int count) {
        this.perPage = page;
        return this;
      }
    }


    public class Create extends FreeAgentRequest<ContactResponse> {
      public Create(Contact contact) {
        super(FreeAgent.this, "POST", "contacts", new ContactResponse(contact), ContactResponse.class);
      }
    }

    public List list() {
      return new List();
    }

    public Create create(Contact contact) {
      return new Create(contact);
    }

  }

  public class Categories {

    public class List extends FreeAgentRequest<ListCategoryResponse>  {
      private List() {
        super(FreeAgent.this, "GET", "categories", null, ListCategoryResponse.class);
      }
    }

    public List list() {
      return new List();
    }
  }

  public class Explanations {

    public class Create extends FreeAgentRequest<ExplanationResponse> {
      public Create(Explanation explanation) {
        super(FreeAgent.this, "POST", "bank_transaction_explanations", new ExplanationResponse(explanation), ExplanationResponse.class);
      }
    }

    public class Delete extends FreeAgentRequest<Void> {

      @Key
      private final long id;

      public Delete(long id) {
        super(FreeAgent.this, "DELETE", "bank_transaction_explanations/{id}", null, Void.class);
        this.id = id;
      }
    }

    public Create create(Explanation explanation) {
      return new Create(explanation);
    }

    public Delete delete(Explanation explanation) {
      return new Delete(FreeAgentId.fromUrl(explanation.getUrl()));
    }
  }

  public class Invoices {

    public class Create extends FreeAgentRequest<InvoiceResponse> {
      public Create(Invoice invoice) {
        super(FreeAgent.this, "POST", "invoices", new InvoiceResponse(invoice), InvoiceResponse.class);
      }
    }

    public class Transition extends FreeAgentPutRequest {
      @Key
      private long id;
      @Key
      private String transition;

      public Transition(Invoice invoice, String transition) {
        super(FreeAgent.this, "PUT", "invoices/{id}/transitions/{transition}");
        this.id = FreeAgentId.fromUrl(invoice.getUrl());
        this.transition = transition;
      }
    }

    public class List extends FreeAgentRequest<ListInvoiceResponse> {

      @Key("nested_invoice_items")
      private boolean nestedInvoiceItems;

      @Key("view")
      private String view;

      @Key
      private int page;

      @Key("per_page")
      private int perPage;

      public List() {
        super(FreeAgent.this, "GET", "invoices", null, ListInvoiceResponse.class);
      }

      public List nestInvoiceItems() {
        this.nestedInvoiceItems = true;
        return this;
      }

      public List recentOpenOrOverDue() {
        this.view = "recent_open_or_overdue";
        return this;
      }

      public List open() {
        this.view = "open";
        return this;
      }

      public List lastMonths(int count) {
        this.view = String.format("last_%d_months", count);
        return this;
      }

      public List setPage(int pageNumber) {
        this.page = pageNumber;
        return this;
      }

      public List setPerPage(int count) {
        this.perPage = page;
        return this;
      }
    }

    public class Get extends FreeAgentRequest<InvoiceResponse> {

      @Key
      private long id;

      private Get(long id) {
        super(FreeAgent.this, "GET", "invoices/{id}", null, InvoiceResponse.class);
        this.id = id;
      }
    }

    public List list() {
      return new List();
    }

    public Get get(long id) {
      return new Get(id);
    }

    public Create create(Invoice invoice) {
      return new Create(invoice);
    }

    public Transition markAsSent(Invoice invoice) {
      return new Transition(invoice, "mark_as_sent");
    }

  }

  public class JournalSets {

    public class List extends FreeAgentRequest<ListJournalSetsResponse> {

      @Key
      private String tag;

      @Key("from_date")
      private String fromDate;

      @Key("to_date")
      private String toDate;

      public List() {
        super(FreeAgent.this, "GET", "journal_sets", null, ListJournalSetsResponse.class);
      }

      public List datedOn(LocalDate localDate) {
        this.fromDate = localDate.toString();
        this.toDate = localDate.toString();
        return this;
      }
    }

    public class Create extends FreeAgentRequest<JournalSetResponse> {
      public Create(JournalSet journalSet) {
        super(FreeAgent.this, "POST", "journal_sets", new JournalSetResponse(journalSet), JournalSetResponse.class);
      }
    }

    public List list() {
      return new List();
    }

    public Create create(JournalSet journalSet) {
      return new Create(journalSet);
    }

  }

  public class Users {


    public class List extends FreeAgentRequest<ListUserResponse> {

      public List() {
        super(FreeAgent.this, "GET", "users", null, ListUserResponse.class);
      }

    }

    public List list() {
      return new List();
    }
  }

  public Bills bills() {
    return new Bills();
  }

  public BankAccounts bankAccounts() {
    return new BankAccounts();
  }

  public BankTransactions bankTransactions() {
    return new BankTransactions();
  }

  public Explanations explanations() {
    return new Explanations();
  }

  public Contacts contacts() {
    return new Contacts();
  }

  public Categories categories() {
    return new Categories();
  }

  public Invoices invoices() { return new Invoices(); }

  public JournalSets journalSets() {
    return new JournalSets();
  }

  public Users users() {
    return new Users();
  }
}
