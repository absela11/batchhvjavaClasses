package class10;

public class Arrayintro {

	public static void main(String[] args) {
	int a;
	a=10;
	int a1=10;
	// 1way
	int[] b;// declare an array  prefred way
     int c [];
     b=new int[4];//intialize
     //2 way---- all;l inn 1 line( declariton and intiaziation)
     int[]array=new int [4];
     array[0]=10;
     array[1]=20;
     array[2]=30;
     array[3]=40;
     // access value from an array
     System.out.println(array[2]);
     /// lets create an array that will store clASSes
     
     
      String[] Classes=new String[4];
      Classes [0]="Java";
       Classes[1]="SDLC";
       Classes[2]="Manual Testing";
       Classes[3]="GIT";
       // to day we have java class
    System.out.println  (" Today we have"+Classes[0]+"class");
    
    int [] nums= new int[3];
    nums[0]=1;
    nums[1]=2;
    nums[2]=3;
    // how can i change 1 to 100
    nums[0]=100;
    System.out.println(nums[0]);
    System.out.println(nums[0]+nums[2]);//100+3
    //the size of an array is fixed
    String[] names=new String[3];
    names[0]=" Diana";
     names[1]=" SEDA";
     names[2]=" Jamie";
     //names[3]=" Olga"; during run time we will get an exceptional
     // arrayinedxoutofboundsexception
     System.out.println(names )
	}

}
