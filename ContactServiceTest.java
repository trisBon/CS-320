package CS320.Contact;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void ContactService_testAddConctact() {
		Contact newContact = new Contact();
		Contact retrievedContact = ContactService.retrieveContact(newContact.getContactID());
		Assertions.assertNull(retrievedContact);	
		
		ContactService.addContact(newContact);
		retrievedContact = ContactService.retrieveContact(newContact.getContactID());
		Assertions.assertEquals(newContact, retrievedContact);
	}

	@Test
	void ContactService_testUpdateContact() {
		Contact newContact = new Contact();
		newContact.setFirstName("Jenny");
		newContact.setLastName("Spring");
		newContact.setPhoneNumber("1234567890");
		newContact.setAddress("8675 Oh Nine");
		
		ContactService.addContact(newContact);
		ContactService.updateContact(newContact.getContactID(), "Janey", "Sprig", "1223456789", "8675 Three Oh Nine");
		Assertions.assertEquals(newContact.getFirstName(), "Janey");
		Assertions.assertEquals(newContact.getLastName(), "Sprig");
		Assertions.assertEquals(newContact.getPhoneNumber(), "1223456789");
		Assertions.assertEquals(newContact.getAddress(), "8675 Three Oh Nine");
		
		ContactService.updateContact(newContact.getContactID(), null, null, null, null);
		Assertions.assertNotNull(newContact.getFirstName());
		Assertions.assertNotNull(newContact.getLastName());
		Assertions.assertNotNull(newContact.getPhoneNumber());
		Assertions.assertNotNull(newContact.getAddress());			
	}

	@Test
	void ContactService_testDeleteContact() {
		Contact newContact = new Contact();
		newContact.setFirstName("Jenny");
		newContact.setLastName("Spring");
		newContact.setPhoneNumber("1234567890");
		newContact.setAddress("8675 Oh Nine");
		
		ContactService.deleteContact(newContact.getContactID());
		Contact retrievedContact = ContactService.retrieveContact(newContact.getContactID());
		Assertions.assertNull(retrievedContact);
	}	
}	
	
