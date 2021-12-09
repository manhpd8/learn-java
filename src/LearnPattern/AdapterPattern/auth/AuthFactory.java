package LearnPattern.AdapterPattern.auth;

import LearnPattern.AdapterPattern.MBR.MBRAuth;

import java.util.Map;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public class AuthFactory {
    public static IAuth getInstance(String name, Map<String, Object> config){
        switch (name){
            case "MBR" :
                return new MBRAuth();
        }
        return new MBRAuth();
    }
}
