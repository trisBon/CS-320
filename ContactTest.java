package CS320.Contact;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	// TEST CONSTRUCTOR
		@Test 
		void Contact_testConstructorCreatesNonNullProperties()	{
			Contact newContact = new Contact();
			Assertions.assertNotNull(newContact.getContactID());
			Assertions.assertNotNull(newContact.getFirstName());
			Assertions.assertNotNull(newContact.getLastName());
			Assertions.assertNotNull(newContact.getPhoneNumber());
			Assertions.assertNotNull(newContact.getAddress());
		}
		
	// TEST firstName
		@Test
		void Contact_testSetFirstNameNeverNull()	{
			Contact newContact = new Contact();
			newContact.setFirstName(null);
			Assertions.assertNotNull(newContact.getFirstName());
		}
		
		@Test
		void Contact_testSetFirstNameNeverExceeds10Chars()	{
			Contact newContact = new Contact();
			newContact.setFirstName("12345678901");
			Assertions.assertNotEquals(newContact.getFirstName(), "12345678901");
		}
		
		@Test
		void Contact_testSetFirstNameAcceptsLessThan10Chars()	{
			Contact newContact = new Contact();
			newContact.setFirstName("1234567");
			Assertions.assertEquals(newContact.getFirstName(), "1234567");
		}
		
		
	// TEST lastName
		@Test 
		void Contact_testSetLastNameNeverNull()	{
			Contact newContact = new Contact();
			newContact.setLastName(null);
			Assertions.assertNotNull(newContact.getLastName());
		}
		
		
		@Test
		void Contact_testSetLastNameNeverExceeds10Chars()	{
			Contact newContact = new Contact();
			newContact.setLastName("12345678901");
			Assertions.assertNotEquals(newContact.getLastName(), "12345678901");
		}
		
		@Test
		void Contact_testSetLastNameAcceptsLessThan10Chars()	{
			Contact newContact = new Contact();
			newContact.setLastName("1234567");
			Assertions.assertEquals(newContact.getLastName(), "1234567");
		}
		
	// TESTS phoneNumber
		@Test
		void Contact_testSetPhoneNumberNeverNull()	{
			Contact newContact = new Contact();
			newContact.setPhoneNumber(null);
			Assertions.assertNotNull(newContact.getPhoneNumber());
		}
		
		@Test
		void Contact_testSetPhoneNumberAccepts10Chars()	{
			Contact newContact = new Contact();
			String newPhone = "1234567890";
			newContact.setPhoneNumber(newPhone);
			Assertions.assertEquals(newContact.getPhoneNumber(), newPhone);
		}
		
		@Test
		void Contact_testSetPhoneNumberRejectsUnder10Chars()	{
			Contact newContact = new Contact();
			String newPhone = "12345678910";
			newContact.setPhoneNumber(newPhone);
			Assertions.assertNotEquals(newContact.getPhoneNumber(), newPhone);
		}
		
		@Test
		void Contact_testSetPhoneNumberRejectsOver10Chars()	{
			Contact newContact = new Contact();
			String newPhone = "12345";
			newContact.setPhoneNumber(newPhone);
			Assertions.assertNotEquals(newContact.getPhoneNumber(), newPhone);
		}
		
	// TESTS address
		
		@Test
		void Contact_testSetAddressNeverNull()	{
			Contact newContact = new Contact();
			newContact.setAddress(null);
			Assertions.assertNotNull(newContact.getAddress());
		}
		
		@Test 
		void Contact_testSetAddressRejectsOver30Chars()	{
			Contact newContact = new Contact();
			String newAddress = "1227 42nd Street New York, New York";
			newContact.setAddress(newAddress);
			Assertions.assertNotEquals(newContact.getAddress(), newAddress);
		}
		
		@Test 
		void Contact_testSetAddressAcceptsUnder30Chars()	{
			Contact newContact = new Contact();
			String newAddress = "1234 Baker's Lane";
			newContact.setAddress(newAddress);
			Assertions.assertEquals(newContact.getAddress(), newAddress);
		}
	}

