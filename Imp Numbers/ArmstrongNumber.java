import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 10;

        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Count number of digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        // Check result
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
