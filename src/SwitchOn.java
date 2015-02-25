import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

/*The Switch On function that asks for a password and redirects to main menu, as well as plays hello Sound when
*switched on, happySound and sadSound depending on whether password has been entered correctly
*@author Kate Moksina
*@version 1.0
*/

public class SwitchOn implements MouseListener{
   //private static TextField line1 = new TextField();
   //public static JButton ok_buttn = new JButton("OK");
   public long click;
   public long unclick;
   String password;
   String pass;
   BasicLayout layout;
   int count=0;
   public SwitchOn(BasicLayout layout) {
       this.layout = layout; 
        layout.ok_buttn.addMouseListener( this );
   }
   

   public static void main(String[] args){
       BasicLayout b = new BasicLayout();
       SwitchOn window = new SwitchOn(b);
   }

   public void mouseClicked(MouseEvent e) {
        }

   public void mousePressed(MouseEvent e) {
       click = System.currentTimeMillis();
       count++;
      }

   public void mouseReleased(MouseEvent e) {
       if (count != 1) { return;}
        unclick = new Date().getTime() - click;
        if (unclick >= 2000) {
            Ringtone.happySound();
                    if (password == null) {
                        layout.line1.setText("Set password: ");
                        layout.line2.setText(layout.input);
                        while (count !=2) {}
                        password = layout.line2.getText();
                        layout.state=State.MAIN_MENU;
                    } else {
                        layout.line1.setText("Enter password: ");
                        while (!pass.equals(password)) {
                            layout.line2.setText(layout.input);
                            while(count !=2) {}
                            pass = layout.line2.getText();
                            Ringtone.sadSound();
                            layout.clearLines(layout.lines);
                            if (pass.equals(password)) {
                                Ringtone.happySound();
                                layout.state=State.MAIN_MENU;
                            }
                        }
                    }
                }
   }

   public void mouseEntered(MouseEvent e) {
      }

   public void mouseExited(MouseEvent e) {
      }
}
