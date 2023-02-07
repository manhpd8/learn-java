package leetcode;

public class l88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[n+m];
        int i=0,j=0,dem=0;
        while (i<m && j<n){
            if(nums1[i] < nums2[j]){
                arr[dem] = nums1[i];
                i++;dem++;
            } else {
                arr[dem] = nums2[j];
                j++;
                dem++;
            }
        }
        while (i<m) {
            arr[dem] = nums1[i];
            i++;dem++;
        }
        while (j<n){
            arr[dem] = nums2[j];
            j++;
            dem++;
        }
        for(int ii=0;ii<m+n;ii++){
            nums1[ii]=arr[ii];
        }
    }
}
