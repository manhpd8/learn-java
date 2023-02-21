package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l54 {
    int[][] matrix;
    List<Integer> result = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        this.matrix = matrix;
        recursive(0, n-1,0,m-1);
        return result;
    }

    void recursive(int vStart, int vEnd, int hStart, int hEnd) {
        if(vStart == vEnd){
            for(int i=hStart;i<=hEnd;i++){
                result.add(matrix[vStart][i]);
            }
            return;
        }
        if(hStart==hEnd){
            for(int i=vStart;i<=vEnd;i++){
                result.add(matrix[i][hStart]);
            }
            return;
        }
        if(vStart>vEnd || hStart>hEnd) return;
        // turn right
        for(int i=hStart;i<hEnd;i++){
            result.add(matrix[vStart][i]);
        }

        // down
        for(int i=vStart;i<=vEnd;i++){
            result.add(matrix[i][hEnd]);
        }

        // turn left
        for(int i=hEnd-1;i>=hStart;i--){
            result.add(matrix[vEnd][i]);
        }

        //up
        for(int i=vEnd-1;i>vStart;i--){
            result.add(matrix[i][hStart]);
        }
        recursive(vStart+1,vEnd-1,hStart+1,hEnd-1);
    }

    public static void main(String[] args) {
        l54 ins = new l54();
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
//        int[][] matrix = new int[][]{
//                {1,2,3,},
//                {4,5,6},
//                {7,8,9}
//        };
        System.out.println(ins.spiralOrder(matrix));
    }
}
