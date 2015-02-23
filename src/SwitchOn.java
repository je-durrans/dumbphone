import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;


public class SwitchOn extends JFrame implements MouseListener {
    public void main(String[] args) {
        //clearLines(lines);
        /*boolean phoneOn = false; make this into if statement when putting into the main method*/
        Date pressedTime;
        long timeClicked;
        String password;
        String pass;
        
        @Override
        public void mousePressed(MouseEvent e) {
            pressedTime = System.getCurrentTimeMillis();
        }    
        public void mouseReleased(MouseEvent e) {         
            timeClicked = new Date().getTime() - pressedTime.getTime();
            if (timeClicked >= 2000) {
                Ringtone.happySound();
                System.out.println("The phone is now switched on");
                phoneOn = true;
                InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(in);
                if (password=null) {
                    System.out.println("Please set password: ");
                    password = br.readLine();
                    //go to main menu?
                } else {
                    while (!pass.equals(password)) {
                        System.out.println("Please enter password: ");
                        pass = br.readLine();
                        if (pass.equals(password)){
                            System.out.println("Well done, WELCOME");
                            //go to main menu?
                        }
                }
            }
        }
    }
}
}
