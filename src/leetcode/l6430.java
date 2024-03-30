package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l6430 {
    public int[] circularGameLosers(int n, int k) {
        boolean[] arr = new boolean[n+1];
        arr[1] =true;
        int i=1;
        int ht=1;
        while(true){
            ht = (ht+i*k)%(n);
            if(ht==0) ht=n;
            if(arr[ht]){
                return inkq(arr,n);
            }
            arr[ht] = true;
            i++;
        }
    }

    int[] inkq(boolean[] arr,int n){
        List<Integer> result = new ArrayList<>();
        //arr[n] = arr[0];
        for(int i=1;i<=n;i++){
            if(arr[i]==false) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        l6430 ins = new l6430();
        System.out.println(ins.circularGameLosers(4,4));
    }
}
