package lachauxk.channelmessaging;

/**
 * Created by lachauxk on 29/01/2018.
 */
public class ConnectResponse {
    private String response;
    private int code;
    public String accesstoken;

    public ConnectResponse(){
        //Ceci n'est pas un constructeur
    }

    public String getToken(){
        return accesstoken;
    }
}
