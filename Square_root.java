package DSA_450.Searching_And_Sorting;

public class Square_root {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(squareRoot1(n));
        System.out.println(squareRoot1(n));
    }
    static int squareRoot1(int n){    //method 1
        int count=0;
        for(int i=1;i<n;i++){
            int num = i;
            int sqrt = (int) Math.sqrt(i);
            if(sqrt*sqrt == num){
                count++;
            }
        }
        return count;
    }
    static int squareRoot2(int n){    //method 2
        int count =0;
        for(int i=0; i*i<n;i++){
            count++;
        }
        return count;
    }
}
