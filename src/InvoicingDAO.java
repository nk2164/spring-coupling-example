public interface InvoicingDAO {
    void save(Invoice newInvoice);
    void delete(Invoice oldInvoice);
    void update(Invoice invoiceToCancel);
}
