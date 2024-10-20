package GFG.Array;

public class MajorityWins {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,4,4,5};
        int x = 4, y = 5, n = 11;
        System.out.println(func(arr,n,x,y));
    }
    private static int func(int[] arr, int n, int x, int y) {
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                cnt1++;
            }
            if(arr[i] == y){
                cnt2++;
            }
        }
        if(cnt1 > cnt2) return x;
        else if(cnt2 > cnt1) return Math.min(x, y);
        else return y;
    }
}
