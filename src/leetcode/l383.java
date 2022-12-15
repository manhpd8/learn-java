package leetcode;

import java.util.HashMap;
import java.util.Map;

public class l383 {
    Map<Character, Integer> hm = new HashMap<>();
    Map<Character, Integer> hm2 = new HashMap<>();
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0; i<ransomNote.length() ; i++) {
            if(hm.containsKey(ransomNote.charAt(i))) {
                hm.put(ransomNote.charAt(i), hm.get(ransomNote.charAt(i))+1);
            } else {
                hm.put(ransomNote.charAt(i), 1);
            }
        }

        for(int i=0; i<magazine.length() ; i++) {
            if(hm2.containsKey(magazine.charAt(i))) {
                hm2.put(magazine.charAt(i), hm2.get(magazine.charAt(i))+1);
            } else {
                hm2.put(magazine.charAt(i), 1);
            }
        }
        for (Character c: hm.keySet()) {
            if(!hm2.containsKey(c)) return false;
            if(hm.get(c)>hm2.get(c)) return false;
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) return false;
        int[] charIndexes = new int[26];
        int magIndex = 0;
        for (char car : ransomNote.toCharArray()) {
            magIndex = magazine.indexOf(car, charIndexes[car-'a']);

            if (magIndex == -1) return false;

            charIndexes[car-'a'] = magIndex + 1;
        }
        return true;
    }
}
