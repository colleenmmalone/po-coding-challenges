package week1;

	public class DailyDnD {

	    public static void main(String args[]) {
	      
	            int min = 0;
	            int max = 0;
	            String mdf = "3d8";
	            String S = "-";
	            String B = "2";

	            String SB = S+B;
	            int SBI = Integer.parseInt(SB);
	            
	            int M = Integer.parseInt(mdf.substring(0,1));
	            int F = Integer.parseInt(mdf.substring(2,3));
        
	            min = M + SBI;
	            max = M*F + SBI;
	            System.out.println(min+" "+max);    
	    }

}
