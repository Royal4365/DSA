class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int st = 0, end = n*m - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            int midElem = matrix[mid/m][mid%m];
            if(midElem == target){
                return true;
            }
            else if(target < midElem) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }
}
