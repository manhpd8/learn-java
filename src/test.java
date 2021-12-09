/**
 * Created by  manhpd.ho on 01/12/2021
 */
public class test {
    public static void main(String[] args) {
        String e = "[400 Bad Request] during [POST] to [http://dev-esb.mcredit.com.vn:8280/api/v1.0/fas/cases/new] [FasService#pushContractBpmToFas(FasRequestDTO)]: [{  \"statusCode\": \"400.01\",  \"statusCodeExplained\": \"customerOfficeAddress is malformed!\"}]";
        String[] ls = e.split("statusCodeExplained");
        String msg = ls[1];
        msg = msg.replaceAll("[^(a-zA-Z /s)]*","");
        if(msg.matches("[(a-zA-Z /s)]+(is malformed)")){
            String field = msg.split("is malformed")[0].trim();
            System.out.println(field);
        }
        System.out.println(msg);
    }
}
