package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class l46 {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] mark;
    Integer[] lsPermute;
    public List<List<Integer>> permute(int[] nums) {
        mark = new boolean[nums.length];
        lsPermute = new Integer[nums.length];
        hv(nums,0);
        return result;
    }

    public void hv(int[] num, int x){
        if(x== num.length) {
            show(lsPermute);
            return;
        }
        for(int i=0;i< num.length;i++){
            if(mark[i] == false) {
                mark[i] = true;
                lsPermute[x] = num[i];
                hv(num,x+1);
                mark[i] = false;
            }
        }

    }
    public void show(Integer[] num){
        for (int i: num) {
            System.out.print(i+" ");
        }
        System.out.println();
        result.add(Arrays.stream(num).collect(Collectors.toList()));
    }
}
