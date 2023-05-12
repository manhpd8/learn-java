package leetcode;

import java.util.Arrays;

public class l1402 {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int total=satisfaction[satisfaction.length-1];
        if(total <=0) return 0;
        int result=total;
        for(int i=satisfaction.length-2;i>=0;i--){
            int point = total+satisfaction[i];
            if(point>0) {
                result+=point;
                total=point;
            } else {
                break;
            }
        }
        return result;
    }
}
