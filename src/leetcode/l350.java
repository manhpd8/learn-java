package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[][] markV = new int[1001][2];
        for(int i=0;i<nums1.length;i++) markV[nums1[i]][0]++;
        for(int i=0;i<nums2.length;i++) markV[nums2[i]][1]++;
        List<Integer> listResult = new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(markV[i][0] >0 && markV[i][1]>0){
                // them i vao list j lan
                int j = Math.min(markV[i][0], markV[i][1]);
                while (j>0) {
                    listResult.add(i);
                    j--;
                }
            }
        }
        return listResult.stream().mapToInt(Integer::intValue).toArray();
    }
}
