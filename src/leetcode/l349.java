package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] markArr = new boolean[1001];
        boolean[] marks = new boolean[1001];
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            markArr[nums1[i]] = true;
        }
        for(int i=0; i<nums2.length;i++){
            if(markArr[nums2[i]] && marks[nums2[i]] ==false) {
                result.add(nums2[i]);
                marks[nums2[i]]=true;
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
