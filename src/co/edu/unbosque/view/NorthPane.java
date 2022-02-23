package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class is in charge to show the textfields and buttons in main window.
 */
public class NorthPane extends JPanel{

    private JLabel sumSalesLabel;
    private JLabel invoiceNoLabel;
    private JLabel stockCodeLabel;
    private JTextField sumSalesField;
    private JTextField invoiceNoField;
    private JTextField stockCodeField;
    private JTextField stockCodeFieldAnswer;
    private JButton sumSalesButton;
    private JButton invoiceNoButton;
    private JButton stockCodeButton;
    private JButton monthlySalesButton;
    private JButton byDescriptionButton;
    private JButton reloadButton;
    public static final String SUM_TOTAL = "SumSales";
    public static final String FIND_INVOICE = "FindInvoice";
    public static final String FIND_STOCK = "FindStock";
    public static final String CHANGE_MONTH = "ChangeMonth";
    public static final String CHANGE_DESCR = "ChangeDescr";
    public static final String RELOAD = "ReloadFile";

    /**
     * Method constructor
     */
    public NorthPane(){

        setLayout(null);

        sumSalesLabel = new JLabel("Total sales:");
        sumSalesLabel.setBounds(40,30,80,20);
        add(sumSalesLabel);

        sumSalesField = new JTextField();
        sumSalesField.setForeground(Color.BLACK);
        sumSalesField.setBackground(Color.WHITE);
        sumSalesField.setEditable(false);
        sumSalesField.setBounds(120, 32, 130, 20);
        add(sumSalesField);
        
        sumSalesButton = new JButton("Calculate");
        sumSalesButton.setBounds(40,60,90,20);
        sumSalesButton.setActionCommand(SUM_TOTAL);
        add(sumSalesButton);

        stockCodeLabel = new JLabel("Stock Code:");
        stockCodeLabel.setBounds(40,100,80,20);
        add(stockCodeLabel);

        stockCodeField = new JTextField();
        stockCodeField.setBounds(40,120,80,20);
        add(stockCodeField);

        stockCodeButton = new JButton("Search");
        stockCodeButton.setBounds(40,140,90,20);
        stockCodeButton.setActionCommand(FIND_STOCK);
        add(stockCodeButton);

        stockCodeFieldAnswer = new JTextField();
        stockCodeFieldAnswer.setBounds(130, 120, 100, 20);
        stockCodeFieldAnswer.setForeground(Color.BLACK);
        stockCodeFieldAnswer.setBackground(Color.WHITE);
        stockCodeFieldAnswer.setEditable(false);
        add(stockCodeFieldAnswer);

        invoiceNoLabel = new JLabel("Invoice no:");
        invoiceNoLabel.setBounds(40,180,90,20);
        add(invoiceNoLabel);

        invoiceNoField = new JTextField();
        invoiceNoField.setBounds(40,200,80,20);
        add(invoiceNoField);

        invoiceNoButton = new JButton("Search");
        invoiceNoButton.setBounds(40,220,90,20);
        invoiceNoButton.setActionCommand(FIND_INVOICE);
        add(invoiceNoButton);

        reloadButton = new JButton("Reload File");
        reloadButton.setBounds(300,20,150,50);
        reloadButton.setActionCommand(RELOAD);
        add(reloadButton);

        monthlySalesButton = new JButton("Monthly Sales");
        monthlySalesButton.setBounds(300,100,150,50);
        monthlySalesButton.setActionCommand(CHANGE_MONTH);
        add(monthlySalesButton);

        byDescriptionButton = new JButton("Find by Description");
        byDescriptionButton.setBounds(300,180,150,50);
        byDescriptionButton.setActionCommand(CHANGE_DESCR);
        add(byDescriptionButton);
    }

    public JLabel getSumSalesLabel() {
        return this.sumSalesLabel;
    }

    public void setSumSalesLabel(JLabel sumSalesLabel) {
        this.sumSalesLabel = sumSalesLabel;
    }

    public JLabel getInvoiceNoLabel() {
        return this.invoiceNoLabel;
    }


    public JTextField getStockCodeFieldAnswer() {
        return this.stockCodeFieldAnswer;
    }

    public void setStockCodeFieldAnswer(JTextField stockCodeFieldAnswer) {
        this.stockCodeFieldAnswer = stockCodeFieldAnswer;
    }

    public void setInvoiceNoLabel(JLabel invoiceNoLabel) {
        this.invoiceNoLabel = invoiceNoLabel;
    }

    public JLabel getStockCodeLabel() {
        return this.stockCodeLabel;
    }

    public void setStockCodeLabel(JLabel stockCodeLabel) {
        this.stockCodeLabel = stockCodeLabel;
    }

    public JTextField getSumSalesField() {
        return this.sumSalesField;
    }

    public void setSumSalesField(JTextField sumSalesField) {
        this.sumSalesField = sumSalesField;
    }

    public JTextField getInvoiceNoField() {
        return this.invoiceNoField;
    }

    public void setInvoiceNoField(JTextField invoiceNoField) {
        this.invoiceNoField = invoiceNoField;
    }

    public JTextField getStockCodeField() {
        return this.stockCodeField;
    }

    public JButton getReloadButton() {
        return this.reloadButton;
    }

    public void setReloadButton(JButton reloadButton) {
        this.reloadButton = reloadButton;
    }

    public void setStockCodeField(JTextField stockCodeField) {
        this.stockCodeField = stockCodeField;
    }

    public JButton getSumSalesButton() {
        return this.sumSalesButton;
    }

    public void setSumSalesButton(JButton sumSalesButton) {
        this.sumSalesButton = sumSalesButton;
    }

    public JButton getInvoiceNoButton() {
        return this.invoiceNoButton;
    }

    public void setInvoiceNoButton(JButton invoiceNoButton) {
        this.invoiceNoButton = invoiceNoButton;
    }

    public JButton getStockCodeButton() {
        return this.stockCodeButton;
    }

    public void setStockCodeButton(JButton stockCodeButton) {
        this.stockCodeButton = stockCodeButton;
    }

    public JButton getMonthlySalesButton() {
        return this.monthlySalesButton;
    }

    public void setMonthlySalesButton(JButton monthlySalesButton) {
        this.monthlySalesButton = monthlySalesButton;
    }

    public JButton getByDescriptionButton() {
        return this.byDescriptionButton;
    }

    public void setByDescriptionButton(JButton byDescriptionButton) {
        this.byDescriptionButton = byDescriptionButton;
    }


    public JLabel getSumSales() {
        return this.sumSalesLabel;
    }

    public void setSumSales(JLabel sumSales) {
        this.sumSalesLabel = sumSales;
    }

    public JLabel getInvoiceNo() {
        return this.invoiceNoLabel;
    }

    public void setInvoiceNo(JLabel invoiceNo) {
        this.invoiceNoLabel = invoiceNo;
    }

    public JLabel getStockCode() {
        return this.stockCodeLabel;
    }

    public void setStockCode(JLabel stockCode) {
        this.stockCodeLabel = stockCode;
    }

    
}
