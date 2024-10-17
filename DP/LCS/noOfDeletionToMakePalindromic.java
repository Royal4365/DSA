package DP.LCS;

//Minimum number of deletion in a string to make it a palindrome

public class noOfDeletionToMakePalindromic {
    public static void main(String[] args) {
        String s1 = "agbcba";
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(lcs(s1, s2));
    }
    private static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        //length of string - lcs. so it will print minimum to delete from string to convert it to palindrome
        return m - dp[m][n];
    }
}
