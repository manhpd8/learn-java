package leetcode;

public class l171 {
    public int titleToNumber(String columnTitle) {
        int result =0;
        columnTitle = new StringBuilder().append(columnTitle).reverse().toString();
        for(int i=0;i<columnTitle.length();i++){
            result += Math.pow(26,i)*(columnTitle.charAt(i)-'A'+1);
        }
        return result;
    }
}
