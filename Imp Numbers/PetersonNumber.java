import java.util.*;

public class PetersonNumber {
    public static void main(String[] args) {
      
        int num = 14;

        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Peterson number.");
        } else {
            System.out.println(originalNum + " is NOT a Peterson number.");
        }

    }

    // Function to calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
