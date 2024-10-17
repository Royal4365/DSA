package DP.LCS;

public class shortestCommonSupersequence {
    public static void main(String[] args) {
        String s1 = "aggtab";
        String s2 = "gxtxayb";
        System.out.println(lcs(s1,s2));
    }
    private static int lcs(String s1, String s2) {      //because we are returning the count of super sequence
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return m + n - dp[m][n];            //because when we add two given string and then remove their lcs then it will be super sequence
    }
}
