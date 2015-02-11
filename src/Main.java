import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by John on 11/02/2015.
 */
/*
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                new PlaySound();
            }
        };
        Thread u = new Thread(){
            @Override
            public void run() {
                new RecordSound();
            }
        };
        t.start();
        u.start();
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<2; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    BasicLayout.main(new String[]{});
                }
            };
            t.start();
        }
    }
}
*/
import java.awt.TextField;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import java.util.ArrayList;

//very basic layout of the dumb phone, Mustafa, 09.02.15


public class Main {


    public static void main( String[] args ) {
        final ArrayList<TextField> lines = new ArrayList<TextField>(); //array to store lines
        final Box calling = new Box();

        JFrame window = new JFrame ( "not-so-smartPhone" );
        window.setSize( 405, 500 );

        //adding the lines
        final TextField line1 = new TextField();  lines.add(line1);
        final TextField line2 = new TextField();  lines.add(line2);
        final TextField line3 = new TextField();  lines.add(line3);
        final TextField line4 = new TextField();  lines.add(line4);
        final TextField line5 = new TextField();  lines.add(line5);

        //adding the buttons
        final JButton ok_buttn = new JButton( "OK" );
        final JButton buttn_1 = new JButton ( "1" );
        final JButton buttn_2 = new JButton ( "2 ABC" );
        final JButton buttn_3 = new JButton ( "3 DEF" );

        final JButton buttn_4 = new JButton ( "4 GHI" );
        final JButton buttn_5 = new JButton ( "5 JKL" );
        final JButton buttn_6 = new JButton ( "6 MNO" );

        final JButton buttn_7 = new JButton ( "7 PQRS" );
        final JButton buttn_8 = new JButton ( "8 TUV" );
        final JButton buttn_9 = new JButton ( "9 XYZ" );

        final JButton star_buttn = new JButton ( "* DEL" );
        final JButton buttn_0 = new JButton ( "0" );
        final JButton sqar_buttn = new JButton ( "# 123/ABC");

        //adding the event listeners
        ok_buttn.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed the OK button" );
                line2.setText("That should do something practical in the future");
                if(calling.b){
                    if(RecordSound.stopper.isAlive())
                        RecordSound.stopper.start();
                }else{
                    new Thread(){public void run(){new RecordSound();}}.start();
                }
                calling.b=!calling.b;
            }
        } );

        buttn_1.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 1" );
                line2.setText("That should also do something practical in the future");
                line5.setText("Hey, I'm the fifth line ^^");
                new Thread(){public void run(){new PlaySound();}}.start();
            }
        } );

        buttn_2.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 2" );
                line2.setText("That should also do something practical in the future");
                line4.setText("Hey, I'm the fourth line o.O");
            }
        } );

        buttn_3.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 3" );
                line2.setText("That should also do something practical in the future");
                line3.setText("Hey, I'm the third line ;)");
            }
        } );

        buttn_4.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 4" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        buttn_5.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 5" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        buttn_6.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 6" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        buttn_7.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 7" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        buttn_8.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 8" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        buttn_9.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 9" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        buttn_0.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed 0" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        star_buttn.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed the star button, it's a star!" );
                line2.setText("That should also do something practical in the future");
            }
        } );

        sqar_buttn.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                clearLines(lines);
                line1.setText( "You just pressed the sqaure button" );
                line2.setText("It's not a star, but it's still quite cool");
                line3.setText("These text box thingies should only be 16 characters o.O");
            }
        } );

        //setting the basic layout of buttons and lines
        window.setLayout( null );
        line1.setBounds   ( 10, 10, 380, 40 ); window.add( line1 );
        line2.setBounds   ( 10, 50, 380, 40 ); window.add( line2 );
        line3.setBounds   ( 10, 90, 380, 40 ); window.add( line3 );
        line4.setBounds   ( 10, 130, 380, 40 ); window.add( line4 );
        line5.setBounds   ( 10, 170, 380, 40 ); window.add( line5 );

        ok_buttn.setBounds( 180, 215, 70, 40); window.add( ok_buttn );
        buttn_1.setBounds ( 10,  260, 127, 30 ); window.add( buttn_1 );
        buttn_2.setBounds ( 137, 260, 127, 30 ); window.add( buttn_2 );
        buttn_3.setBounds ( 264, 260, 127, 30 ); window.add( buttn_3 );

        buttn_4.setBounds ( 10,  290, 127, 30 ); window.add( buttn_4 );
        buttn_5.setBounds ( 137, 290, 127, 30 ); window.add( buttn_5 );
        buttn_6.setBounds ( 264, 290, 127, 30 ); window.add( buttn_6 );

        buttn_7.setBounds ( 10,  320, 127, 30 ); window.add( buttn_7 );
        buttn_8.setBounds ( 137, 320, 127, 30 ); window.add( buttn_8 );
        buttn_9.setBounds ( 264, 320, 127, 30 ); window.add( buttn_9 );

        buttn_0.setBounds    ( 137, 350, 127, 30 ); window.add( buttn_0 );
        star_buttn.setBounds ( 10,  350, 127, 30 ); window.add( star_buttn );
        sqar_buttn.setBounds ( 264, 350, 127, 30 ); window.add( sqar_buttn );


        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }

    //function to reset the lines
    public static void clearLines( ArrayList<TextField> lines_array) {
        for ( TextField line : lines_array ) {
            line.setText( " " ) ;
        }

    }
}