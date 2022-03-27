import java.util.*; 
		
public class FindCostApp {
	public static double price, tax; //global variables
	
	static void displayTitle() { //title method
		System.out.println("*** Product Price Check ***).");
	}
	
	   static double displayPrice() { //displayprice method
		   return price;
	   }
	   
	   static void calculateFinalPrice() { //calculatefinalprice method
			price = price * (1 + tax/100);
			System.out.println("Cost after tax = " + price); 
	   }
	
   public static void main(String[ ] args ) //main method
   {
		Scanner kbd= new Scanner(System.in); 
		
		displayTitle(); //calling displaytitle method
		
		System.out.print("Enter initial price: "); //input price
		price = kbd.nextDouble(); 
		
		System.out.print("Enter tax rate: "); //input tax
		tax = kbd.nextDouble(); 
		
		kbd.close(); //close scanner
		
		double pricee = displayPrice(); //set variable to return displayprice method
		System.out.println(pricee); //return price
		calculateFinalPrice(); //display calculatefinalprice method
    }
}