package pe.edu.tecsup.crm.clients;

import com.sforce.soap4.ObjRequest4;
import com.sforce.soap4.ObjResponse4;
import com.sforce.soap4.SincronizarContactos;
import com.sforce.soap4.SincronizarContactosResponse;
import org.apache.log4j.Logger;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by jpalomino on 20/12/2017.
 */
@Component
public class ContactoClient extends WebServiceGatewaySupport {
    private static final Logger log = Logger.getLogger(ContactoClient.class);

    public ContactoClient(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.sforce.soap4");
        getWebServiceTemplate().setMarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setUnmarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setDefaultUri("https://na40.salesforce.com/services/Soap/class/TEC_SincronizarContactos_ws");
        //getWebServiceTemplate().setDefaultUri("https://cs13.salesforce.com/services/Soap/class/TEC_SincronizarContactos_ws");
    }

    public ObjResponse4 sendContacto(String sessionid, ObjRequest4 contacto){
        log.info("sendContacto");

        SincronizarContactos request = new SincronizarContactos();
        request.setInfoContacto(contacto);

        SincronizarContactosResponse responde = (SincronizarContactosResponse) getWebServiceTemplate().marshalSendAndReceive(request, new SecurityHeader(sessionid));

        ObjResponse4 result = responde.getResult();

        log.info("Resultado: " + result.getBlnResultado().getValue());
        log.info("Error: " + result.getStrMensajeError().getValue());

        return result;

    }
}
