package dto;

import java.util.stream.Stream;

/**
 * Created by  manhpd.ho on 16/05/2022
 */
public class DataUtils {
    public static Boolean isNotEmptyObject(Object obj) {
        boolean valid = Stream.of(obj.getClass().getDeclaredFields())
                .anyMatch(f -> {
                    f.setAccessible(true);
                    try {
                        return f.get(obj).equals("");
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
        return valid;
    }
}
