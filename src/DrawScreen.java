/**
 * This class has all the methods used to display the appropriate screen on each menu and action taken.
 * 
 * @author Luke Simmons 
 * @version 23/02/2015
 */

public class ScreenDisplay {
        
    BasicLayoutInput screen = new BasicLayoutInput();
    
    void setPasscodeDisplay() {  //Display shown when setting the passcode.
        
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("Set passcode");
        
    }

    void enterPasscodeDisplay() {  //Display shown when entering the passcode.
        
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("Enter passcode");
        
    }

    void mainMenuDisplay() {  //Display shown when at the main menu.
        
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Calls");
        screen.line3.setText("2. Texts");
        screen.line4.setText("3. Contacts");
        screen.line5.setText("4. Off");
        
    }

    void contactsMenuDisplay() {  //Display shown when at the contacts menu.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Add");
        screen.line3.setText("2. Remove");
        screen.line4.setText("3. Exit");
        
    }

    void addContactDisplay() {  //Display shown when adding a contact.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
    
    }

    void removeContactDisplay() {  //Display shown when removing a contact.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        
    }

    void textsMenuDisplay() {  //Display shown when at the texting menu.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Send");
        screen.line3.setText("2. Receive");
        screen.line4.setText("3. Exit");
        
    }

    void whoTextDisplay() {  //Display shown when asked who to text.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
    
    }

    void enterTextDisplay() {  //Display shown when entering the text contents.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter text");
    
    }

    void receiveTextDisplay() {  //Display shown when accessing a text.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
    
    }

    void callsMenuDisplay() {  //Display shown when at the calls menu.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Make");
        screen.line3.setText("2. Answer");
        screen.line4.setText("3. Exit");
        
    }

    void whoCallDisplay() {  //Display shown when asked who to call.
    
        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
        
    }

    void receiveCallDisplay() {  //Display shown when answering a call.
    
        BasicLayoutInput.clearLines(screen.lines);
    
    }
    
    void switchOffDisplay() {  //Display shown when switching off the phone.
        
        BasicLayoutInput.clearLines(screen.lines);
        
    }
    
}
