class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int n: nums) {
            if (arr[n]) {
                return n;
            }
            arr[n] = true;
        }

        return -1;
    }
}
