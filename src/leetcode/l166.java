package leetcode;

import java.util.HashMap;
import java.util.Map;

public class l166 {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }


        StringBuilder result = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
            result.append("-");
        }
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        result.append(numerator / denominator); // Add integer part

        // Check sign and add if negative
//        if ((numerator < 0) ^ (denominator < 0)) {
//            result.insert(0, "-");
//        }

        int remainder = Math.abs(numerator % denominator);
        if (remainder == 0) {
            return result.toString(); // No decimal part
        }
        result.append(".");
        // Use a map to track seen remainders and their positions
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(remainder, result.length());

        while (remainder != 0) {
            numerator = remainder * 10;
            int digit = numerator / denominator;
            result.append(digit);
            remainder = numerator % denominator;

            // Check for repeating pattern
            if (seen.containsKey(remainder)) {
                int start = seen.get(remainder);
                return result.substring(0, start) + "(" + result.substring(start, result.length()) + ")";
            }

            seen.put(remainder, result.length());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        l166 ins = new l166();
        String s = ins.fractionToDecimal(7, -12);
        System.out.println(s);
    }
}
