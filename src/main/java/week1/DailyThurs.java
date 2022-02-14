package week1;

public class DailyThurs {

   public static void main(String[] args) {
	   //find number of "KNOT" strings present in input, forwards and backwards, case insensitive
        
        String KNOTS = "asldkfjaknotonkalkdj";
        String t = KNOTS.toLowerCase();
        String findStr = "knot";
        String findStrb = "tonk";
        int lastIndex = 0;
        int lastIndexb = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = t.indexOf(findStr,lastIndex);

            if( lastIndex != -1){
                count++;

                lastIndex += findStr.length();
            }
        }

        
        while (lastIndexb != -1) {
            lastIndexb = t.indexOf(findStrb,lastIndexb);

            if( lastIndexb != -1){
                count++;

                lastIndexb += findStrb.length();
            }
        }

        System.out.println(count);
     
    }
}