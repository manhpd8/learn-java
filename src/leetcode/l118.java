package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> lst = new ArrayList<>();
            List<Integer> lstBef = result.get(i-1);
            lst.add(1);
            for(int j=1;j<lstBef.size();j++){
                lst.add(lstBef.get(j)+lstBef.get(j-1));
            }
            lst.add(1);
            result.add(lst);
        }
        return result;
    }
}
