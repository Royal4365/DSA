package GFG.Array;

public class intermediateSmallerThanX {
    public static void main(String[] args) {
        int n = 5;
        int [] arr = {4,16,13,12,15};
        int x = 16;

        System.out.println(func(arr,n,x));
    }
    private static int func(int[] arr, int n, int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                min = Math.max(arr[i],min);
                max = Math.min(max,min);
            }
        }
        if(min > 0) return min;
        else return -1;
    }
}
