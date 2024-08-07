package Leetcode;

public class singleElementUsingXOR {
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}
