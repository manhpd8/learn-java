package LearnPattern.AdapterPattern.factory;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public interface IResponse {
    String getStatus();
    String getMessage();
    Object getData();
}
