package Class10;

public class enhancedLoop {
    public static void main(String[] args) {
        int[] arr = {10, 13, 20, 25, 45, 50};
        for (int x:arr){
            if (x%2!=0){     //this is not possible in enhanced for loop
               x=0;            //this is not possible  enhanced for loop
            }
            System.out.println(arr[1]);
        }
    }
}
