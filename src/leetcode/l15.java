package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class l15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<String, Boolean> markV = new HashMap<>();
        // sort + bin search
        Arrays.sort(nums);
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0) break;
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j]>0) break;
                int indexFind = Arrays.binarySearch(nums, j + 1, nums.length, 0 - nums[i] - nums[j]);
                if (indexFind > 0) {
                    tempList = List.of(nums[i], nums[j], nums[indexFind]);
                    if(!markV.containsKey(tempList.toString())){
                        markV.put(tempList.toString(),true);
                        result.add(tempList);
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        l15 ins = new l15();
        ins.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
