package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;

/**The class receipt is the structure for the CSV file which is loaded
 * @author Luis Varon
 */
public class Receipt {

    private String invoiceNo;
    private String stockCode;
    private String description;
    private int quantity;
    private LocalDateTime invoiceDate;
    private float unitPrice;
    private String customerId;
    private String country;

    /**
     * Class constructor of Receipt
     * @param invoiceNo Number of invoce
     * @param stockCode Code of product 
     * @param description   Description of the products sold 
     * @param quantity  Quantity of products sold
     * @param invoiceDate   Invoice generation date
     * @param unitPrice Price of product individual
     * @param customerId    Id of the customer who do the purchase
     * @param country   Country where the purchase was realized
     */
    public Receipt (String invoiceNo, String stockCode, String description, int quantity, LocalDateTime invoiceDate, float unitPrice, String customerId, String country){
        this.invoiceNo = invoiceNo;
        this.stockCode = stockCode;
        this.description = description;
        this.quantity = quantity;
        this.invoiceDate = invoiceDate;
        this.unitPrice = unitPrice;
        this.customerId = customerId;
        this.country = country;
    }


    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
