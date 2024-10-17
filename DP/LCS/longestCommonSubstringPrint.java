package DP.LCS;

public class longestCommonSubstringPrint {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zabcf";
        System.out.println(lcs(s1,s2));
    }
    private static String lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if(dp[i][j] > maxLength){
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return s1.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}
