
/* This thing works. It's a mouse listener on a button with a timer and it works.
* just gimme 5 years to put password and such in it
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class S extends JFrame implements MouseListener{
   private static TextField line1 = new TextField();
   public static JButton ok_buttn = new JButton("OK");
   public long click;
   public long unclick;
   String password;
   String pass;
   public S() {
        setTitle( "test" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize( 500, 400 );
        setResizable(true);
        setLocation( 300, 300 );
        ok_buttn.addMouseListener( this );
        setVisible( true );
        setLayout(null);
        line1.setBounds( 10, 10, 380, 40 ); this.add( line1 );
        ok_buttn.setBounds( 180, 215, 70, 40); this.add( ok_buttn );
   }
   

   public static void main(String[] args){
       S window = new S();
   }

   public void mouseClicked(MouseEvent e) {
        }

   public void mousePressed(MouseEvent e) {
       click = System.currentTimeMillis();
      }

   public void mouseReleased(MouseEvent e) {
        unclick = new Date().getTime() - click;
        if (unclick >= 2000) {
            //Ringtone.happySound();
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            BasicLayout layout = new BasicLayout();
            try {
                    if (password == null) {
                        //layout.
                        line1.setText("Set password: ");
                        password = br.readLine();
                        //go to main menu?
                    } else {
                        //layout.
                        line1.setText("Enter password: ");
                        while (!pass.equals(password)) {
                            pass = br.readLine();
                            //Ringtone.sadSound();
                            //layout.clearLines(lines);
                            if (pass.equals(password)) {
                                //Ringtone.happySound();
                                //go to main menu?
                            }
                        }
                    }
            } catch(IOException ex) {}
        }
   }

   public void mouseEntered(MouseEvent e) {
      }

   public void mouseExited(MouseEvent e) {
      }
}
