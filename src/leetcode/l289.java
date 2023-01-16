package leetcode;

public class l289 {
    int live = 1,dead=0;
    public void gameOfLife(int[][] board) {
        int[][] t = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(isPassRule1(board,i,j) && isPassRule2(board,i,j) && isPassRule3(board,i,j) && isPassRule4(board,i,j)){
                    t[i][j] = board[i][j];
                }else {
                    t[i][j]= 1-board[i][j];
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = t[i][j];
            }
        }
        //show(t);
    }

    boolean isPassRule1(int[][] board, int x, int y){
        //Any live cell with fewer than two live neighbors dies
        if(live == board[x][y] && 2>countStatusAround(board,x,y,live)){
            return false;
        }
        return true;
    }
    boolean isPassRule2(int[][] board, int x, int y){
        //Any live cell with two or three live neighbors lives on to the next generation.
        if(dead == board[x][y]) return true;
        int nLive = countStatusAround(board,x,y,live);
        if(nLive<2 || nLive>3){
            return false;
        }
        return true;
    }
    boolean isPassRule3(int[][] board, int x, int y){
        //Any live cell with more than three live neighbors dies, as if by over-population.
        if(live == board[x][y] && 3<countStatusAround(board,x,y,live)){
            return false;
        }
        return true;
    }
    boolean isPassRule4(int[][] board, int x, int y){
        //Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
        if(live == board[x][y]) return true;
        if(3==countStatusAround(board,x,y,live)){
            return false;
        }
        return true;
    }

    int countStatusAround(int[][] board, int x, int y, int status){
        int result =0;
        if(x-1>=0 && y-1>=0 && status == board[x-1][y-1]) result++;
        if(x-1>=0 && status == board[x-1][y]) result++;
        if(x-1>=0 && y+1<board[x].length && status == board[x-1][y+1]) result++;

        if(y-1>=0 && status == board[x][y-1]) result++;
        if(y+1<board[x].length && status == board[x][y+1]) result++;

        if(x+1<board.length && y-1>=0 && status == board[x+1][y-1]) result++;
        if(x+1<board.length && status == board[x+1][y]) result++;
        if(x+1<board.length && y+1<board[x].length && status == board[x+1][y+1]) result++;
        return result;
    }

    void show(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
