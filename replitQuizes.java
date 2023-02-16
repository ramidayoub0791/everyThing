public class replitQuizes {

    String s1;
    String s2;

   public static String mixString(String s1, String s2){
      String result="";
        for(int i=0;i<s1.length();i++) {

            result += s1.substring(i,i+1);
            result += s2.substring(i,i+1);

        }
       return result;
   }
    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}