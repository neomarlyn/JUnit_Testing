package gui;
import javax.swing.*;
import java.awt.*;
import org.apache.logging.log4j.*;

public class MyFrame extends JFrame {
    private static Logger logger = LogManager.getLogger(MyFrame.class);
    // frames contain panels
    //declare the widgets
    private MyPanel pnlTemp;

    public MyFrame(){
        logger.debug("INSIDE MYFRAME CONSTRUCTOR");
        //default layout for FRAMES is BORDERLAYOUT
        //configure the widgets

        pnlTemp = new MyPanel();
        //add(pnlTemp);
        add(pnlTemp, BorderLayout.CENTER);

    }
}
