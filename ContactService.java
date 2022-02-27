package CS320.Contact;
import java.util.ArrayList;
import java.lang.String;

public class ContactService {
	static ArrayList<Contact> contactList = new ArrayList<Contact>(); // arrayList to hold contacts
	
	public static void addContact(Contact aContact) {
		contactList.add(aContact);
	}

	public static Contact retrieveContact(String contactID) { // method ensuring contactID exists
		for(Contact contact : contactList)	{
			if (contact.getContactID().trim().equals(contactID.trim()))	{ // ensure contactID
				return contact;
			}
		}
		return null;
	}
	
	public static void updateContact(String contactID, String firstName, String lastName, String phoneNumber, String contactAddress)	{
		Contact retrievedContact = retrieveContact(contactID);

		if (retrievedContact != null)	{
			if (firstName != null)	{
				retrievedContact.setFirstName(firstName);
			}
			if (lastName != null)	{
				retrievedContact.setLastName(lastName);
			}
			
			if (phoneNumber != null)	{
				retrievedContact.setPhoneNumber(phoneNumber);
			}
			
			if (contactAddress != null)	{
				retrievedContact.setAddress(contactAddress);
			}
		}
	}
	
	public static void deleteContact(String contactID)	{
		Contact retrievedContact = retrieveContact(contactID);
		contactList.remove(retrievedContact);
	}
	
	public static void main(String[] args) { // code in main method code used to pre-test code
		int i; 
		for(i =0; i < contactList.size(); ++i)	{
			contactList.get(i).print();
		}	
	}
}
