package CS320.Contact;

public class Contact {
	private static int idCounter; // counter to generate unique unmodifiable contactIDs
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress; 
	
	// default constructor ensures all values initialized to non-null values
	public Contact()	{
		contactID = Integer.toString(idCounter++); 
		firstName = "needsfname";
		lastName = "needslname";
		phoneNumber = "5555555555";
		contactAddress = "getAddress";
	}
	
	public String getContactID()	{
		return contactID;
	}
	
	public void setFirstName(String fname)	{
		if (fname!= null)	{
			if(fname.length() <= 10)	{
				firstName = fname;
			}
		}
	}
	
	public String getFirstName() 	{
		return this.firstName;	
	}

	public void setLastName(String lname)	{
		if (lname != null)	{
				if (lname.length() <= 10)	{
			lastName = lname;
				}
		}
	}
	
	public String getLastName() 	{
		return this.lastName;	
	}
	
	public void setPhoneNumber(String pnumber) {
		if (pnumber != null)	{
			if (pnumber.length() == 10)	{
				phoneNumber = pnumber;
			}
		}		
	}
	
	public String getPhoneNumber() 	{
		return this.phoneNumber;	
	}
	
	public void setAddress(String address)	{
		if (address != null)	{
			if (address.length() <= 30)	{
				contactAddress = address;
			}	
		}
	}
	
	public String getAddress() 	{
		return this.contactAddress;	
	}
	
	// print method used to pre-test code
	public void print()	{
		System.out.println(contactID + " " + firstName + " " + lastName + " " + phoneNumber + " " + contactAddress);
	}
	
}
