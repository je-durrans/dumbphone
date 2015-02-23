import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;


public class SwitchOn extends JFrame implements MouseListener {
    /*boolean phoneOn; make this into if statement when putting into the main method*/
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
    
    public void mouseReleased(MouseEvent e) {
        timeClicked = new Date().getTime() - pressedTime;
        if (timeClicked >= 2000 && !phoneOn) {
            //Ringtone.happySound();
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
                            layout.clearLines(lines);
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

