package LearnPattern.AdapterPattern;

import LearnPattern.AdapterPattern.MBR.MBRABstractFunction;
import LearnPattern.AdapterPattern.MBR.MBRAuth;
import LearnPattern.AdapterPattern.auth.AuthFactory;
import LearnPattern.AdapterPattern.factory.FinancialAdapter;
import LearnPattern.AdapterPattern.factory.IFunction;
import LearnPattern.AdapterPattern.response.MBRResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
//https://viblo.asia/p/adapter-va-ket-noi-bank-duoi-con-mat-cua-design-pattern-Eb85ork6l2G
public class main {
    public static void main(String[] args) {
        MBRABstractFunction function = (MBRABstractFunction) FinancialAdapter.getInstance("MBR");
        Map<String, Object> config = new HashMap<>();
        MBRAuth auth = (MBRAuth) AuthFactory.getInstance("MBR", config);
        function.setAuth(auth);
        MBRResponse response = (MBRResponse) function.requestHandler.execute("end", new Object());
    }
}
