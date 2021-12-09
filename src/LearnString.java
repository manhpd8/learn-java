import java.util.regex.Pattern;

/**
 * Created by  manhpd.ho on 29/10/2021
 */
public class LearnString {
    public static void main(String[] args) {
        String s = "Khách hàng hiện đang quan hệ tại 1 TCTD, không có nợ cần chú ý và không có nợ xấu tại thời điểm cuối tháng 08";
        String s1 = s.split(",")[0];
        String regex = "(.)*(\\d) TCTD(.)*";
        Pattern pattern = Pattern.compile(regex);
        boolean containsNumber = pattern.matcher(s).matches();
        if(containsNumber){
            String s2  = s.toLowerCase().split("tctd")[0];
            s2 = s2.replaceAll("\\D","");
            System.out.println(s2);
        }

        System.out.println(containsNumber);
    }
}
