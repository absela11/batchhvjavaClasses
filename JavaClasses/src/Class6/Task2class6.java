package Class6;

public class Task2class6 {
	
	public static void main (string[]args) 
	


	/*ask user to enter boolean value for sale
	 * if no sale -----i am not shopping 
	 * if sale---check the price of the item
	 * based on the amount we will have to calculate the price after discount
	 * if price<20---apply 10%
	 * if price betwwen20-100---20%
	 * if between 100-500---30%
	 * anything---50%
	 * 
	 * after discount ___ the price of the item reduce from_to_
	 * 
	 * 
	 */
	

	
	 
	
	boolean sale;
	double price;
	double price1;
	double discount;
	Scanner sc=new Scanner(System.in);
	System.out.println("Did you sell? False or true");
	sale=sc.nextBoolean();
	
	if(sale) {
		System.out.println("What is the price of the product");
		price=sc.nextDouble();

		
		if(price<20) {
			discount=10;
		price1=price*(1-discount/100);
		}
		else if(price>=20 && price<100) {
		discount=20;	
		price1=price*(1-discount/100);
		}
		else if(price>=100 && price<500) {
			discount=30;
			price1=price*(1-discount/100);
			}
		else {
			discount=50;
			price1=price*(1-discount/100);
		}
		
		System.out.println("After discount " + discount + "% the price of the item reduce from "+ price+ " to " +price1);
	}
	else {
		System.out.println("I am not shopping");
	}
	
	}
​

​


	            
	       
