package beauty_Saloon;

public class Discount {
	private  static double servicePremium=0.20;
	private static double serviceGold=0.15;
	private static double serviceSilver=0.10;
	private static double productPremium=0.10;
	private static double producteGold=0.10;
	private static double productSilver=0.10;
	
	public  static double getServiceDiscount(String n) {
		switch(n) {
		case "Premium":
			return servicePremium;
			
		case "Gold":
			return serviceGold;
		case"Silver":
			return serviceSilver;
			default:
				return 1;
		}
		
		
	}
	
	public static double getProductDiscount(String n) {
		switch(n) {
		case "Premium":
			return productPremium;
			
		case "Gold":
			return producteGold;
		case "Silver":
			return productSilver;
			default:
				return 1;
		}
		
		
	}
	
	

}
