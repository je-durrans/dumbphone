import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Very basic layout of the interface of the 'dumb phone'. Provides all the elements required for the interface, and a method to reset the text set on any of the TextField lines.
 * Alphanumeric keypad works in this version, which can be used to input characters to the terminal when input from the user is required. Hash key serves as a toggle between the modes 
 * of the keypad, the star button deletes the last character of the input and the zero button acts as the space bar, when the input is in alphabetical state (either upper case or lower case). 
 * When input is not required, the buttons are used to go through the menus, which is handled by two other classes; ButtonFunctions() and Display().
 * 
 * In this version, whenever more than one field of input is offered to the user, the general input variable acts as an intermediate variable and when the user is done with one field, the input
 * is stored in new variables depending on which line it was made from.  
 *
 * 11/03/2015
 *  
 * @author Mustafa Tekman
 * @version 1.3
 */
public class BasicLayout {

    State state = State.OFF;  
    boolean passcodeSet = false;
    boolean target_is_name = true;

    
    public static String input = ""; //a string to hold the input, when one field of input is offered to the user
    public static String inputL1; //a string to hold the input from the first input field (when more than one field of input is offerred to the user)
    public static String inputL2; //a string to hold the input from the second input field
    public static String inputType = "abc"; //initiate the input type to be lower case
    
    //lastClick variables hold values relating to the time the buttons they correspond to were last clicked on. They are instantiated at a randomly high value of 10000 so that the first if clause in the 
    //actionPerformed method in the event listeners of the buttons do not hold true and hence the counter gets instantiated at 0. 
    public static long lastClick1 = 10000; public static long lastClick2 = 10000; public static long lastClick3 = 10000; public static long lastClick4 = 10000; public static long lastClick5 = 10000; 
    public static long lastClick6 = 10000; public static long lastClick7 = 10000; public static long lastClick8 = 10000; public static long lastClick9 = 10000; public static long lastClick0 = 10000;
   
    //declaring the lines
    final static TextField line1 = new TextField();  final static TextField line2 = new TextField(); final static TextField line3 = new TextField();  
    final static TextField line4 = new TextField();  final static TextField line5 = new TextField();  
    
    final static ArrayList<TextField> lines = new ArrayList<TextField>(); //an array to store the lines
    
    //declaring the buttons
    final JButton ok_buttn = new JButton( "OK" );
    final JButton buttn_1 = new JButton ( "1" );
    final JButton buttn_2 = new JButton ( "2 ABC" );
    final JButton buttn_3 = new JButton ( "3 DEF" );

    final JButton buttn_4 = new JButton ( "4 GHI" );
    final JButton buttn_5 = new JButton ( "5 JKL" );
    final JButton buttn_6 = new JButton ( "6 MNO" );

    final JButton buttn_7 = new JButton ( "7 PQRS" );
    final JButton buttn_8 = new JButton ( "8 TUV" );
    final JButton buttn_9 = new JButton ( "9 WXYZ" );

    final JButton star_buttn = new JButton ( "* DEL" );
    final JButton buttn_0 = new JButton ( "0" );
    final JButton sqar_buttn = new JButton ( "# 123/ABC");
    
    public BasicLayout() {

        JFrame window = new JFrame ( "not-so-smartPhone" );
        window.setSize( 405, 500 );

        //adding the lines to the frame
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);
        lines.add(line4);
        lines.add(line5);

        //adding the event listeners to buttons
        ok_buttn.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                    state = ButtonFunctions.pressOK(state);
                    display();
            }
        } );

        buttn_1.addActionListener( new ActionListener() {
            private int count = 0;
            private String[] values1 = {"1", "?", "/", "*", "#"};
            public void actionPerformed( ActionEvent ev ) {
                State newState = ButtonFunctions.press1(state);
                if (newState == null) { //if null is returned from the ButtonFunctions class, input from the user is required.
                    clearLines(lines);
                    //resets all the other buttons' timer values so that their counter start from zero when another button is pressed.
                    lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    long now = System.currentTimeMillis();
                    if (now - lastClick1 < 2000) { //if the button is pressed again in two seconds, return the next character held by the key
                        count++; //increment the count variable so that the next character held by the key can be used to replace what was input before.
                        if (count >= values1.length) { //keeps the counter variable within the 'bounds' of the values array of the button
                            count = 0;
                        }
                        input = input.substring(0, (input.length() - 1)) + values1[count]; //if the button is pressed again, do not add a new character to the input, but change the previous one with the next character held by the key, using the count variable
                    } else { //the button is pressed for the first time, add the first character held by the key to the input, user can change this by pressing the button in two seconds
                        count = 0; 
                        input += values1[count];
                    }

                    lastClick1 = System.currentTimeMillis(); //records the time of the click which is to be compared if the button is consequently pressed again
                } else { state=newState; } //no input required, state used to set the menu according to what is pressed in the previous menu
                  
                display(); //display the contents of the menu on the phone
            }
        } );

        buttn_2.addActionListener( new ActionListener() {
            private AtomicInteger count2 = new AtomicInteger(0); //AtomicInteger is used when the buttons rely on the input() function, so that the function can work with a mutable variable and change the value of it as needed 
            private String[] values2 = { "A", "B", "C", "a" , "b", "c", "2"};
        
            public void actionPerformed( ActionEvent ev ) {
                State newState = ButtonFunctions.press2(state);
                if (newState == null) {
                    clearLines(lines);
                    lastClick1 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    input( lastClick2, values2, count2 );
                    lastClick2 = System.currentTimeMillis();          
                } else { state = newState; }
            
                display();
         }
        } );

        buttn_3.addActionListener( new ActionListener() {
            private AtomicInteger count3 = new AtomicInteger(0);
            private String[] values3 = { "D", "E", "F", "d" , "e", "f", "3"};
            
            public void actionPerformed( ActionEvent ev ) { 
                State newState = ButtonFunctions.press3(state);
                if (newState == null) {
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000; 
                    input(lastClick3, values3, count3);
                    lastClick3 = System.currentTimeMillis();               
                } else { state = newState; }
               
                display();
            }
        } );

        buttn_4.addActionListener( new ActionListener() {
            private AtomicInteger count4 = new AtomicInteger(0);
            private String[] values4 = { "G", "H", "I" , "g" , "h" , "i", "4" };
            
            public void actionPerformed( ActionEvent ev ) {
                State newState = ButtonFunctions.press4(state);
                if (newState == null) {
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    input(lastClick4, values4, count4);
                    lastClick4 = System.currentTimeMillis();                
                } else { state = newState; }
                
                display();
            }
        } );

        buttn_5.addActionListener( new ActionListener() {
            private AtomicInteger count5 = new AtomicInteger(0);
            private String[] values5 = { "J", "K", "L" , "j" , "k" , "l", "5" };
            
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressOther(state);
                if (newState) { 
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    input(lastClick5, values5, count5);
                    lastClick5 = System.currentTimeMillis();
                                    } else { ButtonFunctions.pressOther( state ); }
                
                display();
            }
        } );

        buttn_6.addActionListener( new ActionListener() {
            private AtomicInteger count6 = new AtomicInteger(0);
            private String[] values6 = { "M", "N", "O", "m", "n", "o", "6"};
            
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressOther( state );
                if (newState) { 
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    input(lastClick6, values6, count6);
                    lastClick6 = System.currentTimeMillis();                    
                } else { ButtonFunctions.pressOther( state ); }

                display();
            }
        } );

        buttn_7.addActionListener( new ActionListener() {
            private AtomicInteger count7 = new AtomicInteger(0);
            private String[] values7 = { "P", "Q", "R", "S", "p", "q", "r", "s", "7"};
            
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressOther( state );
                if (newState) { 
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    input(lastClick7, values7, count7);
                    lastClick7 = System.currentTimeMillis();                   
                 } else { ButtonFunctions.pressOther(state); }
                 
                 display();
               }
        } );

        buttn_8.addActionListener( new ActionListener() {
            private AtomicInteger count8 = new AtomicInteger(0);
            private String[] values8 = { "T", "U", "V" , "t" , "u", "v", "8"};
            
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressOther( state );
                if (newState) {
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                   input(lastClick8, values8, count8);
                   lastClick8 = System.currentTimeMillis();
               } else { ButtonFunctions.pressOther( state ); }
               
               display();
            }
        } );

        buttn_9.addActionListener( new ActionListener() {
            private AtomicInteger count9 = new AtomicInteger(0);
            private String[] values9 = { "W", "X", "Y", "Z", "w", "x", "y", "z", "9"};
            
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressOther( state );
                if (newState) {
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick0 = 10000; 
                    input(lastClick9, values9, count9);
                    lastClick9 = System.currentTimeMillis();                    
               } else { ButtonFunctions.pressOther(state); }
                
               display();
            }
        } );

        buttn_0.addActionListener( new ActionListener() {
            private int count = 0;
            private String[] values0 = {" ","0"};
            
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressOther(state );
                if (newState) {
                    clearLines(lines);
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000;  
                    long now = System.currentTimeMillis();
                    if (now - lastClick0 < 2000) {
                        count++;
                        if ((inputType.equals("loweCase")) || (inputType.equals("ABC"))) {
                            if (count >= 1) {
                                count = 0;
                            } 
                        } else if (inputType.equals("123")) {
                              if (count >= values0.length) { count = 1; }
                        }
                    input = input.substring(0, (input.length() - 1)) + values0[count];
                } else {
                    if (inputType.equals("loweCase") || inputType.equals("ABC")) {
                        count = 0;
                    } else if (inputType.equals("123")) { count = 1; }
                        input += values0[count];
                }            
                    lastClick0 = System.currentTimeMillis();
                    
                } else { ButtonFunctions.pressOther( state ); }
              
                display();
          }
        } );

        star_buttn.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressStar(state);
                if (newState) { 
                    clearLines(lines);
                    line1.setText( "You just pressed the star button, star button deletes the last character of an input" );
                    if (input.length() > 0) {
                        input = input.substring(0, (input.length() - 1) ); 
                    }
                } else { ButtonFunctions.pressStar(state); }
                
                display();
            }
        } );

        sqar_buttn.addActionListener( new ActionListener() {
            private int count = 0;
            private String[] valuessq = {"abc" , "ABC", "123" };
            public void actionPerformed( ActionEvent ev ) {
                boolean newState = ButtonFunctions.pressHash(state);
                if (newState) {
                    lastClick1 = 10000; lastClick2 = 10000; lastClick3 = 10000; lastClick4 = 10000; lastClick5 = 10000; lastClick6 = 10000; lastClick7 = 10000; lastClick8 = 10000; lastClick9 = 10000; lastClick0 = 10000;  
                    count++;
                    if (count >= valuessq.length) {
                        count = 0;
                    }
                inputType = valuessq[count];
                   
               } else { ButtonFunctions.pressHash(state); }
                
                display();
            }
        } );

        //adding the lines and the buttons to the frame and setting the basic layout of them
        window.setLayout( null ); //no pre-set layout used in this version
        line1.setBounds ( 10, 10, 380, 40 ); window.add( line1 );   line2.setBounds ( 10, 50, 380, 40 ); window.add( line2 );   line3.setBounds( 10, 90, 380, 40 ); window.add( line3 );
        line4.setBounds ( 10, 130, 380, 40 ); window.add( line4 );   line5.setBounds ( 10, 170, 380, 40 ); window.add( line5 );

        ok_buttn.setBounds( 180, 215, 70, 40); window.add( ok_buttn );   buttn_1.setBounds ( 10,  260, 127, 30 ); window.add( buttn_1 );
        buttn_2.setBounds ( 137, 260, 127, 30 ); window.add( buttn_2 );  buttn_3.setBounds ( 264, 260, 127, 30 ); window.add( buttn_3 );

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

    /**
     * Resets any text that has been set on any of the lines
     * 
     * @param lines_array An array holding all the lines (TextFields) within the frame
     * Mustafa
     */
    public static void clearLines( ArrayList<TextField> lines_array) {
        for ( TextField line : lines_array ) {
            line.setText( " " ) ;
        }

    }
    
    /**
     * Displays contents of the menu depending on the state variable
     * 
     * John
     */
    private void display(){
        switch(state){
            case OFF:
                Display.switchOffDisplay(this);
                break;
            case MAIN_MENU:
                Display.mainMenuDisplay(this);
                break;
            case CONTACTS_MENU:
                Display.contactsMenuDisplay(this);
                break;
            case ADD_CONTACT:
                Display.addContactDisplay(this);
                break;
            case REMOVE_CONTACT:
                Display.removeContactDisplay(this);
                break;
            case TEXTS_MENU:
                Display.textsMenuDisplay(this);
                break;
            case WHO_TO_TEXT:
                Display.whoTextDisplay(this);
                break;
            case ENTER_TEXT:
                Display.enterTextDisplay(this);
                break;
            case RECEIVE_TEXT:
                Display.receiveTextDisplay(this);
                break;
            case CALLS_MENU:
                Display.callsMenuDisplay(this);
                break;
            case WHO_TO_CALL:
                Display.whoCallDisplay(this);
                break;
            case RECORD_CALL:
            case RECEIVE_CALL:
                Display.receiveCallDisplay(this); //these two look the same
                break;
        }
    }
    
    /**
     * Function used by buttons that hold alphanumeric characters when user is prompted for an input.
     * Abstracts the input function so there's less repetition in the code
     * 
     * @param lastClick The corresponding long variable that holds the value of when the button was last pressed.
     * @param values String array that holds all the alphanumeric values associated with the button.
     * @param count A mutable integer that is used to set to refer to different values inside the values array (upper case, lower case and numeric values).
     *              It is ncremented with each click and is used to refer to the values array to get the appropriate character. 
     * 
     * Mustafa
     */
    public static void input( long lastClick, String[] values, AtomicInteger count ) {
        long now = System.currentTimeMillis();
        int upperCaseBound = (values.length - 1) / 2;
        int lowerCaseBound = values.length - 1;
        
        if (now - lastClick < 2000) { //if the button is pressed again in two seconds, return the next character held by the key
            count.addAndGet(1);
            if (inputType.equals("ABC")) {
            if (count.get() >= upperCaseBound){
                count.set(0);
            } } else if (inputType.equals("abc")) {
                if (count.get() >= lowerCaseBound) { count.set(upperCaseBound); }
            } else if (inputType.equals("123")) {
                if (count.get() >= values.length) { count.set(lowerCaseBound); } 
            }
            input = input.substring(0, (input.length() - 1)) + values[count.get()];
        } else {
            if (inputType.equals("ABC")) { count.set(0); }
            else if (inputType.equals("abc")) { count.set(upperCaseBound); }
            else if (inputType.equals("123")) { count.set(lowerCaseBound); }
            input += values[count.get()];
        }
                   
        System.out.println(count);
        lastClick = System.currentTimeMillis();
                   
             }
    
    /**
     * Used when more than one field of input is available to the user and the user completes their input for the first field. When user presses the ok button to go to the next field, the temporary input variable's contents 
     * is set to a new variable that is named to signify it holds the input from the first line of input. The temporary input variable is reset so that it's ready to hold the input that is to be made from the second line.
     * 
     * Mustafa
     */
    public static void line1InputDone() {
        inputL1 = input;
        input = "";       
    }
    
    /**
     * Similar to line1InputDone(), this method is used when more  than one field of input is available to the user and the user completes their input to the second field. The contents of the temporary input variable is 
     * copied to a new variable that is named so that it's obvious it holds the input from the second line of input. The general input variable is reset so that it can hold new values from other fields as user continues on to other menus.
     * 
     * Mustafa 
     */
    public static void line2InputDone() {
        inputL2 = input;
        input = "";
    }
}
