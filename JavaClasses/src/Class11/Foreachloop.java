package Class11;

public class Foreachloop {

	public static void main(String[] args) {
	
		String[]cars= {"Volvo","BMW","Ford" ,"Mazda"};
		for (int i =0; i< cars.length;i++) {
		System.out.println(cars[i]);
		// Or
		String[] mare = {"Volvo","BMW","Ford" ,"Mazda"};
		for (String l : mare){
		System.out.println(l);
        }
	}  
	
	}
}

