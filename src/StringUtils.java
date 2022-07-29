/**
 * Created by  manhpd.ho on 30/05/2022
 */
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class StringUtils {
    private static char[] SOURCE_CHARACTERS = { 'À', 'Á', 'Â', 'Ã', 'È', 'É',
            'Ê', 'Ì', 'Í', 'Ò', 'Ó', 'Ô', 'Õ', 'Ù', 'Ú', 'Ý', 'à', 'á', 'â',
            'ã', 'è', 'é', 'ê', 'ì', 'í', 'ò', 'ó', 'ô', 'õ', 'ù', 'ú', 'ý',
            'Ă', 'ă', 'Đ', 'đ', 'Ĩ', 'ĩ', 'Ũ', 'ũ', 'Ơ', 'ơ', 'Ư', 'ư', 'Ạ',
            'ạ', 'Ả', 'ả', 'Ấ', 'ấ', 'Ầ', 'ầ', 'Ẩ', 'ẩ', 'Ẫ', 'ẫ', 'Ậ', 'ậ',
            'Ắ', 'ắ', 'Ằ', 'ằ', 'Ẳ', 'ẳ', 'Ẵ', 'ẵ', 'Ặ', 'ặ', 'Ẹ', 'ẹ', 'Ẻ',
            'ẻ', 'Ẽ', 'ẽ', 'Ế', 'ế', 'Ề', 'ề', 'Ể', 'ể', 'Ễ', 'ễ', 'Ệ', 'ệ',
            'Ỉ', 'ỉ', 'Ị', 'ị', 'Ọ', 'ọ', 'Ỏ', 'ỏ', 'Ố', 'ố', 'Ồ', 'ồ', 'Ổ',
            'ổ', 'Ỗ', 'ỗ', 'Ộ', 'ộ', 'Ớ', 'ớ', 'Ờ', 'ờ', 'Ở', 'ở', 'Ỡ', 'ỡ',
            'Ợ', 'ợ', 'Ụ', 'ụ', 'Ủ', 'ủ', 'Ứ', 'ứ', 'Ừ', 'ừ', 'Ử', 'ử', 'Ữ',
            'ữ', 'Ự', 'ự', 'ỳ', 'ý', 'ỷ', 'ỹ', 'ỵ'};

    private static char[] DESTINATION_CHARACTERS = { 'A', 'A', 'A', 'A', 'E',
            'E', 'E', 'I', 'I', 'O', 'O', 'O', 'O', 'U', 'U', 'Y', 'a', 'a',
            'a', 'a', 'e', 'e', 'e', 'i', 'i', 'o', 'o', 'o', 'o', 'u', 'u',
            'y', 'A', 'a', 'D', 'd', 'I', 'i', 'U', 'u', 'O', 'o', 'U', 'u',
            'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A',
            'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'E', 'e',
            'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E',
            'e', 'I', 'i', 'I', 'i', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o',
            'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O',
            'o', 'O', 'o', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u',
            'U', 'u', 'U', 'u', 'y', 'y', 'y', 'y', 'y'};

    public static char removeAccent(char ch) {
        int index = Arrays.binarySearch(SOURCE_CHARACTERS, ch);
        if (index >= 0) {
            ch = DESTINATION_CHARACTERS[index];
        }
        return ch;
    }



    public static String removeAccentV2(String s) {
        if(null == s || s.length() < 1 ) return "";
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("đ","d").replaceAll("Đ","D");
    }

    public static String convertEnglishName(String name) {
        if(null == name || name.length() < 1 ) return "";
        name = removeAccentV2(name);
        return name.toLowerCase()
                .replaceAll("[^a-zA-Z ]", "")
                .replaceAll("\\s+", " ")
                .trim();
    }

    public static Boolean checkNameCustomerInPCB(String cusNameInReq, String cusNameInPCBRes) {
        String cusNameInReqEN = convertEnglishName(cusNameInReq);
        String cusNameInPCBResEN = convertEnglishName(cusNameInPCBRes);

        List<String> wordsInCusNameReq = Arrays.asList(cusNameInReqEN.split(" "));
        List<String> wordsInCusNamePCBRes = Arrays.asList(cusNameInPCBResEN.split(" "));

        return wordsInCusNameReq.containsAll(wordsInCusNamePCBRes);
    }

    public static Date convertStr2Date(String strdate) {
        Date result;
        List<String> LIST_FORMAT_DATE = Arrays.asList("dd/MM/yyyy", "dd-MM-yyyy", "yyyy-MM-dd", "yyyy/MM/dd", "ddMMyyyy","yyyy-MM-ddTHH:mm:ss'Z'");
        for (String patternFormat : LIST_FORMAT_DATE) {
            result = parseDate(strdate, patternFormat);
            if (result != null) return result;
        }
        return null;
    }

    public static Date parseDate(String inputDate, String pattern) {
        try {
            if (inputDate == null || inputDate.isBlank()) {
                return null;
            }
            var simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.parse(inputDate);
        } catch (ParseException e) {
            return null;
        }
    }

    public static boolean excludeAll(LinkedList<String> a, List<String> b) {
        Objects.requireNonNull(a);
        Objects.requireNonNull(b);
        boolean modified = false;

        for (String str : b) {
            int i = a.indexOf(str);
            if(i>=0) {
                a.remove(i);
                modified = true;
            }
        }
        return modified;
    }

    public static String formatStr(String strdate, String patternFormat) {
        Date strdateFormat = convertStr2Date(strdate);
        if(strdateFormat == null) {
            return null;
        }
        return formatDate(strdateFormat, patternFormat);
    }
    public static String formatDate(Date inputDate, String pattern) {
        if (inputDate == null) {
            return null;
        }
        var simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(inputDate);
    }
}
