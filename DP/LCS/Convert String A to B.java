package DP.LCS;

// Minimum number of insertions and deletions to convert string s1 to s2
// First, print the number of deletions, then the number of insertions with a space in the same line
public class convertStringA2B {
    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "pea";
        System.out.println(lcs(s1, s2));  // Print the result
    }

    private static String lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int deletion, insertion;
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array for LCS calculation
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Longest common subsequence length
        int lcs = dp[m][n];

        // Number of deletions = (length of s1) - LCS length
        deletion = m - lcs;

        // Number of insertions = (length of s2) - LCS length
        insertion = n - lcs;

        // Return deletion and insertion counts separated by a space
        return deletion + " " + insertion;
    }
}
