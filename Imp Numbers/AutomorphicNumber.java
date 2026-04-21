import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        
        int num = 3;

        int square = num * num;

        // Convert to string to compare ending digits
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is NOT an Automorphic number.");
        }
    }
}
