package LearnPattern.AdapterPattern.request;

import LearnPattern.AdapterPattern.factory.IResponse;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public interface IRequestHandler {
    IResponse execute(String enpoint, Object body);
}
