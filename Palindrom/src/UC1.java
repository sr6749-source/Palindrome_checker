import java.util.ArrayDeque;
import java.util.Deque;
public class UC1 {
    static void main() {
        String input = "A man a plan a canal Panama";
        System.out.println("Input : " + input);

        // Step 1: Normalize string (String preprocessing using Regular Expressions)
        // Remove all non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Step 2: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}