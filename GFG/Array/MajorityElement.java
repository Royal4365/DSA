package DSA_450.Searching_And_Sorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[]arr = {3,1,3,3,2};
        System.out.println(findMajorityElement(arr));

    }
    static int findMajorityElement(int[]arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int mid = n/2;

        if(n%2 == 0){
            if(arr[mid] == arr[mid-1]){
                return arr[mid];
            }
        }else{
            if(arr[mid] == arr[mid+1] || arr[mid] == arr[mid-1]){
                return arr[mid];
            }
        }
        return -1;
    }

}
