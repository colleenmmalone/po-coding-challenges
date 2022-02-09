package week1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Weekly Coding Challenge: 

Java: 
1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers. 

Examples 
ascending("232425") --> true 
// Consecutive numbers 23, 24, 25 

ascending("2324256") --> false 
// No matter how this string is divided, the numbers are not consecutive. 

ascending("444445") --> true 
// Consecutive numbers 444 and 445. 
Notes 
A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them. 
 */

public class Week1Q1 {
	
	public static void main(String[] args) {
		ascending("444445");
		ascending("232425");
		ascending("543210");
		ascending("123456");
		ascending("1233456");
		ascending("1111111211131114");
		ascending("52a");
		ascending("4");
	}

	public static boolean ascending(String digits) {

		int inputLength = digits.length();
		//there much be at least two numbers to compare
		int maxLength = Math.floorDiv(inputLength, 2);
		boolean isValid = false;
		int [] segments = new int [1];

		// determine whether String contains only digits and has more than 2 digits
		String regex = "[0-9]+";
		Pattern p = Pattern.compile(regex);	 	
		Matcher m = p.matcher(digits);		 
		if(m.matches() == false || digits == null || inputLength<2) {
			System.out.println(digits+" is invalid input\n");
			return false;		 
		}

		// j represents the substring length
		for (int j = 1 ; j <= maxLength ; j++) {

			//checks if input string can be evenly divided into j parts
			if(inputLength % j == 0) {

				// x is the number of substrings
				int x = inputLength/j;

				// create int array of size x
				segments = new int[x];

				// u represents substring indeces
				int u = 0;

				// divide input into x sections and save those ints into an array called segments
				for(int i = 0; i< x; i++) {
					// save each substring into array
					segments[i] =  Integer.parseInt(digits.substring(u, u+j));
					u += j;							 
				}	

				//check that each index is the consecutive # after previous index
				for (int i = 0; i < x - 1; i++) {
					if(segments[i] + 1 == segments[i+1]) {
						isValid = true;
					}else {
						// if false, iterate to next j (substring length)
						isValid = false;
						break;
					}
				}
				
				// if loop fully completed and isValid is still true, then this is the one!
				if(isValid == true) {
					break;
				}

				// if isValid is false and j is the highest it can go, then String is false for every substring length
				if(isValid == false && j == maxLength) {
					return false;
				}
			}
		}
		
		System.out.println(digits+" is consecutive: "+isValid);
		System.out.println("Final array: "+Arrays.toString(segments).replace("[", "").replace("]","").replace(",","")+"\n");		

		return isValid;
	}
}


