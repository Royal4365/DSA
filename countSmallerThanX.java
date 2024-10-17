package GFG.Array;

import java.util.Arrays;

public class countSmallerThanX {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4,5,3,1,2};
        int x = 3;
        System.out.println(func(arr,x,n));
    }
    private static int func(int[] arr, int x, int n) {
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                cnt++;
            }
        }
        return cnt;
    }
}
