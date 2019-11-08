
public class Stringmanuplation {

	public static void main(String[] args) {
		// Create two Strings and initaialize them with some value.
					//implement the following methods on those strings.
					
					/*
					 * sen.length();
					 * sen.equals();
					 * sen.contains(s);
					 * sen.toUpperCase();
					 * sen.toLowerCase();
					 * sen.equalsIgnoreCase(anotherString);
					 */
String st1= "Today is Java class";
		String st2= "Today";

        System.out.println(st1.length());
        System.out.println(st2.length());
        System.out.println();
        System.out.println(st1.equals(st2));
        System.out.println(st2.equals(st1));
        System.out.println();
        System.out.println(st1.contains(st2));
        System.out.println(st2.contains(st1));
        System.out.println();
        System.out.println(st1.toUpperCase());
        System.out.println(st2.toUpperCase());
        System.out.println();
        System.out.println(st1.toLowerCase());
        System.out.println(st2.toUpperCase());
        System.out.println();
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st2.equalsIgnoreCase(st1));


	}

}
