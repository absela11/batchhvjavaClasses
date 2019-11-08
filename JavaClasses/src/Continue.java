
public class Continue {
	public static void main (String[]args) {
		
		for (int i=1; i<=5;i++) {
			if (i==3||i==4) {
				continue;
			}
			System.out.println(i);
		
			// i want to print nums from 1 to 20 ecxcepyt 5,6,7
			
			for (int a=1;a<20;a++) {
				if (a ==5&& a==7) {
					continue;
				}
				System.out.println(a);
			//print numbers from 1 to 50 except those that are divisble by 3
				
			 for(int p=1;p<50;p++) {
				if (p%3==0) {
					continue;
					System.out println(p);
				
				}			
			 }
				
			}
		


