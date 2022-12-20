package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l78 {
    List<List<Integer>> result = new ArrayList<>();
    int[] ar;
    boolean[] mark;

    public List<List<Integer>> subsets(int[] nums) {

        for(int i=1;i<=nums.length;i++){
            sth(nums,i);
        }
        return null;
    }

    public void sth(int[] nums, int x){//x la so to hop
        ar = new int[x];
        mark = new boolean[nums.length];
        sth_dq(nums,0,x);

    }

    public void sth_dq(int[] nums, int i,int x){
        if(i==x) {
            show(ar);
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(mark[j] == false){
                ar[i]=nums[j];
                mark[j]=true;
                sth_dq(nums,i+1,x);
                //mark[j]=false;

            }
        }
    }

    public void show(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

}
