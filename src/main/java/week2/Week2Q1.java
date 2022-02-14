package week2;

import java.text.DecimalFormat;

/*
 * 3) Java: 

Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size. 

Examples 
actualMemorySize("32GB") --> "29.76GB" 

actualMemorySize("2GB") --> "1.86GB" 

actualMemorySize("512MB") --> "476MB" 

Notes 
-The actual storage loss on a USB device is 7% of the overall memory size! 
-If the actual memory size was greater than 1 GB, round your result to two decimal places. 
-If the memory size after adjustment is smaller then 1 GB, return the result in MB. 
 */


public class Week2Q1 {
	
	public static void main(String[] args) {
		actualMemorySize("512GB");
		actualMemorySize("64GB");
		actualMemorySize("32GB");
		actualMemorySize("0.5GB");
	}
	
	public static void actualMemorySize(String s){
//		System.out.println(s);
		String units = s.substring(s.length()-2);
		
//		System.out.println(units);
		String ss = s.substring(0,s.length()-2);
		double d = Double.parseDouble(ss);
		if(d < 1) {
//			System.out.println("MB");
			d = d*1000;
			units = "MB";
		}else {
//			System.out.println("GB");
		}
		
//		System.out.println(i);
		
		d = d * 0.93;
		String dd = new DecimalFormat("#.##").format(d);
		System.out.println(s+" is actually "+dd+units);
	}

}
