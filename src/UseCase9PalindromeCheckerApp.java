import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC9: Recursive Palindrome Checker =====");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces
        input = input.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Recursive Method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call
        return checkPalindrome(str, start + 1, end - 1);
    }
}