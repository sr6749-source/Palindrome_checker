public class UC1 {
    static void main() {
        String original = "madam";

        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a palindrome.   ");
        }


    }
}
