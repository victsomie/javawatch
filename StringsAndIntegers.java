package StringsAndIntegers;
import java.util.Scanner;

public class StringsAndIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am awesome"; //Declares a variable str with data type String 
		int num = 12345; //Declares an integer
		String str2 = "59000";
		
		
		int num2 = Integer.parseInt(str2); //Converts the string to integer
		
		System.out.println(str); //Prints the string
		System.out.println(num); //Prints the num
		System.out.println("The string it converted to number : >> " + num2); 
		//Prints the converted number
		System.out.println("Now adds the converted number: >> " + (num + num2)); //now you can add this number
		
		System.out.println("HOW TO REVERSE A STRING"); 
		
		//Declare two string 
		//(One empty and another initialized to an empty string to hold empty )
		
		String x, y= "";
		//Import a scanner to allow input!
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write a string here: ");
		String s =  sc.nextLine(); //Takes in user's input
		
		
		//Get the characters position in the string in the reverse direction
		//Add the character to the string y
		for(int l = s.length()-1; l >=0; l-- ){ 
			y+=s.charAt(l); //Add the character from the last to the first
		}
		System.out.println(y);
				
		sc.close();
	}

}
