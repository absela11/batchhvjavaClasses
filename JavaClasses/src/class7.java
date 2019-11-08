
public class class7 {


//Create a boolean variable workDay 
//and assign true create int variable day and assign it to 1
//As long as it is workDay print “I need a day off” 
//and increase day.
//Once day is 6 or 7 print “I do not need a 
//day off any more”
public static void main (String[]args) {
	boolean workday =true;
	int d =1;
	while(workday && d<=6) {
		System.out.println("i do not need a day off");
		if (d==6) {
			System.out.println("i do not need a day off anymore");
		}
		d++;
	}
  }

}
