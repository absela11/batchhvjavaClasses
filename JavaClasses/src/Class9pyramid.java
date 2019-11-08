
public class Class9pyramid {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****

		for (int i =1; i<=5;i++) {
			for (int j =1;j<=i; j++) {
		
             System.out.print("*");
			}
		System.out.println();
		
		/*1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 7777777
		 * 88888888
		 * 999999999
		 */

		for (int d =1; d<=9;d++) {
			for (int j =1;j<=d; j++) {
		
             System.out.print(d);
			}
		System.out.println();
		/*999999999
		 * 88888888
		 * 7777777
		 * 666666
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 */

		for (int r=9; r>=1;r--) {
			for (int c=1;c<=r; c++) {
		
             System.out.print(r);
			}
		System.out.println();
		// print the following pattern
		//55555
		//4444
		//333
		//22
		//1
		for (int s=5;s>=1;s--) {
			for (int e=1;e<=s; e++) {
		
             System.out.print(s);
			}
             System.out.println();
           
     		

               
      			}      
     		 }
		}
		}
	}
}
		