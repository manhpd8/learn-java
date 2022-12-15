package leetcode;

public class l4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        if(n==0) return co1(nums2);
        if(m==0) return co1(nums1);
        int[] arr = new int[m+n];
        int i = 0, j = 0, dem=0;
        while (i < n && j < m) {
            if(nums1[i]<nums2[j]){
                arr[dem] = nums1[i];
                i++;

            } else {
                arr[dem] = nums2[j];
                j++;
            }
            dem++;
        }
        while(i<n){
            arr[dem] = nums1[i];
            i++;
            dem++;
        }
        while(j<m){
            arr[dem] = nums2[j];
            j++;
            dem++;
        }
        return co1(arr);
    }
    public double co1(int[] nums1){
        int mid =nums1.length/2;
        if(nums1.length %2 ==1){
            return nums1[mid];
        } else {
            return (nums1[mid] + nums1[mid-1])/2d;
        }
    }
}
