package leetcode;

public class l36 {
    int siz=9;
    public boolean isValidSudoku(char[][] board) {
        return validCols(board) && validRows(board) && validCube3(board);
    }

    boolean validRows(char[][] board){
        for(int i=0;i<siz;i++){
            boolean[] markv = new boolean[10];
            for(int j=0;j<siz;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] -'0';
                    if(markv[num] == true) return false;
                    markv[num] = true;
                }
            }
        }
        return true;
    }

    boolean validCols(char[][] board){
        for(int i=0;i<siz;i++){
            boolean[] markv = new boolean[10];
            for(int j=0;j<siz;j++){
                if(board[j][i] != '.'){
                    int num = board[j][i] - '0';
                    if(markv[num] == true) return false;
                    markv[num] = true;
                }
            }
        }
        return true;
    }

    boolean validCube3(char[][] board){
        for(int i=0;i<siz;i+=3){
            for(int j=0;j<siz;j+=3){
                boolean[] markv = new boolean[10];
                for(int k1=i;k1<i+3;k1++){
                    for(int k2=j;k2<j+3;k2++){
                        if(board[k1][k2] != '.'){
                            int num = board[k1][k2] - '0';
                            if(markv[num] == true) return false;
                            markv[num] = true;
                        }
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        l36 ins = new l36();
        boolean ok =ins.validCube3(board);
        System.out.println(ok);
    }
}
