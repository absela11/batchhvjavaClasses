
public class Cass7re {
	public static void main (String[]args){
	/* you need to ask user to pay for coffee
	 * you need to asking user to pay for it until
	 * entered price is equal =5;
	 * after used paid then say "Enjoy your coffee!
	 * "
	 */
		Scanner scan=new Scanner(System.in);
		int price;
		do {
			System.out.println("please pay for your coffe");
			price=scan.nextInt();
			
		}while(price!=5);
		System.out.println("Enjoy your coffee");

		//2way with while
		int price1;
		System.out.println("Please pay for coffee");
		price1=scan.nextInt();
		while(price1!=5) {
			
			System.out.println("Please pay for your coffee");
			price1=scan.nextInt();
		}
	}
	
}


