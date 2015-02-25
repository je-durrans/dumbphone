/**
 * This class has all the methods used to display the appropriate screen on each menu and action taken.
 *
 * @author Luke Simmons 
 * @version 23/02/2015
 */

public class Display {

    //BasicLayoutInput screen = new BasicLayoutInput();

    static void setPasscodeDisplay(BasicLayout screen) {  //Display shown when setting the passcode.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("Set passcode");

    }

    static void enterPasscodeDisplay(BasicLayout screen) {  //Display shown when entering the passcode.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("Enter passcode");

    }

    static void mainMenuDisplay(BasicLayout screen) {  //Display shown when at the main menu.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Calls");
        screen.line3.setText("2. Texts");
        screen.line4.setText("3. Contacts");
        screen.line5.setText("4. Off");

    }

    static void contactsMenuDisplay(BasicLayout screen) {  //Display shown when at the contacts menu.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Add");
        screen.line3.setText("2. Remove");
        screen.line4.setText("3. Exit");

    }

    static void addContactDisplay(BasicLayout screen) {  //Display shown when adding a contact.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");

    }

    static void removeContactDisplay(BasicLayout screen) {  //Display shown when removing a contact.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");

    }

    static void textsMenuDisplay(BasicLayout screen) {  //Display shown when at the texting menu.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Send");
        screen.line3.setText("2. Receive");
        screen.line4.setText("3. Exit");

    }

    static void whoTextDisplay(BasicLayout screen) {  //Display shown when asked who to text.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");

    }

    static void enterTextDisplay(BasicLayout screen) {  //Display shown when entering the text contents.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter text");

    }

    static void receiveTextDisplay(BasicLayout screen) {  //Display shown when accessing a text.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");

    }

    static void callsMenuDisplay(BasicLayout screen) {  //Display shown when at the calls menu.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("123");
        screen.line2.setText("1. Make");
        screen.line3.setText("2. Answer");
        screen.line4.setText("3. Exit");

    }

    static void whoCallDisplay(BasicLayout screen) {  //Display shown when asked who to call.

        BasicLayoutInput.clearLines(screen.lines);
        screen.line1.setText("abc");
        screen.line2.setText("Enter name");
        screen.line3.setText("Enter number");

    }

    static void receiveCallDisplay(BasicLayout screen) {  //Display shown when answering a call.

        BasicLayoutInput.clearLines(screen.lines);

    }



    static void switchOffDisplay(BasicLayout screen) {  //Display shown when switching off the phone.

        BasicLayoutInput.clearLines(screen.lines);

    }

}
