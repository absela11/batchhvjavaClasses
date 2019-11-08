package class10array;

public class Task1array {

	public static void main(String[] args) {
		// create an array of chars and store grades into it: A,B,C,D,E,F.
		//then print a grade B ( use 2 siffrent ways
		// of creatin an array);
		char [] grades = new char[6];
		   grades[0] ='A';
	        grades[1] = 'B';
	        grades[2] = 'C';
	        grades[3] = 'D';
	        grades[4] = 'E';
	        grades[5] = 'F';
	        
	        System.out.println(grades[1]);
	        
	        char[] grade = {'A','B','C','D','E','F'};
	        System.out.println(grade[1]);

	    



}
}