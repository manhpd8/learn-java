package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by  manhpd.ho on 09/12/2021
 */
public class reduce {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        System.out.println(result);
    }
}
