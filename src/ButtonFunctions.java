/**
 * Created by John on 23/02/2015.
 * Button functions carry out the required functionality given the state of the phone
 * OK and buttons 1-4 also return the next state of the phone
 * returning null indicates that the state should stay the same *and* an input method should be called
 */
public class ButtonFunctions {
    //state = off, setPasscode, enterPasscode, mainMenu, contactsMenu, addContact, removeContact,
    //      | textsMenu, whoText, enterText, receiveText, callsMenu, whoCall, recordCall, receiveCall
    
    boolean passcodeSet=false;
    static BasicLayout phone = new BasicLayout();
    static boolean target_is_name = true;
    static Box calling = new Box();
    static String password;

    /*public static void main(String[] args) {
        ButtonFunctions s = new ButtonFunctions();
        s.pressOK();
    }*/
    public static void main(String[] args) {
        BasicLayout b = new BasicLayout();
    }
    static State pressOK(State state){
        switch(state){

            case ADD_CONTACT:
            case REMOVE_CONTACT:
            case WHO_TO_TEXT:
            case WHO_TO_CALL:
                if(target_is_name){
                    BasicLayout.line1InputDone();
                    target_is_name=false;
                    return state;
                }else{
                    BasicLayout.line2InputDone();
                    target_is_name=true;
                    switch(state){
                        case ADD_CONTACT:
                            //addContact();
                            return State.MAIN_MENU;
                        case REMOVE_CONTACT:
                            //removeContact();
                            return State.MAIN_MENU;
                        case WHO_TO_TEXT:
                            //sendText();
                            return State.ENTER_TEXT;
                        case WHO_TO_CALL:
                            //sendCall();
                            return State.RECORD_CALL;
                    }
                }

            case ENTER_TEXT:
                //sendText();
                return State.MAIN_MENU;

            case RECEIVE_TEXT:
                new PlaySound();
                BasicLayout.line1.setText(TextSend.content);
                return State.MAIN_MENU;

            case RECORD_CALL:
                if(calling.b){
                    RecordSound.stopper.start();
                }else{
                    new Thread(){public void run(){new RecordSound("127.0.0.1");}}.start();
                }
                calling.b=!calling.b;
                return State.MAIN_MENU;

            case SET_PASSCODE:
                password = BasicLayout.line2.getText();
                return State.MAIN_MENU;

            case ENTER_PASSCODE:
                       String pass = BasicLayout.line2.getText();
                       if (!pass.equals(password)) {
                           Ringtone.sadSound();
                           return state;
                       }  else {
                           Ringtone.happySound();
                           return State.MAIN_MENU;
                       }

            case RECEIVE_CALL:
                new Thread(){public void run(){new PlaySound();}}.start();
                return State.MAIN_MENU;

            case OFF:
                return State.MAIN_MENU;//delete this line
            case MAIN_MENU:
            case CONTACTS_MENU:
            case TEXTS_MENU:
            case CALLS_MENU:
                return state;
        }
        return state;
    }

    static State press1(State state){
        switch(state) {
            case OFF:
                return state;
            case MAIN_MENU:
                return State.CALLS_MENU;
            case CONTACTS_MENU:
                return State.ADD_CONTACT;
            case ADD_CONTACT:
            case REMOVE_CONTACT:
                return null;//input(1, count, value);
            //return state;
            case TEXTS_MENU:
                return State.WHO_TO_TEXT;
            case WHO_TO_TEXT:
            case ENTER_TEXT:
                return null;//input(1, count, value);
            case RECEIVE_TEXT:
                return state;
            case CALLS_MENU:
                return State.WHO_TO_CALL;
            case WHO_TO_CALL:
                return null;//input(1, count, value);
            case RECORD_CALL:
            case RECEIVE_CALL:


            default:
                return state;

        }
    }

    static State press2(State state){
        switch(state){
            case OFF:
                return state;
            case MAIN_MENU:
                return State.TEXTS_MENU;
            case CONTACTS_MENU:
                return State.REMOVE_CONTACT;
            case ADD_CONTACT:
            case REMOVE_CONTACT:
                return null;//input(2, count, value);
            case TEXTS_MENU:
                return State.RECEIVE_TEXT;
            case WHO_TO_TEXT:
            case ENTER_TEXT:
                return null;//input(2, count, value);
            case RECEIVE_TEXT:
                return state;
            case CALLS_MENU:
                return State.RECEIVE_CALL;
            case WHO_TO_CALL:
                return null;//input(2, count, value);
            case RECORD_CALL:
                return state;
            case RECEIVE_CALL:
                return state;
        }
        return state;
    }

    static State press3(State state){
        switch(state){
            case OFF:
                return state;
            case MAIN_MENU:
                return State.CONTACTS_MENU;
            case CONTACTS_MENU:
                return State.MAIN_MENU;
            case ADD_CONTACT:
            case REMOVE_CONTACT:
                return null;//input(3, count, value);
            case TEXTS_MENU:
                return State.MAIN_MENU;
            case WHO_TO_TEXT:
            case ENTER_TEXT:
                return null;//input(3, count, value);
            case RECEIVE_TEXT:
                return state;
            case CALLS_MENU:
                return State.MAIN_MENU;
            case WHO_TO_CALL:
                return null;//input(3, count, value);
            case RECORD_CALL:
                return state;
            case RECEIVE_CALL:
                return state;
        }
        return state;
    }

    static State press4(State state){
        switch(state){
            case OFF:
                return state;
            case MAIN_MENU:
                BasicLayout.clearLines(BasicLayout.lines);
                new SwitchOn(phone);
                return State.OFF;
            case CONTACTS_MENU:
                return state;
            case ADD_CONTACT:
            case REMOVE_CONTACT:
                return null;//input(4, count, value);
            case TEXTS_MENU:
                return state;
            case WHO_TO_TEXT:
            case ENTER_TEXT:
                return null;//input(4, count, value);
            case RECEIVE_TEXT:
                return state;
            case CALLS_MENU:
                return state;
            case WHO_TO_CALL:
                return null;//input(4, count, value);
            case RECORD_CALL:
                return state;
            case RECEIVE_CALL:
                return state;
        }
        return state;
    }

    static boolean pressOther(State state){
        switch(state){
            case ADD_CONTACT:
            case REMOVE_CONTACT:
            case WHO_TO_TEXT:
            case ENTER_TEXT:
            case WHO_TO_CALL:
                return true;//input(digit, count, value);
        }
        return false;
    }

    static boolean pressStar(State state){
        switch(state){
            case ADD_CONTACT:
            case REMOVE_CONTACT:
            case WHO_TO_TEXT:
            case ENTER_TEXT:
            case RECEIVE_TEXT:
            case WHO_TO_CALL:
                return true;//backspace();
        }
        return false;
    }

    static boolean pressHash(State state){
        switch(state){
            case ADD_CONTACT:
            case REMOVE_CONTACT:
            case WHO_TO_TEXT:
            case ENTER_TEXT:
            case WHO_TO_CALL:
                return true;//toggle()
        }
        return false;
    }

    private boolean validatePasscode() {
        return true;
    }

    static void addContact(){}

    static void removeContact(){}

}
