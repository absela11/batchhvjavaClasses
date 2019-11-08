package Class6;

import java.util.Scanner;

public class scannerswitch{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your gender:f or m");
		char gender=scan.next().charAt(0);
		String usergender;
		switch (gender) {
		case  'f':
		usergender="Female";
				break;
		usergender="male";
		break;
		default:
			usergender="unknown";
			System.out.println("your gender is "+usergender);
		}
}
	
		
	

	

