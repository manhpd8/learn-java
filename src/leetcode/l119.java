package leetcode;

import java.util.ArrayList;
import java.util.List;

public class l119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long value = 1;

        for (int k = 0; k <= rowIndex; k++) {
            result.add((int) value);
            value = value * (rowIndex - k) / (k + 1);
        }

        return result;
    }
}
