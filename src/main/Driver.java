package main;
import gui.*;
import javax.swing.*;
import org.apache.logging.log4j.*;

public class Driver {
    private static Logger logger = LogManager.getLogger(Driver.class);



    public static void main(String[] args) {
        logger.debug("INSIDE DRIVER MAIN !!!");
        MyFrame frm = new MyFrame();

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//always do these three lines
        frm.setSize(600, 400);
        frm.setVisible(true);
    }
}
