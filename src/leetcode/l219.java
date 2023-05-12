package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> mmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mmap.containsKey(nums[i])){
                //so sanh xem co ko
                List<Integer> listIndex=mmap.get(nums[i]);
                if(Math.abs(listIndex.get(listIndex.size()-1) - i) <=k) return true;
                listIndex.add(i);
            } else {
                List<Integer> listIndex = new ArrayList<>();
                listIndex.add(i);
                mmap.put(nums[i],listIndex);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,2,3};
        int k=2;
        l219 ins = new l219();
        Boolean re=ins.containsNearbyDuplicate(nums,k);
        System.out.println(re);
    }
}
