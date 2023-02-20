

public class Contact {
	
	final String contactId;
	String firstName;
	String lastName;
	String number;
	String address;
	
	public Contact (String contactId, String firstName, String lastName, String number,
			String address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid input");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid input");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid input");
		}
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid input");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid input");
		}
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}

	public String getContactId() {
		return contactId;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
