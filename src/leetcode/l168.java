package leetcode;

public class l168 {
    public String convertToTitle(int columnNumber) {
        String result="";
        int nguyen = columnNumber/27;
        int du = columnNumber-nguyen*26;
        if(nguyen >0 && nguyen <27){
            result += (char) ('A'+nguyen-1);
        } else {
            if(nguyen>27) result= convertToTitle(nguyen);

        }
        if(du>0){
            result+= (char)('A'-1+du);
        }
        return result;
    }

    public static void main(String[] args) {
        l168 ins = new l168();
        System.out.println(ins.convertToTitle(1));
    }
}
