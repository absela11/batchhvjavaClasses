
public class Practice1 {

	public static void main(String[] args) {
		int n =3;
		while(n>0) {
			System.out.println(n);
			n=n-1;
			System.out.println("blastoff!");
			//other way
			int s=3;
			while (n<0) {
				System.out.println("s");
				//other way
				int[]nums= {10,20,0,30,-140,-70};
				int Largest =nums[0];
				for(int i = 0; i < nums.length; i ++) {
					if (nums[i]> Largest) {
						Largest=nums[i];
					}
						System.out.println("The Largest number from an array is" + Largest);
								
					}
				}
				
			}
			
			
		}

	}

}}
