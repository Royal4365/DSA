class Solution {
    public int hIndex(int[] citations) {
        int st = 0, end = citations.length - 1, h = 0;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(citations.length-mid <= citations[mid]){
                h = citations.length-mid;
                end = mid-1;
            }    
            else st = mid+1;
        }
        return h;
    }
}
