import java.util.Scanner;
public class assigmentcalss7 {
//you need to ask user to pay for coffee
	//you need to ask keep asking user to pay for it until
	//enterd price is equal=5;
	//after user paid then say" Enjoy your coffee"
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int price;
		do {
			System.out.println("pay for your coffee");
			price=scan.nextInt();
		}while(price!=5);
		
		System.out.println("Enjoy your coffee");
		//or 2 way withwhile
		int price1;
		System.out.println("Please pay for your coffe");
		price1=scan.nextInt();
		while(price!=5) {
			System.out.println("Enjoy for your coffe");
			price1=scan.nextInt();
		}
		
		//how to print values10 to1;
		int a=10;
		while(a<=1) {
			System.out.println(a);
			a--;
			//print values from 50 to20
			int b=50;
			while(b>20) {
				System.out.println(b);
				b--;
			}
		}
		}
		
		}
		

		

	


