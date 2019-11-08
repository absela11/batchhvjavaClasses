
public class Assigment811 {
	public static void main (String[]args) {
		// write a code ton find the sum of even &odd numbers
		// from range 1 to20
		//expecting 2 outputs
		//sum for odd nums=...
		// sum for even nums=...

		int sumOfOdd=0;
		        int sumOfEven=0;
		        for (int a=1; a<=20; a++) {
		            if (a%2==0) {
		                sumOfOdd=a+sumOfOdd;
		            System.out.println(sumOfOdd);
		            }}
		        for (int b=1; b<=20; b++) {
		            if (b%2==1){
		            sumOfEven=b+sumOfEven;
		            System.out.println(sumOfEven);
		          }}
         
		////
		        
		        int tEven=0;
		            int tOdd=0;
		            
		            for (int i=1; i<=20; i++) {
		                if(i%2==0){
		                    tEven=i+tEven;
		                    
		                }else {
		                    tOdd=i+tOdd;
		                }
		            
		            }
		                System.out.println(tEven);
		                System.out.println(tOdd); 
		            //    
		                int sumEven=0;
		                int sumodd=0;
		            
		                for (int i =1;  i<=20;i++);
		                if (i%2==0) {
		                	sumEven=sumEven+i;
		                }else{
		                	sumOdd=sumOdd+i;
		                }
	}
	}system.out.println ("the total of all even#="+sumEven);
	system.out.println ("the total of all add#="+sumOdd);
}
