package beauty_Saloon;

public class Visit {
	

	public static Customer cname;
	public static double cust_service_amt;
	public static double cust_product_amt;
	public static double total;
	public Visit(Customer name) {
		this.cname = name;
		
	}
	
	public String getCname() {
		return cname.getCust_Name();
	}
	/*public void setCname(String cname) {
		this.cname = cname;
	}*/
	public static double getCust_service_amt() {
		return cust_service_amt;
	}
	public void setCust_service_amt(double cust_service_amt) {
		this.cust_service_amt = this.cust_service_amt+ cust_service_amt;
	}
	public static double getCust_product_amt() {
		return cust_product_amt;
	}
	public void setCust_product_amt(double cust_product_amt) {
		this.cust_product_amt = this.cust_product_amt+cust_product_amt;
	}
	
	
	public static double getTotal(){
		total=(cust_product_amt-(cust_product_amt*Discount.getProductDiscount(cname.getCust_membership()))+
				cust_service_amt-(cust_service_amt*Discount.getServiceDiscount(cname.getCust_membership())));
		return total;
	}
	
}
