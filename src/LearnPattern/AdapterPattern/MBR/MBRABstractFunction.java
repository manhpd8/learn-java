package LearnPattern.AdapterPattern.MBR;

import LearnPattern.AdapterPattern.auth.IAuth;
import LearnPattern.AdapterPattern.factory.IFunction;
import LearnPattern.AdapterPattern.request.IRequestHandler;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public class MBRABstractFunction implements IFunction {
    public IRequestHandler requestHandler;
    public void setAuth(IAuth iAuth){};
}
