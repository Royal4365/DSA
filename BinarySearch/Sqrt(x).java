class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        long st = 1;
        long end = x;
        long ans = 0;

        while(st <= end){
            long mid = st + (end - st) / 2;

            if(mid * mid == x){
                return (int) mid;
            }else if(mid * mid < x){
                ans = mid;
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return (int) ans;
    }
}
