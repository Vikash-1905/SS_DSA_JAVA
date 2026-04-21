import java.util.*;

public class TechNumber {
    public static void main(String[] args) {
        
        int num = 2025;

        int temp = num;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Check even digits
        if (digits % 2 != 0) {
            System.out.println(num + " is NOT a Tech Number.");
        } else {
            int half = digits / 2;
            int divisor = (int) Math.pow(10, half);

            int firstPart = num / divisor;
            int secondPart = num % divisor;

            int sum = firstPart + secondPart;

            if (sum * sum == num) {
                System.out.println(num + " is a Tech Number.");
            } else {
                System.out.println(num + " is NOT a Tech Number.");
            }
        }
    }
}
