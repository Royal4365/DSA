package GFG.Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDeleteAndShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter index : ");
        int idx = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        func(arr,n,idx);
        System.out.println(Arrays.toString(arr));
    }
    private static void func(int []arr, int n, int index){
        for(int i=index+1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = 0;
    }
}
