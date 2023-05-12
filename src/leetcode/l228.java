package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length ==0) return result;
        if(nums.length == 1) return List.of(""+nums[0]);
        int i=0;
        while (i<nums.length){
            int bd=i;
            while(i+1<nums.length && nums[i]+1 == nums[i+1]) i++;
            if(bd == i) {
                result.add(""+nums[bd]);
            } else {
                result.add(nums[bd]+"->"+nums[i]);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,6,8,9};
        l228 ins = new l228();
        System.out.println(ins.summaryRanges(nums));
    }
}
