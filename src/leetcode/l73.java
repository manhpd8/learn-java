package leetcode;

public class l73 {
    int[][] matrix;
    int n,m;
    public void setZeroes(int[][] matrix) {
        this.matrix = matrix;
        this.n = matrix.length;
        this.m = matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    //ben trai va ben tren
                    paintLeftAndUp(i,j);
                } else {
                    //k.tra xem co bi dinh ko
                    if(isPass(i,j) == false){
                        paintLeftAndUp(i,j);
                    }
                }
            }
        }
        System.out.println(this.matrix);
    }

    void paintLeftAndUp(int x,int y) {
        for(int i=0;i<=y;i++){//left
            if(matrix[x][i] ==0) break;
            this.matrix[x][i] = 0;
        }
        for(int i=0;i<=x;i++) {//up
            if(matrix[i][y] ==0) break;
            this.matrix[i][y] = 0;
        }
    }

    boolean isPass(int x,int y){
        for(int i=0;i<y;i++) {//k.tra ben trai
            if(this.matrix[x][i] ==0) return false;
        }
        for(int i=0;i<x;i++){//k.tra ben tren
            if(this.matrix[i][y] == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mt = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        l73 ins = new l73();
        ins.setZeroes(mt);
    }
}
