package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;

/**
 * This class is in charged to show the window of filter by description
 * @author Luis Varon
 */
public class ViewDescription extends JFrame{

    private JLayeredPane lpane;
    private FilterPane fpane;

    /**
     * Method constructor
     */
    public ViewDescription(){
        setSize(450,410);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout());
        setTitle("Finder by description");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(false);

        lpane = new JLayeredPane();
        getContentPane().add(lpane,BorderLayout.CENTER);

        fpane = new FilterPane();
        fpane.setBounds(5,5,450,410);
        lpane.add(fpane);

    }   
    

    public JLayeredPane getLpane() {
        return this.lpane;
    }

    public void setLpane(JLayeredPane lpane) {
        this.lpane = lpane;
    }

    public FilterPane getFpane() {
        return this.fpane;
    }

    public void setFpane(FilterPane fpane) {
        this.fpane = fpane;
    }
    
}
