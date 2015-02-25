import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class S extends JFrame implements MouseListener{
   //private static TextField line1 = new TextField();
   //public static JButton ok_buttn = new JButton("OK");
   public long click;
   public long unclick;
   String password;
   String pass;
   BasicLayout layout;
   int count=0;
   public S(BasicLayout layout) {
       this.layout = layout; 
       setTitle( "test" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize( 500, 400 );
        setResizable(true);
        setLocation( 300, 300 );
        layout.ok_buttn.addMouseListener( this );
        setVisible( true );
        setLayout(null);
   }
   

   public static void main(String[] args){
       BasicLayout b = new BasicLayout();
       S window = new S(b);
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
            //Ringtone.happySound();
            //InputStreamReader in = new InputStreamReader(System.in);
            //BufferedReader br = new BufferedReader(in);
            try {
                    if (password == null) {
                        layout.line1.setText("Set password: ");
                        layout.line2.setText(input);
                        while (count !=2) {}
                        password = layout.line2.getText();
                        layout.state=State.MAIN_MENU;
                    } else {
                        layout.line1.setText("Enter password: ");
                        while (!pass.equals(password)) {
                            pass = layout.line2.getText;
                            //Ringtone.sadSound();
                            //layout.clearLines(lines);
                            if (pass.equals(password)) {
                                //Ringtone.happySound();
                                layout.state=State.MAIN_MENU;
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
