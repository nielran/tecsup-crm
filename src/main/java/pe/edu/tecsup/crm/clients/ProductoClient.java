package pe.edu.tecsup.crm.clients;

import com.sforce.soap2.PersistirProducto;
import com.sforce.soap2.PersistirProductoResponse;
import com.sforce.soap2.TECActualizarProductoRequestCls;
import com.sforce.soap2.TECActualizarProductoResponseCls;
import org.apache.log4j.Logger;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * Created by ebenites on 3/04/2017.
 */
@Component
public class ProductoClient  extends WebServiceGatewaySupport {

    private static final Logger log = Logger.getLogger(ProductoClient.class);


    public ProductoClient(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.sforce.soap2");
        getWebServiceTemplate().setMarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setUnmarshaller(jaxb2Marshaller);
        getWebServiceTemplate().setDefaultUri("https://na40.salesforce.com/services/Soap/class/TEC_AdministracionProductos_ws");
        //getWebServiceTemplate().setDefaultUri("https://cs13.salesforce.com/services/Soap/class/TEC_AdministracionProductos_ws");
    }

    public TECActualizarProductoResponseCls sendProducto(String sessionid, TECActualizarProductoRequestCls producto){
        log.info("sendProducto");

        PersistirProducto request = new PersistirProducto();
        request.setProductoRequest(producto);

        PersistirProductoResponse response = (PersistirProductoResponse) getWebServiceTemplate().marshalSendAndReceive(request, new SecurityHeader(sessionid));

        TECActualizarProductoResponseCls result = response.getResult();

        log.info("Resultado: " + result.getResultado().getValue());
        log.info("Error: " + result.getError().getValue());

        return result;
    }

}
