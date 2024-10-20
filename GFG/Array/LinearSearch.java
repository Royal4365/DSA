package Acad.Searching;

public class LinearSearch{
    static int search(int []array,int n,int key) {
        for (int i = 0; i <= n; i++) {
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9};
        int  n= array.length;
        int key=5;
        int index=search(array,n,key);
        if(index== -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index "+index);
        }
    }
}
