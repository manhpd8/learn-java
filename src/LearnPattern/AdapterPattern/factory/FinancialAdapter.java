package LearnPattern.AdapterPattern.factory;

import LearnPattern.AdapterPattern.MBR.MBRABstractFunction;
import LearnPattern.AdapterPattern.auth.IAuth;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public class FinancialAdapter {
    private Object IFunction;

    public static final IFunction getInstance(String name){
        switch (name){
            case "MBR":
                return new MBRABstractFunction();
        }
        return null;
    }

    void setAuth(IAuth iAuth){

    }
}
