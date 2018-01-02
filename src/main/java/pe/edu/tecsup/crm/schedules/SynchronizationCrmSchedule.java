package pe.edu.tecsup.crm.schedules;

import com.sforce.soap2.TECActualizarProductoRequestCls;
import com.sforce.soap2.TECActualizarProductoResponseCls;
import com.sforce.soap3.ObjRequest;
import com.sforce.soap3.ObjResponse;
import com.sforce.soap4.ObjRequest4;
import com.sforce.soap4.ObjResponse4;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pe.edu.tecsup.crm.clients.ContactoClient;
import pe.edu.tecsup.crm.clients.InscripcionClient;
import pe.edu.tecsup.crm.clients.LoginClient;
import pe.edu.tecsup.crm.clients.ProductoClient;
import pe.edu.tecsup.crm.services.CrmService;

import javax.xml.ws.WebServiceException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ebenites on 3/04/2017.
 */
@Component
public class SynchronizationCrmSchedule {

    private static final Logger log = Logger.getLogger(SynchronizationCrmSchedule.class);

    @Autowired
    private CrmService crmService;

    @Autowired
    private LoginClient loginClient;

    @Autowired
    private ProductoClient productoClient;

    @Autowired
    private InscripcionClient inscripcionClient;

    @Autowired
    private ContactoClient contactoClient;

    @Scheduled(cron="0 0 8-21 * * MON-FRI")
    public void run() throws Exception{
        log.info("run");

        List<String> messages = new ArrayList<>();

        try {

            String sessionid = loginClient.login();
            String sUpdate = "";
            log.info("sessionid : " + sessionid);

            log.info("Productos processing ...");

            // EXAMPLE INIT
//            ObjectFactory factory = new ObjectFactory();
//
//            TECActualizarProductoRequestCls producto = factory.createTECActualizarProductoRequestCls();
//            producto.setAbreviatura(factory.createTECActualizarProductoRequestClsAbreviatura("A"));
//            producto.setCapacidad(factory.createTECActualizarProductoRequestClsCapacidad(12));
//            producto.setDescripcionCurso(factory.createTECActualizarProductoRequestClsDescripcionCurso("Desarrollo de PHP"));
//            producto.setDescripcionPeriodo(factory.createTECActualizarProductoRequestClsDescripcionPeriodo("2017-2"));
//            producto.setEstado(factory.createTECActualizarProductoRequestClsEstado("Pendiente"));
//            producto.setFamilia(factory.createTECActualizarProductoRequestClsFamilia("formación"));
//            producto.setFechaFin(factory.createTECActualizarProductoRequestClsFechaFin("11/12/2616"));
//            producto.setFechaInicio(factory.createTECActualizarProductoRequestClsFechaInicio("11/12/2616"));
//            producto.setHoras(factory.createTECActualizarProductoRequestClsHoras(3));
//            producto.setIdTecsupArea(factory.createTECActualizarProductoRequestClsIdTecsupArea("1"));
//            producto.setIdTecsupCurso(factory.createTECActualizarProductoRequestClsIdTecsupCurso("158753"));
//            producto.setIdTecsupPeriodo(factory.createTECActualizarProductoRequestClsIdTecsupPeriodo("183"));
//            producto.setNombreCurso(factory.createTECActualizarProductoRequestClsNombreCurso("PHP y MySQL 2"));
//            producto.setNombrePeriodo(factory.createTECActualizarProductoRequestClsNombrePeriodo("2017-2"));
//            producto.setSeccion(factory.createTECActualizarProductoRequestClsSeccion("01"));
//            producto.setTipo(factory.createTECActualizarProductoRequestClsTipo("Curso"));
            // EXAMPLE END

            List<TECActualizarProductoRequestCls> productos = crmService.productos();
            log.info(productos.size());

            for(TECActualizarProductoRequestCls producto : productos){
                try {
                    TECActualizarProductoResponseCls result = productoClient.sendProducto(sessionid, producto);

                    if (!result.getResultado().getValue())
                        throw new WebServiceException(result.getError(  ).getValue());

                    log.info("CODPROACTIVIDAD:" + producto.getSeccion().getValue());
                    log.info("PERIODO:" + producto.getIdTecsupPeriodo().getValue());
                    log.info("ID:" + result.getIdOfertaCurso().getValue().trim());

                    sUpdate = producto.getUpdate().replace("[ID_SALESFORCE]","'" + result.getIdOfertaCurso().getValue().trim() + "'");
                    crmService.checkProducto(sUpdate);

                    log.info("sendProducto success!");
                    messages.add("OK: [Periodo:" + producto.getIdTecsupPeriodo().getValue() + " - Curso:" + producto.getIdTecsupCurso().getValue() + "] Producto Actualizado!");

                } catch (Exception e) {
                    log.error(e, e);
                    messages.add("ERROR P: [Periodo:" + producto.getIdTecsupPeriodo().getValue() + " - Curso:" + producto.getIdTecsupCurso().getValue() + "] " + e.getMessage());
                }
            }

            log.info("Inscripciones processing ...");


        } catch (Exception e) {
            log.error(e, e);
            messages.add("ERROR CRITICAL: " + e.getMessage());
        }

        try {
            crmService.saveLogs(messages);
        } catch (Exception e) {
            log.error(e, e);
        }

    }

    @Scheduled(cron="0 0 9,11,13,15,17,19,21 * * *")
    public void runInscritos() throws Exception{
        log.info("run");

        List<String> messages = new ArrayList<>();

        try {

            String sessionid = loginClient.login();
            String sUpdate = "";
            log.info("sessionid : " + sessionid);

            log.info("Inscripciones processing ...");

            List<ObjRequest> inscripciones = crmService.inscripciones();
            log.info(inscripciones.size());

            for(ObjRequest inscripcion : inscripciones){
                try {
                    ObjResponse result = inscripcionClient.sendInscripcion(sessionid, inscripcion);

                    if (!result.getBlnResultado().getValue())
                        throw new WebServiceException(result.getStrMensajeError().getValue());

                    sUpdate = inscripcion.getUpdate();
                    if(sUpdate!=null && !("".equals(sUpdate)))
                        crmService.checkProducto(sUpdate);

                    log.info("sendInscripcion success!");
                    messages.add("OK: [Curso:" + inscripcion.getStrIdCursoTecsup().getValue() + " - Termino:" + inscripcion.getStrIdTerminoTecsup().getValue() + " - NumeroDoc:" + inscripcion.getStrNumeroDocContacto().getValue() + "] Inscripcion Actualizado!");

                } catch (Exception e) {
                    log.error(e, e);
                    messages.add("ERROR I: [Curso:" + inscripcion.getStrIdCursoTecsup().getValue() + " - Termino" + inscripcion.getStrIdTerminoTecsup().getValue() + " - NumeroDoc:" + inscripcion.getStrNumeroDocContacto().getValue() + "] " + e.getMessage());
                }
            }

            messages.add("OK FINISH PROCESS");

        } catch (Exception e) {
            log.error(e, e);
            messages.add("ERROR CRITICAL: " + e.getMessage());
        }

        try {
            crmService.saveLogs(messages);
        } catch (Exception e) {
            log.error(e, e);
        }

    }

    @Scheduled(cron="0 0 8,10,12,14,16,18,20 * * *")
    public void runContactos() throws Exception{
        log.info("runContactos");

        List<String> messages = new ArrayList<>();
        try{
            String sessionid = loginClient.login();
            String sUpdate = "";
            log.info("sessionid : " + sessionid);

            log.info("Contacts processing ...");

            List<ObjRequest4> contactos = crmService.contactos();
            log.info(contactos.size());

            for(ObjRequest4 contacto:contactos){
                try{
                    ObjResponse4 result = contactoClient.sendContacto(sessionid,contacto);

                    if (!result.getBlnResultado().getValue())
                        throw new WebServiceException(result.getStrMensajeError().getValue());

                    crmService.checkContacto(result.getStrIdContacto().getValue(),contacto.getStrCodPersona().getValue().toString());

                    log.info("sendContacto success!");
                    messages.add("OK: [Contacto:" + contacto.getStrLastName().getValue() + " - NumDoc:" + contacto.getStrNumDocumento().getValue() + "] Contacto creado!");

                }catch (Exception e) {
                    log.error(e, e);
                    messages.add("ERROR C: [Contacto:" + contacto.getStrLastName().getValue() + " - NumDoc" + contacto.getStrNumDocumento().getValue() + "] " + e.getMessage());
                }
            }

            messages.add("OK FINISH PROCESS");

        }catch (Exception e) {
            log.error(e, e);
            messages.add("ERROR CRITICAL: " + e.getMessage());
        }

        try {
            crmService.saveLogs(messages);
        } catch (Exception e) {
            log.error(e, e);
        }

    }
}
