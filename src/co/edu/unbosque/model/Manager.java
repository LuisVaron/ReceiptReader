package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Calculations;
import co.edu.unbosque.model.persistence.LoaderReceipt;  

/**
 * The class manager will manage the load and th calculations in the application
 * @author Luis Varon
 */
public class Manager{

    private LoaderReceipt lr;
    private Calculations cl;

    /**
     * This class is the constructor of th class Manager and here the classes LoaderReceipt and Calculations are instantiated
     * @throws Exception shows the error in case that the CSV file doesn't exist
     */
    public Manager() throws Exception{
        lr = new LoaderReceipt(); 
        cl = new Calculations();
    }


    public LoaderReceipt getLr() {
        return this.lr;
    }

    public void setLr(LoaderReceipt lr) {
        this.lr = lr;
    }


    public Calculations getCl() {
        return this.cl;
    }

    public void setCl(Calculations cl) {
        this.cl = cl;
    }


}

