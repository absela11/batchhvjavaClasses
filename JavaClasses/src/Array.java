
public class Array {

	public static void main(String[] args) {
		int[]naomi=new int[7];
		naomi[5]=24;
		for(int south:naomi){
			System.out.println(south);
			// series 1st way
			int a1 =4;
			int a2=5;		
		    int a3 =7;
			int a4 =2;
		 	int a5 =9;
		 	int sum= a1+a2+a3+a4+a5;
		 	System.out.println("===");
		 	// serious way
		 	int[]a=new int[5];
		 	a[2]=7;
		 	a[4]=9;
		 	a[0]=4;
		 	a[1]=5;
		 	a[3]=2;
		 	int suma=0;
		 	for (int i=0;i<a.length;i++) {
		 		suma=suma+a[i];
		 	}
		 	
		}
	}
}
