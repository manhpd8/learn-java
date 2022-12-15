package leetcode;

public class l8 {
    public boolean firstCheck(String s){
        if(s.length()<1) return false;
        if(s.charAt(0) =='+' || s.charAt(0) =='-') return true;
        if(s.charAt(0)>=0 && s.charAt(0)<='9') return true;
        return false;
    }
    public int myAtoi(String s){
        // TIM KY TU DAU TIEN + - ., 09,.,09
        s=s.trim();
        if(firstCheck(s)==false) return 0;
        int O1st = find1Letter(s);
        boolean positive= true;
        String num;
        if(O1st >= 0) {// ky tu dau tien la +|-
            num = findNum(s,O1st+1);
            if(s.charAt(O1st)=='-') positive=false;
        } else {
            num = findNum(s,0);
        }
        if(num.indexOf(".") != num.lastIndexOf(".") || num.indexOf(".")==0) return 0;
        if(num.contains("+") || num.contains("-")) return 0;
        num = num.split("[.]")[0];
        if(num.length()==0) return 0;
        try{
            if(positive) return Integer.parseInt(num);
            else return 0-Integer.parseInt(num);
        }
        catch (Exception e){
            if(positive) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
    }
    public int find1Letter(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='+' || s.charAt(i) =='-') return i;
            if(s.charAt(i)>=0 && s.charAt(i)<='9') return i-1;
        }
        return -1;
    }

    public String findNum(String s, int ind){//bat dau = +|-
        StringBuilder sb = new StringBuilder();
        while(ind < s.length() && (s.charAt(ind) =='.' || (s.charAt(ind) >= '0' && s.charAt(ind) <='9'))) {
            sb.append(s.charAt(ind));
            ind++;
        }
        return sb.toString();
    }



    public int myAtoi2(String s) {

        int i=0;
        while(i< s.length() && isVal(s.charAt(i)) == false){
            i++;
        }
        if(i>=s.length()) return 0;

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(i));
        boolean positive = s.charAt(i) != '-';
        i++;
        while(i< s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            sb.append(s.charAt(i));
            i++;
        }
        String result = sb.toString().replaceAll("[+,-]","");
        if(result.length() ==0) return 0;
        try {
            if(positive) return Integer.parseInt(result);
            else return 0-Integer.parseInt(result);
        } catch (Exception e) {
            if(positive) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
    }

    public boolean isVal(char c){
        if(c=='+' || c =='-') return true;
        if(c>='0' && c<='9') return true;
        return false;
    }
}
