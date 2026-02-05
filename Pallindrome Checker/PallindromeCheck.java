import java.util.Scanner;

public class PallindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // 1. Reverse the string
        String reversed = reverseString(original);

        // 2. Compare original and reversed
        // 3. Print whether it's a palindrome or not
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: '" + original + "' is a palindrome!");
        } else {
            System.out.println("Result: '" + original + "' is NOT a palindrome.");
        }

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}