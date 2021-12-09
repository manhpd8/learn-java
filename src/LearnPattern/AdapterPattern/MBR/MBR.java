package LearnPattern.AdapterPattern.MBR;

import LearnPattern.AdapterPattern.factory.IFinancial;
import LearnPattern.AdapterPattern.factory.IFunction;
import LearnPattern.AdapterPattern.factory.IResponse;

import java.util.Map;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public class MBR implements IFinancial {
    @Override
    public IResponse execute(IFunction iFunction, Map<String, Object> params) {
        return null;
    }
}
