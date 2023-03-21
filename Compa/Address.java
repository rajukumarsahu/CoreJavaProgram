package Compa;

public class Address {

	private String Street;
	
	private int pincode;

	public Address(String street, int pincode) {
		super();
		this.Street = street;
		this.pincode = pincode;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", pincode=" + pincode + "]";
	}
	
	
}
