
public class Test {

	public static void main(String[] args) {
	
			int[] a = {12, 15, 11, 13, 9, 25};
			int[] a2 = {12, 15, 11, 13, 9, 25};
			int sum = 0;
			for (int i = 0; i <a.length; i++) {
			         if (a[i] % 2== a2[i ] % 5)  {
			                  sum += i * i;
			         }
			}
			System.out.println("sum = " + sum);
			
System.out.println("******");
int[] array = { 1, 4, 3, 6, 8, 2, 5 };

int what = array[0];

for (int index = 0; index < array.length; index++) {

       if (array[index] > what) {

                  what = array[index];

        }

}

System.out.println(what);
int[] zip = new int[5];

zip[0] = 7;
zip[1] = 3;
zip[2] = 4;
zip[3] = 1;
zip[4] = 9;

System.out.println( zip[ 2 + 1 ] );
System.out.println("++++++++");
String str = "Welcome to Happy World";
System.out.print("Return Value :" );
System.out.println(str.substring(10));
System.out.print("Return Value :" );
System.out.println(str.substring(10, 19));
 System.out.println("+++++");
 String yared = "sunday";
 for(int i=yared.length()-1;i>=2;i--) {
	 System.out.print(yared.charAt(i));
 }
	 System.out.println("______");
	 String Str = new String("Welcome on Board");
	 System.out.print("Return Value :" );
	 System.out.println(Str.replace('o', 'T'));
	 System.out.print("Return Value :" );
	 System.out.println(Str.replace('a', 'D'));
	 System.out.println("******");
	 
	 String city=("Fairfax");
	 String city1=("FAirfax");
	 System.out.println(city.isEmpty());
	 System.out.println(city.length());
	 System.out.println("******");
	 
	 int[] k= {12,32,55,77};
	 System.out.println("k.length");
	 System.out.println("city");
	 String city2=city.toUpperCase();
	 System.out.println("city2");
	 
	 System.out.println("******");
	 
	 String word ="Barefoot";
	 String sub1=word.substring(0,3);
	 String sub2=word.substring(0,4);
	 System.out.println("The sub of "+word+"(0,3)is::"+sub1); 
	 System.out.println("The sub of "+word+"(0,4)is::"+sub2);
	 System.out.println("******");
	 
	 String x="syntax";
	 String y="ashbrun";
	 String b="alexsandria";
	 System.out.println("replaced:"
	 +x.replace("syntax","yared"));
	 System.out.println("replaced:"
		 +y.replace("ashbrun","brother"));
	 System.out.println("replaced:"
	 +b.replace("alexsandria","abela"));
	 System.out.println("******");
	 
	 String z="Twitter.com/karLhadwen Twitter";
	 String sdr="Thank 1231 you 124 for using 1243 this 34563 string 5455";
	 String newSdr= sdr.replaceAll("[0-9]+","");
	 System.out.println(newSdr);
	 newSdr=sdr.replaceAll("[a-zA-Z]+","Java");
	 System.out.println(newSdr);
	 System.out.println("Replaced:"+z.replaceAll("Twitter","Facebook"));
	 		
 }
 
	 
 

	}


