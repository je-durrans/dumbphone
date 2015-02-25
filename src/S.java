import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;

//* This thing works. It's a mouse listener on a button with a timer and it works.
* just gimme 5 years to put password and such in it
*/

public class S extends JFrame implements MouseListener{
   //static private JFrame window = new JFrame ( "test" );
   private static TextField line1 = new TextField();
   public static JButton ok_buttn = new JButton("OK");
   public long click;
   public long unclick;
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
          line1.setText("yo");
      }

      public void mouseReleased(MouseEvent e) {
          unclick = System.currentTimeMillis() - click;
          line1.setText("hi");
          if (unclick >= 2000) {
              line1.setText("hey");
            }
      }

      public void mouseEntered(MouseEvent e) {
      }

      public void mouseExited(MouseEvent e) {
      }
   }
