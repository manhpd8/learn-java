package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        for(int i=1;i<=s.length();i++){
            List<String> subStrList = new ArrayList<>();
            for(int j=0;j<=s.length()-i;j++){
                String subStr = s.substring(j,j+i);
                if(subStr.equals(new StringBuilder().append(subStr).reverse().toString())){
                    subStrList.add(subStr);
                }
            }
            if(subStrList.size()>0){
                result.add(new ArrayList<>(subStrList));
            }

        }
        return result;
    }
}
