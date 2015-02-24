import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

/**
* A class that switches on the phone if OK button is held down for over 2 seconds
* It then plays happySoud and asks to Set/Enter password, depending on whether
* the password has already been set.
* 
* @author Kate Moksina 
* @version 1.0
*/


public class SwitchOn extends JFrame implements MouseListener {
    /*boolean phoneOn; make this into if statement when putting into the main dumbphone method*/
    long pressedTime;
    long timeClicked;
    boolean phoneOn;
    String password;
    String pass;


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressedTime = System.currentTimeMillis();
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        timeClicked = new Date().getTime() - pressedTime;
        if (timeClicked >= 2000 && !phoneOn) {
            //Ringtone.helloSound();
            boolean phoneOn = true;
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            BasicLayoutInput layout = new BasicLayoutInput();
            try {
                    if (password == null) {
                        layout.line1.setText("Set password: ");
                        password = br.readLine();
                        //go to main menu?
                    } else {
                        layout.line1.setText("Enter password: ");
                        while (!pass.equals(password)) {
                            pass = br.readLine();
                            //Ringtone.sadSound();
                            BasicLayoutInput.clearLines(layout.lines);
                            if (pass.equals(password)) {
                                //Ringtone.happySound();
                                //go to main menu?
                            }
                        }
                    }
            } catch(IOException ex) {}
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}

