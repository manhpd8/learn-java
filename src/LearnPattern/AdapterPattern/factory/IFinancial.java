package LearnPattern.AdapterPattern.factory;

import java.util.Map;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public interface IFinancial {
    IResponse execute(IFunction iFunction, Map<String,Object> params);
}
