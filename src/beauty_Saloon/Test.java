package beauty_Saloon;

public class Test {
	public static void main(String[] args) {
		Customer c1 = new Customer("abhishek",true,"Premium");
		Customer c2 = new Customer("Umesh",true,"Silver");
		Customer c3= new Customer("Sanjit",true,"Gold");
		
		Visit v1 = new Visit(c1);
		
			v1.setCust_product_amt(2000);
			v1.setCust_product_amt(50000);
			v1.setCust_service_amt(23000);
			//v1.setCust_service_amt(5000);
			System.out.println("Customer Name:"+v1.getCname()+"\ntotal amount:"+v1.getTotal()+"\n-------------------------- ");
			
		Visit v2= new Visit(c2);
			v2.setCust_product_amt(5000);
			v2.setCust_service_amt(5220);
			v2.setCust_service_amt(5000);
			System.out.println("Customer Name:"+v2.getCname()+"\ntotal amount:"+v2.getTotal()+"\n-------------------------- ");
			
			Visit v3= new Visit(c3);
			v3.setCust_product_amt(85000);
			v3.setCust_service_amt(4521);
			v3.setCust_product_amt(50000);
			System.out.println("Customer Name:"+v3.getCname()+"\ntotal amount:"+v3.getTotal()+"\n-------------------------- ");
			
	}
	
	

	

}
