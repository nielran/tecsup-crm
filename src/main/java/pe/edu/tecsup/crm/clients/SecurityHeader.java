package pe.edu.tecsup.crm.clients;

import com.sforce.soap2.SessionHeader;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Created by ebenites on 3/04/2017.
 * http://memorynotfound.com/spring-ws-add-soap-header-client/
 */
public class SecurityHeader implements WebServiceMessageCallback {

    private String sessionid;

    public  SecurityHeader(String sessionid){
        this.sessionid = sessionid;
    }

    @Override
    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
        SoapHeader soapHeader = ((SoapMessage)webServiceMessage).getSoapHeader();
        try {

            SessionHeader sessionHeader  = new SessionHeader();
            sessionHeader.setSessionId(sessionid);

            JAXBContext context = JAXBContext.newInstance(SessionHeader.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(sessionHeader, soapHeader.getResult());

        } catch (JAXBException e) {
            throw new IOException("error while marshalling authentication.");
        }
    }

}
