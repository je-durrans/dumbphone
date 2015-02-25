/**
 * This class has all the methods used to display the appropriate screen on each menu and action taken.
 *
 * @author Luke Simmons 
 * @version 23/02/2015
 */

public class Display {

    static void setPasscodeDisplay(BasicLayout screen) {  //Display shown when setting the passcode.

        screen.line1.setText("123");
        screen.line2.setText("Set passcode");
        screen.line3.setText("");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void enterPasscodeDisplay(BasicLayout screen) {  //Display shown when entering the passcode.

        screen.line1.setText("123");
        screen.line2.setText("Enter passcode");
        screen.line3.setText("");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void mainMenuDisplay(BasicLayout screen) {  //Display shown when at the main menu.

        screen.line1.setText("123");
        screen.line2.setText("1. Calls");
        screen.line3.setText("2. Texts");
        screen.line4.setText("3. Contacts");
        screen.line5.setText("4. Off");

    }

    static void contactsMenuDisplay(BasicLayout screen) {  //Display shown when at the contacts menu.

        screen.line1.setText("123");
        screen.line2.setText("1. Add");
        screen.line3.setText("2. Remove");
        screen.line4.setText("3. Exit");
        screen.line5.setText("");

    }

    static void addContactDisplay(BasicLayout screen) {  //Display shown when adding a contact.

        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
        screen.line4.setText("");
        screen.line5.setText("");
        

    }

    static void removeContactDisplay(BasicLayout screen) {  //Display shown when removing a contact.

        screen.line1.setText("abc");
        screen.line2.setText("Enter name");

    }

    static void textsMenuDisplay(BasicLayout screen) {  //Display shown when at the texting menu.

        screen.line1.setText("123");
        screen.line2.setText("1. Send");
        screen.line3.setText("2. Receive");
        screen.line4.setText("3. Exit");

    }

    static void whoTextDisplay(BasicLayout screen) {  //Display shown when asked who to text.

        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void enterTextDisplay(BasicLayout screen) {  //Display shown when entering the text contents.

        screen.line1.setText("abc");
        screen.line2.setText("Enter text");
        screen.line3.setText("");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void receiveTextDisplay(BasicLayout screen) {  //Display shown when accessing a text.

        screen.line1.setText("abc");
        screen.line2.setText("");
        screen.line3.setText("");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void callsMenuDisplay(BasicLayout screen) {  //Display shown when at the calls menu.

        screen.line1.setText("123");
        screen.line2.setText("1. Make");
        screen.line3.setText("2. Answer");
        screen.line4.setText("3. Exit");
        screen.line5.setText("");

    }

    static void whoCallDisplay(BasicLayout screen) {  //Display shown when asked who to call.

        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void receiveCallDisplay(BasicLayout screen) {  //Display shown when answering a call.

        screen.line1.setText("");
        screen.line2.setText("");
        screen.line3.setText("");
        screen.line4.setText("");
        screen.line5.setText("");

    }

    static void switchOffDisplay(BasicLayout screen) {  //Display shown when switching off the phone.

        screen.line1.setText("");
        screen.line2.setText("");
        screen.line3.setText("");
        screen.line4.setText("");
        screen.line5.setText("");

    }

}
