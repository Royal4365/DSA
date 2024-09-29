public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       return firstBadVersion(1, n);
    }
    
    private int firstBadVersion(int start, int end){
        if(start == end){
			return start;
		}
		int mid = start + (end-start)/2;
		if(isBadVersion(mid)){
			return firstBadVersion(start, mid);
		}else{
			return firstBadVersion(mid + 1, end);
		}
    }
}
