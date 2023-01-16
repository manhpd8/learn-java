package leetcode;

import java.util.HashMap;
import java.util.Map;

public class l169 {
    public int majorityElement(int[] nums) {
        if(nums.length <3) return nums[0];
        Map<Integer, Integer> mmap = new HashMap<>();
        int nmax=0;
        int nvalue;
        for(int i: nums){
            if(mmap.containsKey(i)){
                nvalue = mmap.get(i) +1;
                if(nvalue >nmax) nmax = nvalue;
                mmap.put(i, nvalue);
                if(nvalue > nums.length/2) return i;
            } else {
                mmap.put(i, 1);
            }

        }
        return 0;
    }
}
