package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class l18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashMap<String, List<Integer>> kq = new HashMap<>();
        HashMap<Integer,Integer> numH = new HashMap<>(201);
        for(int i=0;i<nums.length;i++){
            numH.put(nums[i], i);
        }
        long hieuL;
        for(int i1=0;i1<=nums.length;i1++){
            for(int i2=i1+1;i2<nums.length;i2++){
                for(int i3=i2+1;i3<nums.length;i3++){
                    hieuL= target;
                    hieuL = hieuL -nums[i1]-nums[i2]-nums[i3];
                    if(hieuL<Integer.MIN_VALUE || hieuL>Integer.MAX_VALUE) continue;
                    int hieu=(int)hieuL;
                    if(numH.containsKey(hieu)){
                        int i4 = numH.get(hieu);
                        if(i4>i3){
                            List<Integer> temp = Arrays.asList(nums[i1],nums[i2],nums[i3],nums[i4]);
                            Collections.sort(temp);
                            kq.put(temp.toString(), temp);
                        }
                    }
                }
            }
        }
        return kq.values().stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        l18 ins = new l18();
        int[] nums = new int[]{1,0,-1,0,-2,2};
        int target =0;
        ins.fourSum(nums,target);
    }
}
