import javax.xml.stream.events.Characters;

public class Reviewequalas {

	public static void main(String[] args) {
		//create the string that will hold a sentences.
		//write a program to get a new string spaces.
		String str ="Learning java is fun";
		String str2 = str.replace(" ", "");
		System.out.println(str2);
		//create a string that should be combination of letters,
		//numbers  and 
	//special characters.
		//find out how many characters are there in the string
		String s = "Hi %^#Ja6789vyu76@#$";
		String s1=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s1);
		System.out.println(s1.length());	
		//you have a 
		//String a=" is it Saturday? is it raining?
		//do we have a java class today?
		// how would you find out how many sentence are that string?
		String a="Is it saturday? I s it raining?do we have a java class to day?";
		String[]array=a.split("\\?");
		System.out.println(array.length);
		//uibijsjbcisb 
		System.out.println("********");
		int i = 50;

		int[] b = new int[10];
		System.out.println(b.length);

		b = new int[100];
		System.out.println(b.length);

		b = new int[i];
		System.out.println(b.length);
		}
	
	
}	

		

		
	
		
		
}		

		

	


