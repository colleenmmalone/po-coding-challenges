package week1;

import java.util.Arrays;

/*
 * Weekly Coding Challenge: 

Java

2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n. 

Examples 
squarePatch(3) --> [ 
[3, 3, 3], 
[3, 3, 3], 
[3, 3, 3] 
] 

squarePatch(5) --> [ 
[5, 5, 5, 5, 5], 
[5, 5, 5, 5, 5], 
[5, 5, 5, 5, 5], 
[5, 5, 5, 5, 5], 
[5, 5, 5, 5, 5] 
] 

squarePatch(1) --> [ 
[1] 
] 

squarePatch(0) --> [] 
Notes 
n >= 0. 
If n = 0, return an empty array. 


 */

public class Week1Q2 {
	
	public static void main(String [] args) {
		squarePatch(0);
		squarePatch(1);
		squarePatch(3);
		squarePatch(5);
	}
	
	public static void squarePatch(int squareMe) {
		
		// create square 2D int array 
		int [][] matrix = new int[squareMe][squareMe];
		
		// set each index to input int
		for (int[] arr : matrix ) {
			for (int i =0; i<squareMe; i++) {
				arr[i] = squareMe;			
			}
		}
		
		// print array in proper format
		System.out.println(Arrays.deepToString(matrix).replace("], ", "],\n").replace("[[", "[\n[").replace("]]", "]\n]"));
	}
}
