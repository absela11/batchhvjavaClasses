package Class6;

public class CLASTASK {

	public static void main (string[]args) {
		/* ask user to entire the month they were born
		 * based on the month define the season
		 * if user is born inn jan,feb,dec__ winter
		 * if mar,apr,may-----spring
		 * if jun,jul,aug---summer
		 * if sep,oct,nov---fall
		 * otherwise--unknown
		 * at the end of the  program
		 * "you were born in ___"
		*/
		 
		ackage com.class6;
		import java.util.Scanner;
		public class MyPractice {
		    public static void main(String[] args) {
		        
		        
		        Scanner scan= new Scanner(System.in);
		        
		        System.out.print("enter the month you were born ");
		        
		        String month = scan .nextLine();
		        String season;
		        if (month.eualsignoreCase("january")||month.equalsignoreCase("february")||month.equalsignoreCase("december")) {
		        season="winter";
		        System.out.print(" you were born "+season);
		        }else if (month.eualsignoreCase("march")||month.equalsignoreCase("apirl")||month.equalsignoreCase("may")){ 
		        		 season="spring"
		        				 System.out.print("you were born "+season);
		        
		      
		        }else if (month.eualsignoreCase("june")||month.equalsignoreCase("july")||month.equalsignoreCase("august")){ 
		        			 season="summer";
		        		 System.out.print("you were born "+ season);
		        }else if (month.eualsignoreCase("september")||month.equalsignoreCase("october")||month.equalsignoreCase("november")){ 
			     		       season=""fall" 
		    System.out.print("you were born "+season);
		        }else if{
		        	 System.out.print("please enter a valid month ");
		 
	}
}
