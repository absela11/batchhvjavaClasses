
public class Class10practise {

	public class Task {
		/*Create an array of countries. 
		 * While retrieving all values from an array 
		 * print capital for each country.*/
			
			public void main(String[]args) {
				String[] countries= {"Afghanistan", "Colombia","USA", "Russia", "Turkey"};
	​
				for(int i=0; i< countries.length; i++) {
					
					if(countries[i].equals("USA")) {
						System.out.println("Washington DC");
					}else if(countries[i].equals("Russia")) {
						System.out.println("Moscow");
					}else if(countries[i].equals("Turkey")) {
						System.out.println("Ankara");
					}else if(countries[i].equals("Afghanistan")) {
						System.out.println("Kabul");
					}else if(countries[i].equals("Colombia")) {
						System.out.println("Bogota");
						// 2way/*Create an array of countries. 
						 // While retrieving all values from an array 
						 // print capital for each country.*/
						 
						String[] countries1 = { "Afghanistan", "Colombia", "USA", "Russia", "Turkey" };
						​
								for (int i = 0; i < countries1.length; i++) {
						​
									switch (countries1[i]) {
									case "Afghanistan":
										System.out.println("Kabul");
										break;
									case "Colombia":
										System.out.println("Bogota");
										break;
									case "USA":
										System.out.println("Washington DC");
										break;
									case "Turkey":
										System.out.println("Ankara");
										break;
									case "Russia":
										System.out.println("Moscow");
										break;
						
					
				}
			}
		
	}

}
}
	}
}
