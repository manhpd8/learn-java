package leetcode;

public class l38 {
    public String countAndSay(int n) {
        String str="1";
        for(int i=1;i<n;i++){
            str = recursive(str);
        }
        return str;
    }

    String recursive(String str){
        StringBuilder strResult = new StringBuilder();
        char currentLetter = str.charAt(0);
        int countLetter =1;
        int i=1;
        while(i<str.length()){
            if(currentLetter == str.charAt(i)){
                countLetter++;
            } else {
                // save result step
                strResult.append(countLetter);
                strResult.append(currentLetter);
                currentLetter = str.charAt(i);
                countLetter = 1;
            }
            i++;
        }
        //
        strResult.append(countLetter);
        strResult.append(currentLetter);
        return strResult.toString();
    }

    public static void main(String[] args) {
        l38 ins = new l38();
        System.out.println(ins.countAndSay(4));
    }
}
