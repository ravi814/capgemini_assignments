package springcoreq1;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void showDetails(){
        System.out.println("Name:-"+getCustomerName()+" ID:-"+getCustomerId()+" Contact:-"+getCustomerContact()+" Address:-"+getCustomerAddress());
    }
	
	/*
	 * public void cust() {
	 * System.out.println(getCustomerId()+getCustomerName()+getCustomerContact()+
	 * getCustomerAddress()); }
	 */

}
