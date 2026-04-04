package String;

// Importing the Arrays class
import java.util.Arrays;

class FindExtraCharacter {
    public static char findExtra(String s1, String s2) {
        // Convert strings to character arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Sort both arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare characters
        int n = a1.length; // Length of the smaller string
        for (int i = 0; i < n; i++) {
            if (a1[i] != a2[i]) {
                return a2[i]; // Return the extra character
            }
        }

        // If no mismatch, the extra character is the last one
        return a2[n];
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";
        System.out.println("Extra character: " + findExtra(s1, s2));
    }
}