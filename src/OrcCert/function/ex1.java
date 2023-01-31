package OrcCert.function;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class ex1 {
    public Integer convertToInt(String s) {
        Function<String, Integer> convertNumber1 = (str) -> {
            return Integer.parseInt(str);
        };

        return convertNumber1.apply(s);
    }

    public void convertToListInt(List<String> lstStr) {
        Function<String, Integer> convertNumber2 = Integer::parseInt;
        lstStr.stream().map(convertNumber2).collect(Collectors.toList());
        IntFunction<String> convertIn = (str) -> Integer.toString(str);
    }
}
