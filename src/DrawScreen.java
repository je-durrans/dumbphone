import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.ArrayList;

/**
 * Write a description of class MainMenu here.
 * 
 * @author Luke Simmons 
 * @version 23/02/2015
 */

public class DrawScreen {
        
    BasicLayoutInput screen = new BasicLayoutInput();

    void setPasscodeDisplay() {
        
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("Set passcode");
        
    }

    void enterPasscodeDisplay() {
        
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("Enter passcode");
        
    }

    void mainMenuDisplay() {
        
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Calls");
        screen.line3.setText("2. Texts");
        screen.line4.setText("3. Contacts");
        screen.line5.setText("4. Off");
        
    }

    void contactsMenuDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Add");
        screen.line3.setText("2. Remove");
        screen.line4.setText("3. Exit");
        
    }

    void addContactDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
    
    }

    void removeContactDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        
    }

    void textsMenuDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Send");
        screen.line3.setText("2. Receive");
        screen.line4.setText("3. Exit");
        
    }

    void whoTextDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
    
    }

    void enterTextDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter text");
    
    }

    void receiveTextDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
    
    }

    void callsMenuDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Make");
        screen.line3.setText("2. Answer");
        screen.line4.setText("3. Exit");
        
    }

    void whoCallDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
        
    }

    void receiveCallDisplay() {
    
        BasicLayoutInput.clearLines(screen.lines);
    
    }
    
    void switchOffDisplay() {
        
        BasicLayoutInput.clearLines(screen.lines);
        
    }
    
}
