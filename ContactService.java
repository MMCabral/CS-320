

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class ContactService {	
	
	
	//establishes a unique ID 
		private int uniqueContactId = 1;
		
		//Creates a new HashMap for contacts
		private HashMap< String, Contact> contactIndex = new HashMap<>();
		
		//Adds to the contactIndex new contact info
		public String addContact(String firstName, String lastName, String number,
				String address){
			uniqueContactId++;
			String contactId = "" + uniqueContactId;
			Contact contact = new Contact(contactId, firstName, lastName, number,
					 address);
			contactIndex.put(contactId,  contact);
			return contactId;
		}
		public HashMap<String, Contact> deleteContact(String contactID){
			contactIndex.remove(contactID);
			return contactIndex;
				
		}
		
		//Updates contact info to the contact Index
		public HashMap<String, Contact> updateContact(String contactID, String firstName, String lastName, String number, String address){
			Contact contact = contactIndex.get(contactID);
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setNumber(number);
			contact.setAddress(address);
			contactIndex.put(contactID, contact);
			return contactIndex;
			}
		}




