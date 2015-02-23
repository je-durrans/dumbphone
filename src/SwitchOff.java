import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class SwitchOff extends JFrame implements MouseListener {
        /*boolean phoneOn; make this into if statement when putting into the main method*/
    Date pressedTime;
    long timeClicked;
    boolean phoneOn;
    @Override
    public void mousePressed(MouseEvent e) {
       pressedTime = new Date();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        timeClicked = new Date().getTime() - pressedTime.getTime();
        if (timeClicked >= 2000 && phoneOn) {
            //Ringtone.goodbyeSound();
            phoneOn = false;
        }
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }
    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
