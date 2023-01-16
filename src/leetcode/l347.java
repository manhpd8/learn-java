package leetcode;

import java.util.*;

public class l347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,obj> mmap = new HashMap<>();
        for(int nu:nums){
           if(mmap.containsKey(nu)){
               mmap.get(nu).v++;
           } else {
               mmap.put(nu, new obj(nu,1));
           }
        }
        int[] result = new int[k];
        List<obj> ls = new ArrayList<>(mmap.values());
        Collections.sort(ls, ((obj, t1) -> {
            return t1.v-obj.v;
        }));
        for(int i=0;i<k;i++){
            result[i]=ls.get(i).k;
        }
        return result;
    }

    class obj{
        int k;
        int v;

        public obj(int k, int v) {
            this.k = k;
            this.v = v;
        }
    }
}
