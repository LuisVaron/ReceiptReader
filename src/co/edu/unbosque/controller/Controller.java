package co.edu.unbosque.controller;

import co.edu.unbosque.model.Manager;
import co.edu.unbosque.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Class controller for the application
 * @author Luis Varon
 */
public class Controller implements ActionListener{

private Manager m;
private View v;

    /**
     * Class constructor
     * @throws Exception Shows the error in case that the file doesn´t exist
     */
    public Controller() throws Exception{

        m = new Manager();
        v = new View(this);
        v.setVisible(true);
        m.getLr().uploadData();

    }

    public void actionPerformed(ActionEvent evento){

        if(evento.getActionCommand().equals(v.getNorthP().SUM_TOTAL)){
            v.getNorthP().getSumSalesField().setText("$"+m.getCl().sumTotalSales(m.getLr().getReceipt()));
        }
        if(evento.getActionCommand().equals(v.getNorthP().FIND_STOCK)){
            v.getNorthP().getStockCodeFieldAnswer().setText(m.getCl().countByStockCode(v.getNorthP().getStockCodeField().getText().toString(), m.getLr().getReceipt())+" sold units.");
        }
        if(evento.getActionCommand().equals(v.getNorthP().FIND_INVOICE)){
            v.cleanFields();
            v.findByInvoiceNo(v.getNorthP().getInvoiceNoField().getText().toString(), m.getLr().getReceipt());
        }
        if(evento.getActionCommand().equals(v.getNorthP().RELOAD)){
            try {
                v.popUp(m.getLr().uploadData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(evento.getActionCommand().equals(v.getNorthP().CHANGE_DESCR)){
            v.setVisible(false);
            v.getVDes().setVisible(true);
            v.cleanFields();
        }
        if(evento.getActionCommand().equals(v.getVDes().getFpane().BACK)){
            v.setVisible(true);
            v.getVDes().setVisible(false);
            v.cleanFields();
        }
        if(evento.getActionCommand().equals(v.getVDes().getFpane().FIND)){
            v.cleanFields();
            v.findPartiallyByDescription(v.getVDes().getFpane().getDescriptionField().getText().toString(), m.getLr().getReceipt());
        }
        /*

        System.out.println(m.getCl().findPartiallyByDescription("mug", m.getLr().getReceipt())); */

    }
    
}
