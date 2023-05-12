package leetcode;

public class l278 {
    public int firstBadVersion(int n) {
        int start=1,end=n;
        int mid;
        while (start<end){
            mid=start +(end-start)/2;
            if(isBadVersion(mid)){
                end = mid;
            } else {
                start=mid+1;
            }
        }
        return start;
    }
    boolean isBadVersion(int v){
        return true;
    }

}
