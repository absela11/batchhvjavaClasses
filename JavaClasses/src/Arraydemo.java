
public class Arraydemo {

	public static void main(String[] args) {
		int[]array2= {2,5,4,7,5,2};
		for (int i =0;i<array2.length;i++) {
			for (int j =i+1;j<array2.length;j++) {
				if (array2[i]==array2[j]) {
					System.out.println(array2[j]);
					
					//other 5rway
					
					int a =2;
					if (a==20) {
			System.out.println("number is "+a);
					}else {
			System.err.println("number was not 20 but is "+a);
			System.out.println("======");
			//other way
			int []array1=new int [4];
				array1[0]=12;	
				array1[1]=13;
				array1[2]=14;	
				array1[3]=14;
				System.out.println(array1[3]);
				System.out.println("======");
				int num1=0;
				for (int s=0;s<4;s++) {
					num1=num1+array1[s];
					System.out.println(array1[s]);
				}
				System.out.println("The sum of array1 is ="+num1);
				System.out.println("======");
				int [] abela2= {2,5,4,7};
				for( int d:abela2) {
					System.out.println(d);
				}
				}
					}
				}
			}
		}

	}


