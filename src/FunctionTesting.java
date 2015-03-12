import static org.junit.Assert.*;
import org.junit.*;

/**
 * The test class FunctionTesting tests state changes from menus.
 *
 * @author  Luke Simmons
 * @version 12/03/2015
 */

public class FunctionTesting {
    
    /**
     * version 1.0: Tests made sure that certain buttons pressed at the necessary menu screens go to the correct locations.
     * version 2.0: Improved code formatting and success messages, made testing more vigorous to test every button press at almost every scenario.
     */
    
    @Test
    public void FunctionTesting() {
        
        /**
         * Testing the OK button.
         */
        
        assertEquals("Pressing OK when adding a contact goes to the same screen",         State.ADD_CONTACT,    ButtonFunctions.pressOK(State.ADD_CONTACT));
        assertEquals("Pressing OK when removing a contact goes to the same screen",       State.REMOVE_CONTACT, ButtonFunctions.pressOK(State.REMOVE_CONTACT));
        assertEquals("Pressing OK when asked who to text goes to the same screen",        State.WHO_TO_TEXT,    ButtonFunctions.pressOK(State.WHO_TO_TEXT));
        assertEquals("Pressing OK when asked who to call goes to the same screen",        State.WHO_TO_CALL,    ButtonFunctions.pressOK(State.WHO_TO_CALL));
        assertEquals("Pressing OK when asked to enter text returns to the main menu",     State.MAIN_MENU,      ButtonFunctions.pressOK(State.ENTER_TEXT));
        assertEquals("Pressing OK when reading a text returns to the main menu",          State.MAIN_MENU,      ButtonFunctions.pressOK(State.RECEIVE_TEXT));
        assertEquals("Pressing OK when recording a call returns to the main menu",        State.MAIN_MENU,      ButtonFunctions.pressOK(State.RECORD_CALL));
        assertEquals("Pressing OK when setting a passcode goes to the main menu",         State.MAIN_MENU,      ButtonFunctions.pressOK(State.SET_PASSCODE));
        assertEquals("Pressing OK when entering a passcode goes to the main menu",        State.MAIN_MENU,      ButtonFunctions.pressOK(State.ENTER_PASSCODE));
        assertEquals("Pressing OK when listening to a call menu retuns to the main menu", State.MAIN_MENU,      ButtonFunctions.pressOK(State.RECEIVE_CALL));
        assertEquals("Pressing OK when the phone is off goes to the main menu",           State.MAIN_MENU,      ButtonFunctions.pressOK(State.OFF));
        assertEquals("Pressing OK at the main menu goes to the same menu",                State.MAIN_MENU,      ButtonFunctions.pressOK(State.MAIN_MENU));
        assertEquals("Pressing OK at the contact menu goes to the same menu",             State.CONTACTS_MENU,  ButtonFunctions.pressOK(State.CONTACTS_MENU));
        assertEquals("Pressing OK at the texts menu goes to the same menu",               State.TEXTS_MENU,     ButtonFunctions.pressOK(State.TEXTS_MENU));
        assertEquals("Pressing OK at the calls menu goes to the same menu",               State.CALLS_MENU,     ButtonFunctions.pressOK(State.CALLS_MENU));
        
        /**
         * Testing the 1 key.
         */
        
        assertEquals("Pressing 1 when phone is off goes to off state",              State.OFF,          ButtonFunctions.press1(State.OFF));
        assertEquals("Pressing 1 at the main menu goes to the calls menu",          State.CALLS_MENU,   ButtonFunctions.press1(State.MAIN_MENU));
        assertEquals("Pressing 1 at the contacts menu goes to adding a contact",    State.ADD_CONTACT,  ButtonFunctions.press1(State.CONTACTS_MENU));
        assertEquals("Pressing 1 when adding a contact does nothing",               null,               ButtonFunctions.press1(State.ADD_CONTACT));
        assertEquals("Pressing 1 when removing a contact does nothing",             null,               ButtonFunctions.press1(State.REMOVE_CONTACT));
        assertEquals("Pressing 1 at the texts menu goes to who to text",            State.WHO_TO_TEXT,  ButtonFunctions.press1(State.TEXTS_MENU));
        assertEquals("Pressing 1 when asked who to text does nothing",              null,               ButtonFunctions.press1(State.WHO_TO_TEXT));
        assertEquals("Pressing 1 when asked to enter text does nothing",            null,               ButtonFunctions.press1(State.ENTER_TEXT));
        assertEquals("Pressing 1 when reading a text goes to the same screen",      State.RECEIVE_TEXT, ButtonFunctions.press1(State.RECEIVE_TEXT));
        assertEquals("Pressing 1 at the calls menu goes to who to call",            State.WHO_TO_CALL,  ButtonFunctions.press1(State.CALLS_MENU));
        assertEquals("Pressing 1 when asked who to call does nothing",              null,               ButtonFunctions.press1(State.WHO_TO_CALL));
        assertEquals("Pressing 1 when recording a call goes to the same screen",    State.RECORD_CALL,  ButtonFunctions.press1(State.RECORD_CALL));
        assertEquals("Pressing 1 when listening to a call goes to the same screen", State.RECEIVE_CALL, ButtonFunctions.press1(State.RECEIVE_CALL));

        /**
         * Testing the 2 key.
         */
        
        assertEquals("Pressing 2 when phone is off goes to off state",              State.OFF,            ButtonFunctions.press2(State.OFF));
        assertEquals("Pressing 2 at the main menu goes to the texts menu",          State.TEXTS_MENU,     ButtonFunctions.press2(State.MAIN_MENU));
        assertEquals("Pressing 2 at the contacts menu goes to removing a contact",  State.REMOVE_CONTACT, ButtonFunctions.press2(State.CONTACTS_MENU));
        assertEquals("Pressing 2 when adding a contact does nothing",               null,                 ButtonFunctions.press2(State.ADD_CONTACT));
        assertEquals("Pressing 2 when removing a contact does nothing",             null,                 ButtonFunctions.press2(State.REMOVE_CONTACT));
        assertEquals("Pressing 2 at the texts menu goes to reading a text",         State.RECEIVE_TEXT,   ButtonFunctions.press2(State.TEXTS_MENU));
        assertEquals("Pressing 2 when asked who to text does nothing",              null,                 ButtonFunctions.press2(State.WHO_TO_TEXT));
        assertEquals("Pressing 2 when asked to enter text does nothing",            null,                 ButtonFunctions.press2(State.ENTER_TEXT));
        assertEquals("Pressing 2 when reading a text goes to the same screen",      State.RECEIVE_TEXT,   ButtonFunctions.press2(State.RECEIVE_TEXT));
        assertEquals("Pressing 2 at calls menu goes to listening to a call",        State.RECEIVE_CALL,   ButtonFunctions.press1(State.CALLS_MENU));
        assertEquals("Pressing 2 when asked who to call does nothing",              null,                 ButtonFunctions.press2(State.WHO_TO_CALL));
        assertEquals("Pressing 2 when recording a call goes to the same screen",    State.RECORD_CALL,    ButtonFunctions.press2(State.RECORD_CALL));
        assertEquals("Pressing 2 when listening to a call goes to the same screen", State.RECEIVE_CALL,   ButtonFunctions.press2(State.RECEIVE_CALL));
        
        /**
         * Testing the 3 key.
         */
        
        assertEquals("Pressing 3 when phone is off goes to off state",              State.OFF,           ButtonFunctions.press3(State.OFF));
        assertEquals("Pressing 3 at the main menu goes to the contacts menu",       State.CONTACTS_MENU, ButtonFunctions.press3(State.MAIN_MENU));
        assertEquals("Pressing 3 at the contacts menu goes to the main menu",       State.MAIN_MENU,     ButtonFunctions.press3(State.CONTACTS_MENU));
        assertEquals("Pressing 3 when adding a contact does nothing",               null,                ButtonFunctions.press3(State.ADD_CONTACT));
        assertEquals("Pressing 3 when removing a contact does nothing",             null,                ButtonFunctions.press3(State.REMOVE_CONTACT));
        assertEquals("Pressing 3 at the texts menu goes to the main menu",          State.MAIN_MENU,     ButtonFunctions.press3(State.TEXTS_MENU));
        assertEquals("Pressing 3 when asked who to text does nothing",              null,                ButtonFunctions.press3(State.WHO_TO_TEXT));
        assertEquals("Pressing 3 when asked to enter text does nothing",            null,                ButtonFunctions.press3(State.ENTER_TEXT));
        assertEquals("Pressing 3 when reading a text goes to the same screen",      State.RECEIVE_TEXT,  ButtonFunctions.press3(State.RECEIVE_TEXT));
        assertEquals("Pressing 3 at the calls menu goes to the main menu",          State.MAIN_MENU,     ButtonFunctions.press3(State.CALLS_MENU));
        assertEquals("Pressing 3 when asked who to call does nothing",              null,                ButtonFunctions.press3(State.WHO_TO_CALL));
        assertEquals("Pressing 3 when recording a call goes to the same screen",    State.RECORD_CALL,   ButtonFunctions.press3(State.RECORD_CALL));
        assertEquals("Pressing 3 when listening to a call goes to the same screen", State.RECEIVE_CALL,  ButtonFunctions.press3(State.RECEIVE_CALL));

        /**
         * Testing the 4 key.
         */
        
        assertEquals("Pressing 4 when phone is off goes to off state",              State.OFF,           ButtonFunctions.press4(State.OFF));
        assertEquals("Pressing 4 at the main menu turns the phone off",             State.OFF,           ButtonFunctions.press4(State.MAIN_MENU));
        assertEquals("Pressing 4 at the contacts menu goes to the same menu",       State.CONTACTS_MENU, ButtonFunctions.press4(State.CONTACTS_MENU));
        assertEquals("Pressing 4 when adding a contact does nothing",               null,                ButtonFunctions.press4(State.ADD_CONTACT));
        assertEquals("Pressing 4 when removing a contact does nothing",             null,                ButtonFunctions.press4(State.REMOVE_CONTACT));
        assertEquals("Pressing 4 at the texts menu goes to the same menu",          State.TEXTS_MENU,    ButtonFunctions.press4(State.TEXTS_MENU));
        assertEquals("Pressing 4 when asked who to text does nothing",              null,                ButtonFunctions.press4(State.WHO_TO_TEXT));
        assertEquals("Pressing 4 when asked to enter text does nothing",            null,                ButtonFunctions.press4(State.ENTER_TEXT));
        assertEquals("Pressing 4 when reading a text goes to the same menu",        State.RECEIVE_TEXT,  ButtonFunctions.press4(State.RECEIVE_TEXT));
        assertEquals("Pressing 4 at the calls menu goes to the same menu",          State.CALLS_MENU,    ButtonFunctions.press4(State.CALLS_MENU));
        assertEquals("Pressing 4 when asked who to call does nothing",              null,                ButtonFunctions.press4(State.WHO_TO_CALL));
        assertEquals("Pressing 4 when recording a call goes to the same screen",    State.RECORD_CALL,   ButtonFunctions.press4(State.RECORD_CALL));
        assertEquals("Pressing 4 when listening to a call goes to the same screen", State.RECEIVE_CALL,  ButtonFunctions.press4(State.RECEIVE_CALL));
        
        /**
         * Testing the star key.  These tests focus on making sure this key operates correctly on screens that involve string input.
         */
        
        assertEquals("Pressing the star key when adding a contact will do something",    true,  ButtonFunctions.pressStar(State.ADD_CONTACT));
        assertEquals("Pressing the star key when removing a contact will do something",  true,  ButtonFunctions.pressStar(State.REMOVE_CONTACT));
        assertEquals("Pressing the star key when asked who to text will do something",   true,  ButtonFunctions.pressStar(State.WHO_TO_TEXT));
        assertEquals("Pressing the star key when asked to enter text will do something", true,  ButtonFunctions.pressStar(State.ENTER_TEXT));
        assertEquals("Pressing the star key when reading a text will do something",      true,  ButtonFunctions.pressStar(State.RECEIVE_TEXT));
        assertEquals("Pressing the star key when asked who to call will do something",   true,  ButtonFunctions.pressStar(State.WHO_TO_CALL));
        assertEquals("Pressing the star key when the phone is off does nothing",         false, ButtonFunctions.pressStar(State.OFF));
        assertEquals("Pressing the star key at the main menu does nothing",              false, ButtonFunctions.pressStar(State.MAIN_MENU));
        assertEquals("Pressing the star key at the contact menu does nothing",           false, ButtonFunctions.pressStar(State.CONTACTS_MENU));
        assertEquals("Pressing the star key at the texts menu does nothing",             false, ButtonFunctions.pressStar(State.TEXTS_MENU));
        assertEquals("Pressing the star key at the calls menu does nothing",             false, ButtonFunctions.pressStar(State.CALLS_MENU));
        assertEquals("Pressing the star key when recording a call does nothing",         false, ButtonFunctions.pressStar(State.RECORD_CALL));
        assertEquals("Pressing the star key when listening to a call does nothing",      false, ButtonFunctions.pressStar(State.RECEIVE_CALL));
        
        /**
         * Testing the hash key.  These tests focus on making sure this key operates correctly on screens that involve string input.
         */
        
        assertEquals("Pressing the hash key when adding a contact will do something",    true,  ButtonFunctions.pressHash(State.ADD_CONTACT));
        assertEquals("Pressing the hash key when removing a contact will do something",  true,  ButtonFunctions.pressHash(State.REMOVE_CONTACT));
        assertEquals("Pressing the hash key when asked who to text will do something",   true,  ButtonFunctions.pressHash(State.WHO_TO_TEXT));
        assertEquals("Pressing the hash key when asked to enter text will do something", true,  ButtonFunctions.pressHash(State.ENTER_TEXT));
        assertEquals("Pressing the hash key when asked who to call will do something",   true,  ButtonFunctions.pressHash(State.WHO_TO_CALL));
        assertEquals("Pressing the hash key when the phone is off does nothing",         false, ButtonFunctions.pressHash(State.OFF));
        assertEquals("Pressing the hash key at the main menu does nothing",              false, ButtonFunctions.pressHash(State.MAIN_MENU));
        assertEquals("Pressing the hash key at the contact menu does nothing",           false, ButtonFunctions.pressHash(State.CONTACTS_MENU));
        assertEquals("Pressing the hash key at the texts menu does nothing",             false, ButtonFunctions.pressHash(State.TEXTS_MENU));
        assertEquals("Pressing the hash key when reading a text will do nothing",        false, ButtonFunctions.pressHash(State.RECEIVE_TEXT));
        assertEquals("Pressing the hash key at the calls menu does nothing",             false, ButtonFunctions.pressHash(State.CALLS_MENU));
        assertEquals("Pressing the hash key when recording a call does nothing",         false, ButtonFunctions.pressHash(State.RECORD_CALL));
        assertEquals("Pressing the hash key when listening to a call does nothing",      false, ButtonFunctions.pressHash(State.RECEIVE_CALL));
        
        /**
         * Testing all other keys.  These tests focus on making sure these keys operate correctly on screens that involve string input.
         */
        
        assertEquals("Pressing the other key when adding a contact will do something",    true,  ButtonFunctions.pressOther(State.ADD_CONTACT));
        assertEquals("Pressing the other key when removing a contact will do something",  true,  ButtonFunctions.pressOther(State.REMOVE_CONTACT));
        assertEquals("Pressing the other key when asked who to text will do something",   true,  ButtonFunctions.pressOther(State.WHO_TO_TEXT));
        assertEquals("Pressing the other key when asked to enter text will do something", true,  ButtonFunctions.pressOther(State.ENTER_TEXT));
        assertEquals("Pressing the other key when asked who to call will do something",   true,  ButtonFunctions.pressOther(State.WHO_TO_CALL));
        assertEquals("Pressing the other key when the phone is off does nothing",         false, ButtonFunctions.pressOther(State.OFF));
        assertEquals("Pressing the other key at the main menu does nothing",              false, ButtonFunctions.pressOther(State.MAIN_MENU));
        assertEquals("Pressing the other key at the contact menu does nothing",           false, ButtonFunctions.pressOther(State.CONTACTS_MENU));
        assertEquals("Pressing the other key at the texts menu does nothing",             false, ButtonFunctions.pressOther(State.TEXTS_MENU));
        assertEquals("Pressing the other key when reading a text will do nothing",        false, ButtonFunctions.pressOther(State.RECEIVE_TEXT));
        assertEquals("Pressing the other key at the calls menu does nothing",             false, ButtonFunctions.pressOther(State.CALLS_MENU));
        assertEquals("Pressing the other key when recording a call does nothing",         false, ButtonFunctions.pressOther(State.RECORD_CALL));
        assertEquals("Pressing the other key when listening to a call does nothing",      false, ButtonFunctions.pressOther(State.RECEIVE_CALL));
        
    }
}
