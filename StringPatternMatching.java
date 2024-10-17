package GFG.Array;
public class StringPatternMatching {

    public static int findPatternIndex(String s, String p) {
        if (s.contains(p)) {
            return s.indexOf(p);  // Using indexOf to get the starting index
        } else {
            return -1; // Pattern not found in s
        }
    }

    public static void main(String[] args) {
        String s = "Hello";
        String p = "llo";

        int result = findPatternIndex(s, p);

        System.out.println("Output: " + result);
    }
}
