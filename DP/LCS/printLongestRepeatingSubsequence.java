package DP.LCS;

public class printLongestRepeatingSubsequence {
    public static void main(String[] args) {
        String s1 = "aabebcdd";
        String s2 = s1;
        System.out.println(lrs(s1, s2));
    }
    private static String lrs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1) && i != j){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder s = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            // If characters match and they are not the same index
            if (s1.charAt(i - 1) == s2.charAt(j - 1) && i != j) {
                s.append(s1.charAt(i - 1));
                i--;
                j--;
            }
            // Move in the direction of the larger value
            else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Since we are building the string in reverse, reverse it before returning
        return s.reverse().toString();
    }
}
