import java.util.*;

public class Phonebook {
    
    int total;
    Map<String,String> phonebook = new HashMap<String,String>();
    
    /** 
     * Initialises the phonebook and adds the first contact, the phone owner.
     */
    public Phonebook(String myNumber) {
        phonebook.put("Me", myNumber);
        total = 1;
    }
    
    /**
     * Adds a contact to the phonebook, unless the contact already exists or the phone number 
     * is too short or too long, in which case it returns an error message.
     */
    public String addContact(String number, String name) {
        
        if (phonebook.containsKey(name) == true) {
            return "Contact already exists";
        }
        
        if (number.length() > 11 | number.length() < 3) {
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
    
    /**
     * Edits the number of an already existing contact, unless the contact does not exist, 
     * in which case it will display an error message.
     */
    public String editContact(String name, String newNumber){
        
        if (phonebook.containsKey(name) == false) {
            return "Contact does not exist";
        }
        
        if (newNumber.length() > 11 | newNumber.length() < 3) {
            return "Invalid number";
        }
        
        phonebook.put(name,newNumber);
        return name + "'s number changed";
    }
    
}

