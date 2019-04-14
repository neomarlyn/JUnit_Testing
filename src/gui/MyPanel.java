package gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import domain.WeightConverter;
import org.apache.logging.log4j.*;

public class MyPanel extends JPanel
        implements ActionListener
{
    private static Logger logger = LogManager.getLogger(MyPanel.class);

    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblFullName;
    private JButton btnLbsToKgs;
    private JButton btnKgsToLbs;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtFullName;

    public MyPanel(){
        logger.debug("INSIDE MYPANEL CONSTRUCTOR");
        //default layout for a panel is flowlayout
        //configure the widgets
        lblFirstName = new JLabel("Enter weight:");
        lblLastName = new JLabel("Last Name:");
        lblFullName = new JLabel( "(output appears here ...)" );
        btnLbsToKgs = new JButton("Convert LBS to Kg!");
        btnKgsToLbs = new JButton("Convert Kg to LBS!");
        txtFirstName = new JTextField(40);
        txtLastName = new JTextField(40);
        txtFullName = new JTextField(50);

        btnLbsToKgs.addActionListener(this);
        btnLbsToKgs.setActionCommand("lbstokg");
        btnKgsToLbs.addActionListener(this);
        btnKgsToLbs.setActionCommand("kgtolbs");

        add(lblFirstName);
        add(txtFirstName);
        add(btnLbsToKgs);
        add(btnKgsToLbs);
        add(lblFullName);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logger.debug("INSIDE  PANEL actionPerformed");
        /*String x = txtFirstName.toString();
        String y = txtLastName.toString();*/
        WeightConverter wc = new WeightConverter();

        try {
            Double d = Double.parseDouble(txtFirstName.getText());
            if (e.getActionCommand().equals("lbstokg")) {
                wc.setWeightInPounds(d);
                logger.debug("INSIDE  PANEL actionPerformed : lbstokg");
            }
            if (e.getActionCommand().equals("kgtolbs")) {
                wc.setWeightInKilograms(d);
                logger.debug("INSIDE  PANEL actionPerformed : kgtolbs");
            }
            lblFullName.setText(wc.toString());
        } catch (Exception ex) {
            lblFullName.setText(ex.toString());
            logger.debug("INSIDE  PANEL actionPerformed : Error caught: " + ex.toString());
        }

        /*String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();*/
    }
}
