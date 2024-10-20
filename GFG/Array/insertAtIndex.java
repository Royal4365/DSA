package GFG.Array;

import java.util.Arrays;

public class insertAtIndex {
    public static void main(String[] args) {
        int size = 6;
        int []arr = {1,2,3,4,5,0};
        int index = 3, element = 90;
        func(arr,size,index,element);
        System.out.println(Arrays.toString(arr));
    }
    private static void func(int[] arr, int size, int index, int element) {
        for(int i = size -1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
    }
}
