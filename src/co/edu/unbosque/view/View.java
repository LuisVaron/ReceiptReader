package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.util.ArrayList;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.Receipt;

/**
 * This class will manage the principal window and all the action listeners
 * @author Luis Varon
 */
public class View extends JFrame{

    private JLayeredPane lpane;
    private NorthPane northP;
    private SouthPane southP;
    private JScrollPane scrollPane;
    private ViewDescription vDes;

    /**
     * Class constructor
     * @param control get the listeners executed in control class
     */
    public View(Controller control){

        vDes = new ViewDescription();

        setSize(500,500);
        setResizable(false);
        setTitle("Gift Store Manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lpane = new JLayeredPane();
        getContentPane().add(lpane,BorderLayout.CENTER);

        northP = new NorthPane();
        northP.setBounds(5,5,480,250);
        lpane.add(northP);

        southP = new SouthPane();
        scrollPane = new JScrollPane(southP);
        scrollPane.setViewportView(southP);
        scrollPane.setBounds(5,260,470,200);
        lpane.add(scrollPane);

        northP.getSumSalesButton().addActionListener(control);
        northP.getStockCodeButton().addActionListener(control);
        northP.getInvoiceNoButton().addActionListener(control);
        northP.getReloadButton().addActionListener(control);
        northP.getByDescriptionButton().addActionListener(control);
        vDes.getFpane().getBackbtn().addActionListener(control);
        vDes.getFpane().getFindbtn().addActionListener(control);

    }

    /**
     * Show a message when the file is uploaded manually pressing the button reload
     * @param pMessage Message who will be showed
     */
    public void popUp(String pMessage){
        JOptionPane.showMessageDialog(null, pMessage, "Load File", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Clean all the result fields in the application
     */
    public void cleanFields(){
        getSouthP().getInvoiceNo().setText("");
        getSouthP().getStockCode().setText("");
        getSouthP().getDescription().setText("");
        getSouthP().getQuantity().setText("");
        getSouthP().getInvoiceDate().setText("");
        getSouthP().getUnitPrice().setText("");
        getSouthP().getCustomerId().setText("");
        getSouthP().getCountry().setText("");
        getVDes().getFpane().getResultsField().setText("");
    }

    /**
     * This method will filter the arraylist to get the rows equals to the Invoice Number writed
     * @param invoiceNo Invoice number to search the registers
     * @param pReceipt The arraylist with the CSV loaded
     */
    public void findByInvoiceNo(String invoiceNo, ArrayList<Receipt> pReceipt){
        for(int i = 0; i<pReceipt.size(); i++){
            if(pReceipt.get(i).getInvoiceNo().toUpperCase().equals(invoiceNo.toUpperCase().replace(" ", ""))){
                getSouthP().getInvoiceNo().append(String.valueOf(pReceipt.get(i).getInvoiceNo())+"\n");
                getSouthP().getStockCode().append(String.valueOf(pReceipt.get(i).getStockCode())+"\n");
                getSouthP().getDescription().append(String.valueOf(pReceipt.get(i).getDescription())+"\n");
                getSouthP().getQuantity().append(String.valueOf(pReceipt.get(i).getQuantity())+"\n");
                getSouthP().getInvoiceDate().append(String.valueOf(pReceipt.get(i).getInvoiceDate()).replace("T", " ")+"\n");
                getSouthP().getUnitPrice().append(String.valueOf(pReceipt.get(i).getUnitPrice())+"\n");
                getSouthP().getCustomerId().append(String.valueOf(pReceipt.get(i).getCustomerId())+"\n");
                getSouthP().getCountry().append(String.valueOf(pReceipt.get(i).getCountry())+"\n");
            }
        }   
        
    }

    /**
     * This method will filter the registers by a key value writed and will show the objects selled by each one
     * @param search Key value to search in the registers
     * @param pReceipt The arraylist with the CSV loaded
     */
    public void findPartiallyByDescription(String search, ArrayList<Receipt> pReceipt){
        String values = "";
        String aux = "";
        for(int i = 0; i<pReceipt.size(); i++){
            int quantity = 0;
            if(pReceipt.get(i).getDescription().toUpperCase().contains(search.toUpperCase())){
                aux = pReceipt.get(i).getDescription();
                for(int j = 0; j<pReceipt.size(); j++){
                    if(pReceipt.get(j).getDescription().toUpperCase().equals(aux)){
                        quantity = quantity + pReceipt.get(j).getQuantity();
                        pReceipt.remove(j);
                    }
                }
                values= values + aux+": "+ quantity + "\n";
            };
        }
    vDes.getFpane().getResultsField().setText(values);
    }


    public NorthPane getNorthP() {
        return this.northP;
    }

    public void setNorthP(NorthPane northP) {
        this.northP = northP;
    }


    public SouthPane getSouthP() {
        return this.southP;
    }

    public void setSouthP(SouthPane southP) {
        this.southP = southP;
    }

    public JLayeredPane getLpane() {
        return this.lpane;
    }

    public void setLpane(JLayeredPane lpane) {
        this.lpane = lpane;
    }

    public JScrollPane getScrollPane() {
        return this.scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public ViewDescription getVDes() {
        return this.vDes;
    }

    public void setVDes(ViewDescription vDes) {
        this.vDes = vDes;
    }
    
}
