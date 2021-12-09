package LearnPattern.AdapterPattern.MBR;

import LearnPattern.AdapterPattern.factory.IResponse;
import LearnPattern.AdapterPattern.request.IRequestHandler;
import LearnPattern.AdapterPattern.response.MBRResponse;

/**
 * Created by  manhpd.ho on 18/10/2021
 */
public class MBRRequestHandle implements IRequestHandler {
    @Override
    public IResponse execute(String enpoint, Object body) {

        return new MBRResponse();
    }
}
