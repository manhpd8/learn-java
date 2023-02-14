package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class l217 {
    public boolean containsDuplicate3(int[] nums) {
        HashMap<Integer, Boolean> mapV = new HashMap<>();
        for (int x : nums) {
            if(mapV.containsKey(x)) return true;
            mapV.put(x, true);
        }
        return false;
    }
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true;
        }
        return false;
    }
    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> setNum = IntStream.of(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        return (nums.length != setNum.size());
    }

    public static void main(String[] args) {
        l217 ins = new l217();
        System.out.println(ins.containsDuplicate1(new int[]{1,2,3,4}));
    }
}
