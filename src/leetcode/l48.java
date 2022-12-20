package leetcode;

public class l48 {
    public void rotate(int[][] matrix) {
        int[][] arXoay = xoay(matrix);
        //swap
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = arXoay[i][j];
            }
        }
        //show(matrix);
    }

    public int[][] xoay(int[][] matrix){
        int[][] ar = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                ar[j][matrix.length-i-1] = matrix[i][j];
            }
        }
        return ar;
    }

    public void show(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
