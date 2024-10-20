package GFG.Array;

public class intermediateGreaterThanX {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4, 67, 13, 12, 15};
        int x = 16;

        System.out.println(func(arr, n, x));
    }

    private static int func(int[] arr, int n, int x) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                min = Math.min(arr[i], min);
            }
        }

        return (min != Integer.MAX_VALUE) ? min : -1;
    }
}
