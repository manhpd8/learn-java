package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by  manhpd.ho on 09/12/2021
 */
public class reduce {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        letters.stream().filter(s -> s.equals("a")).findFirst();
        letters.parallelStream().filter(a -> a == "b").sorted((s1, s2) -> s1.length() - s2.length());
        String result = letters
                .stream()
                .reduce("1", (element, partialString) -> partialString + element);
        System.out.println(result);

        String minStr = letters.stream().max(Comparator.comparing(e -> e)).get();
    }
}
