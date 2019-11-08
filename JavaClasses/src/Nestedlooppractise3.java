
public class Nestedlooppractise3 {

	public static void main(String[] args) {
		for(int k =1; k<=5; k++) {
			for (int L=1;L<=5; L++) {
				System.out.print("*");
				//*****
				//*****
				//*****
				//*****
				//*****
				for (int i=1; i<=4; i++) {
					for (int j=1;j<=5;j++) {
				System.out.print("*");
				System.out.println();
				
				//*******
				//*******
				//*******
				//*******
				//*******
				for (int b=0; b<5; b++) {
					for (int y=0;y<=7;y++) {
				System.out.print("*");
					}
				System.out.println();
				
			/*12345	
			 * 12345
			 * 12345
			 * 12345
			 */
		
				for (int c=1; c<5; c++) {
					for (int y=1;y<=6;y++) {
				System.out.print(y);
					}
				System.out.println();
				
					}			
				}
					
					}		
				}
			}	
		}	
	}		
}