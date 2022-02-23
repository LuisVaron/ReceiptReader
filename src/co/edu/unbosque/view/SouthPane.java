package co.edu.unbosque.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.GridLayout;

/**
 * This class is in charge of the panel where the values filtred by idReceipt will be showed
 */
public class SouthPane extends JPanel{

    private JTextArea invoiceNo;
    private JTextArea stockCode;
    private JTextArea description;
    private JTextArea quantity;
    private JTextArea invoiceDate;
    private JTextArea unitPrice;
    private JTextArea customerId;
    private JTextArea country;

    /**
     * Method constructor
     */
    public SouthPane(){
        setLayout(new GridLayout(1,8));
        TitledBorder border = BorderFactory.createTitledBorder("Receipt information");
        border.setTitleColor(Color.BLACK);
        setBorder(border);

        invoiceNo = new JTextArea("");
        invoiceNo.setForeground(Color.BLACK);
        invoiceNo.setBackground(Color.WHITE);
        invoiceNo.setEditable(false);
        add(invoiceNo);

        stockCode = new JTextArea("");
        stockCode.setForeground(Color.BLACK);
        stockCode.setBackground(Color.WHITE);
        stockCode.setEditable(false);
        add(stockCode);

        description = new JTextArea("");
        description.setForeground(Color.BLACK);
        description.setBackground(Color.WHITE);
        description.setEditable(false);
        add(description);

        quantity = new JTextArea("");
        quantity.setForeground(Color.BLACK);
        quantity.setBackground(Color.WHITE);
        quantity.setEditable(false);
        add(quantity);

        invoiceDate = new JTextArea("");
        invoiceDate.setForeground(Color.BLACK);
        invoiceDate.setBackground(Color.WHITE);
        invoiceDate.setEditable(false);
        add(invoiceDate);

        unitPrice = new JTextArea("");
        unitPrice.setForeground(Color.BLACK);
        unitPrice.setBackground(Color.WHITE);
        unitPrice.setEditable(false);
        add(unitPrice);

        customerId = new JTextArea("");
        customerId.setForeground(Color.BLACK);
        customerId.setBackground(Color.WHITE);
        customerId.setEditable(false);
        add(customerId);

        country = new JTextArea("");
        country.setForeground(Color.BLACK);
        country.setBackground(Color.WHITE);
        country.setEditable(false);
        add(country);
    }


    public JTextArea getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(JTextArea invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public JTextArea getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(JTextArea stockCode) {
        this.stockCode = stockCode;
    }

    public JTextArea getDescription() {
        return this.description;
    }

    public void setDescription(JTextArea description) {
        this.description = description;
    }

    public JTextArea getQuantity() {
        return this.quantity;
    }

    public void setQuantity(JTextArea quantity) {
        this.quantity = quantity;
    }

    public JTextArea getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(JTextArea invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public JTextArea getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(JTextArea unitPrice) {
        this.unitPrice = unitPrice;
    }

    public JTextArea getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(JTextArea customerId) {
        this.customerId = customerId;
    }

    public JTextArea getCountry() {
        return this.country;
    }

    public void setCountry(JTextArea country) {
        this.country = country;
    }

    
}
