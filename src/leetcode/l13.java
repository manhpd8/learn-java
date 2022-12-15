package leetcode;

import java.util.HashMap;
import java.util.Map;

public class l13 {
    Map<Character, Integer> romanCode = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int result = romanCode.get(s.charAt(s.length()-1));
        char cBefore;
        char ci;
        for (int i=s.length()-2; i>=0; i--) {
            ci = s.charAt(i);
            cBefore = s.charAt(i+1);
            if(romanCode.get(ci) >= romanCode.get(cBefore)) {
                result += romanCode.get(ci);
            } else {
                result -= romanCode.get(ci);

            }
        }
        return result;
    }
}
