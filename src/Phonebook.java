import java.util.*;

/**
 * Keeps track of contacts in the phonebook and allows the user to add and remove them.
 * 
 * @author Luke Simmons
 * @version 25/02/2015
 */

public class Phonebook {
    
    private int total;
    private Map<String,String> phonebook = new HashMap<String,String>();
    
    /** 
     * Initialises the phonebook and adds the first contact, the phone owner.
     */
    public Phonebook() {
        total = 0;
    }
    
    /**
     * Adds a contact to the phonebook, unless the contact already exists or the phone number 
     * is too short or too long, in which case it returns an error message.
     */
    public String addContact(String number, String name) {
        
        if (phonebook.containsKey(name) == true) {
            return "Contact already exists";
        }
        
        if (number.length() > 15 | number.length() < 7) {
            return "Invalid number";
        }
        
        phonebook.put(name,number);
        total++;
        return "Added" + name;
    }
    
    /**
     * Removes a contact unless the contact does not exist, which results in an error message.
     */
    public String removeContact(String name) {
        
        if (phonebook.containsKey(name) == false) {
            return "Contact does not exist";
        }
        
        phonebook.remove(name);
        total--;
        return "Deleted" + name;
    }
    
}
