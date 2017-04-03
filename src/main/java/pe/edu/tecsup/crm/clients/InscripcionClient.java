package pe.edu.tecsup.crm.clients;

import com.sforce.soap3.ObjRequest;
import com.sforce.soap3.ObjResponse;
import com.sforce.soap3.ProductosAdquiridosPorCliente;
import com.sforce.soap3.ProductosAdquiridosPorClienteResponse;
import org.apache.log4j.Logger;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by ebenites on 3/04/2017.
 */
@Component
public class InscripcionClient extends WebServiceGatewaySupport {

    private static final Logger log = Logger.getLogger(InscripcionClient.class);

    public InscripcionClient(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.sforce.soap3");
        getWebServiceTemplate().setMarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setUnmarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setDefaultUri("https://cs71.salesforce.com/services/Soap/class/TEC_ProductosAdquiridosPorCliente_ws");
    }

    public ObjResponse sendInscripcion(String sessionid, ObjRequest inscripcion){
        log.info("sendInscripcion");

        ProductosAdquiridosPorCliente request = new ProductosAdquiridosPorCliente();
        request.setInfoCourse(inscripcion);

        ProductosAdquiridosPorClienteResponse response = (ProductosAdquiridosPorClienteResponse) getWebServiceTemplate().marshalSendAndReceive(request, new SecurityHeader(sessionid));

        ObjResponse result = response.getResult();

        log.info("Resultado: " + result.getBlnResultado().getValue());
        log.info("Error: " + result.getStrMensajeError().getValue());

        return result;
    }

}
