//ASSIGNMENT-5:: PROGRAM-1: 

import java.util.Scanner;

public class StringClass{
	static String str1;
	static String str2;
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter string1:: ");
		str1 = sc.nextLine();
		System.out.println("\nEnter string2:: ");
		str2 = sc.nextLine();
		
		System.out.println("Length of String 1::"+str1.length());
		
		char ch1 = str1.charAt(11);
		System.out.println("Character at 11th index in String1 is: "+ch1);
		
		int var1 = str1.compareTo( str2 );
        System.out.println("String1 & String2 comparison: "+var1);
		
		int var2 = str1.compareToIgnoreCase(str2);
		System.out.println("String1 & String2 comparison (Ignoring case): "+var2);
		
		System.out.println("Result of Comparing regions (from 7th moving 3 positions ahead) of String1 & String2: " );
		System.out.print(str1.regionMatches(7, str2, 0, 3));
		
		System.out.println("\nString1 after replacing all 'o' with 'p' :" );
		System.out.print(str1.replace('o', 'p'));
		
		System.out.println("\nString1 after trim: "+str1.trim());
		
		System.out.println("Index of 'a' in String1: "+str1.indexOf('a'));
		
		int pos = str1.lastIndexOf('a');
		System.out.println("Last Index of 'a' in String1: "+pos);
		
		System.out.println("String2 after conversion to lower case: "+str1.toLowerCase());
		
		System.out.println("String2 after conversion to upper case: "+str1.toUpperCase());
		
		str2 = str2.concat("...This is").concat(" just a").concat("concatenated String");
                                  System.out.println("String2 after concatenation" + str2);
		
		System.out.println("\nEnter a number:: ");
		int number = sc.nextInt();
		String str = String.valueOf(number);  
		System.out.println("Value of Result after adding 199:: "+str+199); 
	}
}
