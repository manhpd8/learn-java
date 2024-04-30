package leetcode;

import java.util.Arrays;

public class l378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] arr = new int[m*n];
        int dem=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                arr[dem] = matrix[i][j];
                dem++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    //Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
    //Output: 13
    // 1 5 9 10 11 12 13 13 15

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,5,9},{10,11,13}, {12,13,15}};
        int k=8;
        l378 ins = new l378();
        System.out.println(ins.kthSmallest(matrix, k));
    }
}
