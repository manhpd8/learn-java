package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l39 {
    List<List<Integer>> result = new ArrayList<>();
    int[] candidates;
    int target,tong=0;
    List<Integer> arr = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        this.target = target;
        sinh(0);
        return result;
    }

    void sinh(int k) {
        if(k== candidates.length) return;
        for(int i=0;i<=(target-tong)/candidates[k];i++){
            tong+=candidates[k];
            if(tong == target) {
                arr.add(candidates[k]);
                result.add(arr);
                tong -= candidates[k];
                arr.remove(candidates[k]);
                break;
            }
            if(tong > target){
                tong -= candidates[k];
                break;
            }
            if(tong < target){
                arr.add(candidates[k]);
                sinh(k+1);
                arr.remove(candidates[k]);
            }
        }
    }

}
