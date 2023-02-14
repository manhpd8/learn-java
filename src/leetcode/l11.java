package leetcode;

public class l11 {
    public int maxArea(int[] height) {
        int maxV=0;
        int waterV;
        int pointerB=0, pointerE = height.length-1;
        while (pointerB<pointerE){
            waterV = (pointerE-pointerB)*Math.min(height[pointerB], height[pointerE]);
            if(waterV > maxV) maxV = waterV;
            if(height[pointerB] > height[pointerE]) {
                pointerE--;
            } else {
                pointerB++;
            }
        }
        return maxV;
    }
}
