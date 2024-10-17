package DP.LCS;

//here we have to return the repeating subsequence in a string but with different index

public class longestRepeatingSubsequence {
    public static void main(String[] args) {
        String s1 = "aabebcdd";
        String s2 = s1;
        System.out.println(lcs(s1, s2));
    }
    private static int lcs(String s1, String s2) {
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
        //ans is abd which is of length 3. a is at 0,1. b is at 2,4 & d is at 6,7 with different indices so ans is 3.
        return dp[m][n];
    }
}
