package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<obj> lObj = new ArrayList<>();
        int[] result = new int[k];
        int dem1;
        for(int i=0;i< mat.length; i++) {
            dem1=0;
            obj obj = new obj();
            for(int j=0;j<mat[i].length ;j++) {
                if(mat[i][j] == 0) break;
                dem1++;
            }
            obj.val=dem1;
            obj.ind = i;
            lObj.add(obj);
        }
        Collections.sort(lObj, new Comparator<obj>() {
            @Override
            public int compare(obj obj, obj t1) {
                return obj.val - t1.val;
            }
        });
        for(int i=0;i<k;i++) {
            result[i] = lObj.get(i).ind;
        }
        return result;
    }

    class obj {
        public int val;
        public int ind;
    }
}
