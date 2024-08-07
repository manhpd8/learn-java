package leetcode;

import java.util.HashMap;

public class l3242 {
  HashMap<Integer, toaDo> viTri = new HashMap<>();
  int[][] grid;
  public void neighborSum(int[][] grid) {
    this.grid = grid;
    for(int i=0;i<grid.length;i++) {
      for(int j=0;j<grid[0].length;j++) {
        viTri.put(grid[i][j], new toaDo(i, j));
      }
    }
  }

  public int adjacentSum(int value) {
    toaDo td = viTri.get(value);
    int tong =0;
    if(td.x>0) tong += grid[td.x-1][td.y];
    if(td.x<grid.length-1) tong += grid[td.x+1][td.y];
    if(td.y>0) tong += grid[td.x][td.y-1];
    if(td.y<grid[0].length-1) tong +=grid[td.x][td.y+1];
    return tong;
  }

  public int diagonalSum(int value) {
    toaDo td = viTri.get(value);
    int tong =0;
    if(td.x>0 && td.y>0) tong += grid[td.x-1][td.y-1];
    if(td.x<grid.length-1 && td.y<grid[0].length-1) tong += grid[td.x+1][td.y+1];
    if(td.x >0 && td.y<grid[0].length-1) tong+=grid[td.x-1][td.y+1];
    if(td.x<grid.length-1 && td.y>0) tong +=grid[td.x+1][td.y-1];
    return tong;
  }

  private class toaDo {
    public int x,y;
    public toaDo(int x, int y) {
      this.x =x;
      this.y=y;
    }
  }

}
