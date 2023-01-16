package leetcode;

import java.util.*;

public class l49 {
    Map<String, List<String>> result= new HashMap<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        for (String str:strs) {
            String strSorted = sortStr(str);
            if(result.containsKey(strSorted)){
                result.get(strSorted).add(str);
            }else {
                List<String> stringList = new ArrayList<>();
                stringList.add(str);
                result.put(strSorted, stringList);
            }
        }
        return new ArrayList<>(result.values());
    }

    String sortStr(String str){
        char[] chars = new char[26];
        for(int i=0;i<str.length();i++){
            chars[str.charAt(i)-'a']++;
        }
        return new String(chars);
    }
}
