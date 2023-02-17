package leetcode;

import java.util.Arrays;

public class l33 {
    int[] nums;

    public int search(int[] nums, int target) {
        int result;
        if(nums.length <4) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target) return i;
            }
            return -1;
        }
        this.nums = nums;
        int rotaIndex = findRotateIndex();
        System.out.println(rotaIndex);

        result = Arrays.binarySearch(nums,rotaIndex, nums.length,target);
        if(result<0) result = Arrays.binarySearch(nums,0,rotaIndex,target);

        if(result>=0) return result;
        return -1;
    }

    //tim vi tri xoay
    int findRotateIndex() {
        int l=0,r= nums.length-1;
        while (l<r){
            //System.out.println(nums[l]+" - "+nums[r]);
            int mid =(l+r)/2;
            if(nums[mid] < nums[mid-1]) return mid;
            if(nums[mid]>nums[mid+1]) return mid+1;
            if(nums[mid]>nums[l]){
                //nam o ben phai
                l=mid+1;
            } else {
                r =mid;
            }
        }
       return l;
    }


    public static void main(String[] args) {
        l33 ins = new l33();
        int x =ins.search(new int[]{4,5,6,7,0,1,2},4);
        System.out.println(x);
    }
}
