import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ContactServiceTest {
	private ContactService contactService;
	private String id1;
	private String id2;
	private String id3;
	private String id4;
	
	
	@BeforeEach
	void createContactList() {
		contactService = new ContactService();
		id1 = contactService.addContact("Bob", "Builder", "6032785555", "13 Fake St");
		id2 = contactService.addContact("Joe", "Row", "4588895478", "24 Hollow dr");
		id3 = contactService.addContact("Harry", "Stiles", "5045556790", "78 Hey St");
		
	}
	@Test 
	void testDeletesContact(){
		assertNotNull(contactService.deleteContact(id1));
		
		
	}
	@Test
	void testAddContact() {
		id4 = contactService.addContact("Julie", "Home", "4055558971", "74 Lake St");
		
	}
	@Test
	void testUpdatesContactService() {
		
		//String id4 = contactService.addContact("Julie", "Home", "4055558971", "74 Lake St");
		HashMap<String, Contact> contacts = contactService.deleteContact(id2);
		
		assertTrue(contacts.containsKey(id3));
		HashMap<String, Contact> contactList = contactService.updateContact(id3, "Fox", "Bring", "8975558932", "788 High st");
		Contact contactId3 = contactList.get(id3);
		assertEquals(id3, contactId3.getContactId());
		assertEquals("Fox", contactId3.getFirstName());
		assertEquals("Bring", contactId3.getLastName());
		assertEquals("8975558932", contactId3.getNumber());
		assertEquals("788 High st", contactId3.getAddress());
		
	}
	

	
	
	
}
