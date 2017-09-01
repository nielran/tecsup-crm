package pe.edu.tecsup.crm.clients;

import com.sforce.soap1.Login;
import com.sforce.soap1.LoginResponse;
import com.sforce.soap1.LoginResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by ebenites on 2/04/2017.
 */
@Component
public class LoginClient extends WebServiceGatewaySupport {

    private static final Logger log = Logger.getLogger(LoginClient.class);

    @Value("${crm.credentials.username}")
    private String CRM_CREDENTIALS_USERNAME;

    @Value("${crm.credentials.password}")
    private String CRM_CREDENTIALS_PASSWORD;

    public LoginClient(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.sforce.soap1");
        getWebServiceTemplate().setMarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setUnmarshaller(jaxb2Marshaller);
        //getWebServiceTemplate().setDefaultUri("https://login.salesforce.com/services/Soap/u/39.0");
        getWebServiceTemplate().setDefaultUri("https://test.salesforce.com/services/Soap/u/39.0");
    }

    public String login() {
        log.info("request");

        Login request = new Login();
        request.setUsername(CRM_CREDENTIALS_USERNAME);
        request.setPassword(CRM_CREDENTIALS_PASSWORD);

        log.info("Requesting request for " + CRM_CREDENTIALS_USERNAME);

        LoginResponse response = (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        LoginResult result = response.getResult();

        String sessionid = result.getSessionId();
        log.info("SesisonID: " + sessionid);

        return sessionid;
    }

}
