package class10;

public class ALLvaluefromarry {

	public static void main(String[] args) {
		             //   0  1   2   3   4  5
		char[] grades= {'A','b','c','d','e','f'};
		int a= 2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		a+=2;//2+2
		System.out.println(grades[a]);
		a--;//3
		System.out.println(grades[a]);
		
		//	System.out.println(grades[0]);
		//	System.out.println(grades[1]);
		//	System.out.println(grades[2]);
		//	System.out.println(grades[3]);
		
		for ( int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			////	
	String[] animals= {"cat" ," dog ", "cow","snaket ","Elepant"}
	int size=animals.length;
	for (int i=0;i<size;i++) {
		System.out.print(animals[i]+"");
	}
		}
	}

}
