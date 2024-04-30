package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testString {

    public static void main(String[] args) {
        String detail = "${content}: ${DATA} ${content}";
        Pattern paramPattern = Pattern.compile("\\$\\{([\\w]+)}");
        Matcher paramMatcher = paramPattern.matcher(detail);
        while (paramMatcher.find()) {
            String match = paramMatcher.group(); // Chuỗi khớp với biểu thức chính quy
            String key = paramMatcher.group(1); // Lấy giá trị nằm giữa ${ và }
            System.out.println(match + " : " + key);
        }
    }
}
