package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

/**
 * The class Calculations is where the sums or counters are realized.
 * @author Luis Varon
 */
public class Calculations {

    /**
     * Calculate the sum of all purchases in the store, multiplying the quantity and the unit price
     * @param pReceipt File csv in the app
     * @return  Return the sum of all purchases
     */
    public double sumTotalSales(ArrayList<Receipt> pReceipt){

        double total = 0;

        for(int i = 0; i<pReceipt.size(); i++){
            total = total + (pReceipt.get(i).getQuantity()*pReceipt.get(i).getUnitPrice());
        }

        return total;
    }

    /**
     * Count the quantity of a product specified by their stock code
     * @param stockCode Code of the product to know the quantity
     * @param pReceipt  File csv in the app
     * @return  Quantity of the product specified
     */
    public int countByStockCode(String stockCode, ArrayList<Receipt> pReceipt){
        int quantity = 0;
        for(int i = 0; i<pReceipt.size(); i++){
            if(pReceipt.get(i).getStockCode().toUpperCase().equals(stockCode.toUpperCase().replace(" ", ""))){
                quantity = quantity + pReceipt.get(i).getQuantity();
            }
        }
        return quantity;
    }
    
}
