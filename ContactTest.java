import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ContactTest {
	private Contact contact;
	
	@BeforeEach
	void beforeEach() {
		contact = new Contact("10", "Joe", "Borrow", "6035556555", "13 fake st");
	}
	@Test
	void testContactIdFails() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact = new Contact("12345678999", "Joe", "Borrow", "6035556555", "13 fake st");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Joe", "Borrow", "6035556555", "13 fake st");
		});
	}
	@Test
	void testContactNameFails() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "TooLongofaName", "Borrow", "6035556555", "13 fake st");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678999", null, "Borrow", "6035556555", "13 fake st");
		});
	}
	@Test
	void testContactLastNameFails() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Joe", "TooLongofaLastName", "6035556555", "13 fake st");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678999", "Joe", null, "6035556555", "13 fake st");
		});
	}
	@Test
	void testContactNumberFails() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Joe", "Borrow", "603555655588", "13 fake st");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678999", "Joe", "Borrow", null, "13 fake st");
		});
		
	}
	@Test
	void testContactAddressFails() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Joe", "Borrow", "6035556555", "12345 This address is way too long is it even a real location?");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678999", "Joe", "Borrow", "6035556555", null);
		});
	}
	
	@Test
    void testContactCreation() {
               assertEquals("10", contact.getContactId());
               assertEquals("Joe", contact.getFirstName());
               assertEquals("Borrow", contact.getLastName());
               assertEquals("6035556555", contact.getNumber());
               assertEquals("13 fake st", contact.getAddress());
        
	}
	
	@Test
	void testContactSetters() {
		String firstName = "Mitch";
		String lastName = "Homer";
		String number = "9785557155";
		String address = "32 Simple dr";
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setNumber(number);
		contact.setAddress(address);
		assertEquals(firstName, contact.getFirstName());
		assertEquals(lastName, contact.getLastName());
		assertEquals(number, contact.getNumber());
		assertEquals(address, contact.getAddress());
		
		
	}
}
