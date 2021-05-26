package beauty_Saloon;

public class Customer {
	public String cust_Name;
	public boolean ismember;
	public String cust_membership;
	
	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public boolean isIsmember() {
		return ismember;
	}

	public void setIsmember(boolean ismember) {
		this.ismember = ismember;
	}

	public String getCust_membership() {
		return cust_membership;
	}

	public void setCust_membership(String cust_membership) {
		this.cust_membership = cust_membership;
	}

	
	
	public Customer() {
		this.ismember=false;
	}

	public Customer(String cust_Name, boolean ismember, String cust_membership) {
		super();
		this.cust_Name = cust_Name;
		this.ismember = ismember;
		this.cust_membership = cust_membership;
	}

	@Override
	public String toString() {
		return "Customer [cust_Name=" + cust_Name + ", ismember=" + ismember + ", cust_membership=" + cust_membership
				+ "]";
	}
	
	
}
