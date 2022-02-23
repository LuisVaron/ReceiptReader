package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *  This class is in charge of load the CSV into the program
 * @author Luis Varon
 */
public class LoaderReceipt {

    private ArrayList<Receipt> receipt;
    private DateTimeFormatter formatter;

    /**
     * Class constructor
     */
    public LoaderReceipt(){
        formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm"); 
    }

    /**
     * This method will read the CSV on the path .\data\*.csv and will load into the program
     * @return  Message of succes load
     * @throws Exception    Shows the error on console
     */
    public String uploadData() throws Exception{
        receipt = new ArrayList<Receipt>();
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(".\\data\\data.csv"));
            br.readLine();
            while ((line = br.readLine()) != null)
            {
                String[] aux = line.split(splitBy);

                if(aux.length > 8){
                    if(aux.length == 9){
                        receipt.add(new Receipt(aux[0], aux[1], aux[2] +" "+ aux[3], Integer.parseInt(aux[4]), LocalDateTime.parse(aux[5],formatter), Float.parseFloat(aux[6]), aux[7], aux[8]));
                    }else if(aux.length == 10){
                        receipt.add(new Receipt(aux[0], aux[1], aux[2] +" "+ aux[3] +" "+ aux[4], Integer.parseInt(aux[5]),LocalDateTime.parse( aux[6],formatter), Float.parseFloat(aux[7]), aux[8], aux[9]));
                    }
                }else{
                    receipt.add(new Receipt(aux[0], aux[1], aux[2], Integer.parseInt(aux[3]), LocalDateTime.parse(aux[4],formatter), Float.parseFloat(aux[5]), aux[6], aux[7]));
                }
                
            }
            br.close();

            return "El proceso de carga del archivo ha finalizado.";
        }
        catch(IOException e) {
          e.printStackTrace();
        }

        return null;
        
    }


    public ArrayList<Receipt> getReceipt() {
        return this.receipt;
    }

    public void setReceipt(ArrayList<Receipt> receipt) {
        this.receipt = receipt;
    }

    
}
