package moviemanager.Modals;

public class Customer {
	private String name;
	private String address;
	private String type;
	
	public Customer(String name, String address, String type) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;
	}
	
	public Customer() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
