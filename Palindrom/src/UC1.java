public class UC1 {
    static void main() {
                String original = "racecar";
                String reversed = ""; // Initializing an empty string to hold the result

                for (int i = original.length() - 1; i >= 0; i--) {

                    reversed = reversed + original.charAt(i);
                }

                if (original.equals(reversed)) {
                    System.out.println(original + " is a palindrome.");
                } else {
                    System.out.println(original + " is not a palindrome.");
                }
            }
        }

