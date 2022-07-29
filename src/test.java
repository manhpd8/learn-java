

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Created by  manhpd.ho on 01/12/2021
 */

public class test {
    public static void main(String[] args) {
        String input = "12/1/1966";
        Date date = StringUtils.parseDate(input,"dd/mm/uuuu");
        System.out.println(StringUtils.formatStr(input,"dd-mm/yyyy"));


// Using SimpleDateFormat
//        Date date = null;
//        try {
//            date = new SimpleDateFormat("M/d/yyyy").parse(input);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(date));
//        List<String> wordsInCusNameReq = Arrays.asList("pham","duc","manh");
//        LinkedList<String> wordsInCusNamePCBRes = new LinkedList<>(Arrays.asList("manh","duc","pham"));
//        StringUtils.excludeAll(wordsInCusNamePCBRes, wordsInCusNameReq);
//        System.out.println(wordsInCusNamePCBRes);
//        System.out.println(StringUtils.convertEnglishName("  @  Phạm Đức Mạnh"));
//        Date dte = StringUtils.convertStr2Date("30/01/1997");
//
//        Date cusBirthInReqDate = StringUtils.convertStr2Date("30/01/1997");
//        Date cusBirthInPCBResDate = StringUtils.convertStr2Date("30021997");
//
//        int y1 = cusBirthInReqDate.getYear();
//        int y2 = cusBirthInPCBResDate.getYear();
//        System.out.println(y1==y2);

//        String name1 = "Phạm đức @#$%2 mạnh ê Ồ";
//        String namePCB = "   Phạm đức";
//        System.out.println(StringUtils.checkNameCustomerInPCB(name1, namePCB));

        //System.out.println(name1);
//        str = str.replaceAll("[^a-zA-Z ]", "");
//        System.out.print(str);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
//        Date dateB=null;
//        //sdf.setTimeZone(TimeZone.getTimeZone("TZD"));
//        try {
//            dateB = sdf.parse("1992-07-15T07:00:00.000+07:00");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        //Date dateB = StringUtils.convertStr2Date("1992-07-15T07:00:00.000+07:00");
//        System.out.println(dateB);

//        DateTimeFormatter formatter = new DateTimeFormatter(null,null,null,null,null,null,null);
//        return formatter.parseDateTime(date);
//        String name = "LƯU NGỌC LAN";
//        System.out.println(name);
    }
}
