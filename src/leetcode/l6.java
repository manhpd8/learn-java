package leetcode;

public class l6 {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        char[][] arr = new char[1000][numRows];
        int i = 0, x = 0, y = 0;
        boolean isDown = true;
        while (i < s.length()) {
            if (isDown) {
                arr[x][y] = s.charAt(i);
                y++;
            } else {
                y--;
                x++;
                arr[x][y] = s.charAt(i);
            }
            if (y == 0) {
                isDown = true;
                y++;
            }
            if (y == numRows) {
                //y--;
                isDown = false;
                y--;
            }
            i++;
        }
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < numRows; k++) {
            for (int j = 0; j <= x; j++) {
                //System.out.print(arr[j][k] + " ");
                if (arr[j][k] != '\u0000') {
                    result.append(arr[j][k]);
                }
            }
            //System.out.println();
        }
        //System.out.println();
        return result.toString();
    }

    public static void main(String[] args) {
        l6 ins = new l6();
        String s = "PAYPALISHIRING";
        int num = 4;
        System.out.println(ins.convert(s, num));
    }
}
