package DP.LCS;


public class printLongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zabcf";

        System.out.println(lcs(s1,s2));
    }
    private static String lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int [][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for(int j = 1;j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder s = new StringBuilder();
        int i = m, j = n;
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                s.append(s1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j] > dp[i][j-1]) i--;
            else j--;
        }
        return s.reverse().toString();
    }
}
