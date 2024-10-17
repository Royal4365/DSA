package DP.LCS;

public class sequencePatternMatching {
    public static void main(String[] args) {
        String s1 = "axy";
        String s2 = "adxcpy";
        System.out.println(lcs(s1,s2));
    }
    private static boolean lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int lcs = dp[m][n];
        return lcs == m;
    }
}
// Basically here we have to check whether a is subsequence of b or not
// if they ask is a is subsequence of b or b is subsequence of a the we return lcs == min(a,b)