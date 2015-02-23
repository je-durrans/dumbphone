import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;


public class SwitchOn extends JFrame implements MouseListener {

    //clearLines(lines);
    /*boolean phoneOn = false; make this into if statement when putting into the main method*/
    long pressedTime;
    long timeClicked;
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
        if (timeClicked >= 2000) {
            //Ringtone.happySound();
            System.out.println("The phone is now switched on");
            boolean phoneOn = true;
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            try {
                    if (password == null) {
                        System.out.println("Please set password: ");
                        password = br.readLine();
                        //go to main menu?
                    } else {
                        while (!pass.equals(password)) {
                            System.out.println("Please enter password: ");
                            pass = br.readLine();
                            if (pass.equals(password)) {
                                System.out.println("Well done, WELCOME");
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

