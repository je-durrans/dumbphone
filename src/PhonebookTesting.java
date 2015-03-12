import static org.junit.Assert.*;
import org.junit.*;

/**
 * The test class PhonebookTesting tests all functions involving the contacts array.
 *
 * @author  Luke Simmons
 * @version 12/03/2015
 */
public class PhonebookTesting {
   
    @Test
    public void PhonebookTesting() {
        
        Phonebook test = new Phonebook();
        assertEquals("Adding a valid contact inserts said contact into the phonebook",               "Added Joe",              test.addContact("00.00.00.00","Joe"));
        assertEquals("Adding a contact that already exists results in an error message saying so",   "Contact already exists", test.addContact("00.00.00.00","Joe"));
        assertEquals("Adding a contact with a too short IP address results in an error message",     "Invalid number",         test.addContact("short","Brad"));
        assertEquals("Adding a contact with a too long IP address results in an error message",      "Invalid number",         test.addContact("verylongIPaddress","Brad"));
        assertEquals("Deleting a valid contact removes said contact from the phonebook",             "Deleted Joe",            test.removeContact("Joe"));
        assertEquals("Deleting a contact that does not exist results in an error message saying so", "Contact does not exist", test.removeContact("Brad"));
        test = null;
        
    }
}
