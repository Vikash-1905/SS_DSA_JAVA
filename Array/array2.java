import java.util.*;

public class array2 {
    public static void main(String[] args) {
      int[] arr = {10, 60, 70, 40, 50};
      int max = arr[0];
      for (int i=0; i<arr.length; i++){
          if(arr[i] > max){
            max = arr[i];
          }
      }
      System.out.println("Max = " + max);
    }
}
