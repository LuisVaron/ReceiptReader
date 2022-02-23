package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class is in charge to initialize and show all in the search by desctription window
 */
public class FilterPane extends JPanel{

    private JLabel descriptionLabel;
    private JTextField descriptionField;
    private JTextArea resultsField;
    private JButton findbtn;
    private JButton backbtn;
    private JScrollPane scrollPane;
    public static final String FIND = "FindDesc";
    public static final String BACK = "PrevPage";

    /**
     * Method constructor
     */
    public FilterPane(){

        setLayout(null);

        descriptionLabel = new JLabel("Description to find:");
        descriptionLabel.setBounds(10,20,120,20);
        add(descriptionLabel);

        descriptionField = new JTextField();
        descriptionField.setBounds(10, 60, 80, 20);
        add(descriptionField);

        resultsField = new JTextArea();
        resultsField.setEditable(false);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(resultsField);
        scrollPane.setBounds(130, 20, 295, 340);
        scrollPane.setForeground(Color.BLACK);
        scrollPane.setBackground(Color.WHITE);
        add(scrollPane);

        findbtn = new JButton("Find");
        findbtn.setBounds(10, 100, 80, 20);
        findbtn.setActionCommand(FIND);
        add(findbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(10,300,80,20);
        backbtn.setActionCommand(BACK);
        add(backbtn);
    }


    public JLabel getDescriptionLabel() {
        return this.descriptionLabel;
    }

    public void setDescriptionLabel(JLabel descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public JTextField getDescriptionField() {
        return this.descriptionField;
    }

    public void setDescriptionField(JTextField descriptionField) {
        this.descriptionField = descriptionField;
    }

    public JButton getFindbtn() {
        return this.findbtn;
    }

    public void setFindbtn(JButton findbtn) {
        this.findbtn = findbtn;
    }

    public JButton getBackbtn() {
        return this.backbtn;
    }

    public void setBackbtn(JButton backbtn) {
        this.backbtn = backbtn;
    }


    public JTextArea getResultsField() {
        return this.resultsField;
    }

    public void setResultsField(JTextArea resultsField) {
        this.resultsField = resultsField;
    }

    
}
