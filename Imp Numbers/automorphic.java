import java.util.*;

public class automorphic {
    public static void main(String[] args) {
      int num = 25;
      double square = Math.pow(num,2);
      
      if(square%100==num){
        System.out.print(num+" is Automrphic Number");
      }
      else{
        System.out.print(num+ " is not Automorphic Number");
      }
    }
} 
