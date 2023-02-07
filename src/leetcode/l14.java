package leetcode;

public class l14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int k=0;
        StringBuilder result = new StringBuilder();
        while(k<strs[0].length()){
            char chari = strs[0].charAt(k);
            for(int i=1;i<strs.length;i++){
                if(k>=strs[i].length() || strs[i].charAt(k) != chari){
                    return result.toString();
                }
            }
            result.append(chari);
            k++;
        }
        return result.toString();
    }
}
