package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int[] markV = new int[10003];
        int maxV=0;
        for(int i=0;i<intervals.length;i++){
            markV[intervals[i][0]] = Math.max(intervals[i][1], markV[intervals[i][0]]);
            if(intervals[i][1] > maxV) maxV = intervals[i][1];
        }
        int i=0;
        int startI=-1, valueI=0;
        while(i<=maxV+1){
            if(markV[i] != 0) {
                if(valueI ==0){ // bat dau 1 array moi
                    startI =i;
                    valueI = markV[i];
                } else {
                    // dang trong array
                    //if(markV[i] > valueI) valueI = markV[i];
                    if(valueI >i) {
                        if(markV[i] > valueI) valueI = markV[i];
                    } else {
                        // het array
                        result.add(new int[]{startI,valueI});

                        startI=i;valueI=markV[i];
                    }

                }
            } else {
                if(i>valueI && startI!=-1) {
                    // het array
                    result.add(new int[]{startI,valueI});

                    startI=-1;valueI=0;
                }
            }
            i++;
        }
        int[][] resultArr = new int[result.size()][2];
        for(int j=0;j<result.size();j++){
            resultArr[j] = result.get(j);
        }
        return resultArr;
    }

    public static void main(String[] args) {
        l56 ins = new l56();
        int[][] intervals = new int[][]{
                {1,4},
                {5,6}
        };
        System.out.println(ins.merge(intervals));
    }
}
