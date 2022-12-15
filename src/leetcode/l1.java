package leetcode;

import java.util.*;

public class l1 {
    public int[] twoSum(int[] nums, int target) {
        List<Map.Entry<Integer,Integer>> lst = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            lst.add(Map.entry(i,nums[i]));
        }
        Collections.sort(lst, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return integerIntegerEntry.getValue()-t1.getValue();
            }
        });
        for(int i=0;i<nums.length;i++){
            int indEnd = binSearch(lst,target-lst.get(i).getValue(), i+1, nums.length-1);
            if( indEnd>=0) {
                return new int[]{lst.get(i).getKey(), indEnd};
            }
        }
        return new int[]{};
    }

    public int binSearch(List<Map.Entry<Integer,Integer>> lst, int k, int sta, int end) {
        if(sta>end) return -1;
        Map.Entry<Integer,Integer> mid = lst.get((sta +end)/2);
        if(mid.getValue() == k) return mid.getKey();
        if(mid.getValue() > k) return binSearch(lst, k,sta, (sta +end)/2-1);
        if(mid.getValue() < k) return binSearch(lst, k,(sta +end)/2+1, end);
        return -1;
    }
}
