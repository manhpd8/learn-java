package LearnPattern.AdapterPattern.response;

import LearnPattern.AdapterPattern.factory.IResponse;

/**
 * Created by  manhpd.ho on 15/10/2021
 */
public class MBRResponse implements IResponse {
    private String status;
    private String message;
    private Object data;
    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Object getData() {
        return this.data;
    }
}
