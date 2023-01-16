package leetcode;

public class l215 {
    int mmax =10001;
    int[] duong = new int[10001];
    int[] am= new int[10001];
    public int findKthLargest(int[] nums, int k) {
        int nDuong=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                duong[nums[i]]++;
                nDuong++;
            }
            else {
                am[0-nums[i]]++;
            }
        }
        if(nDuong >=k){
            for(int i=mmax-1;i>=0;i--){
                if(duong[i] >0){
                    k-=duong[i];
                    if(k<=0){
                        return i;
                    }
                }

            }
        } else {
            k-=nDuong;
            for(int i=1;i<mmax-1;i++){
                if(am[i]>0){
                    k-=am[i];
                    if(k<=0) return 0-i;
                }
            }
        }
return 0;
    }

}
