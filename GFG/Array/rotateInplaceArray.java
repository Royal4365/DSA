package GFG.Array;

public class rotateInplaceArray {
  static void rotateInplace(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverseInplace1(arr,0,n-k-1);
        reverseInplace1(arr,n-k,n-1);
        reverseInplace1(arr,0,n-1);
    }

    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void reverseInplace1(int[]arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        rotateInplace(arr,3);
        printArray(arr);
    }
}
