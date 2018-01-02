package pe.edu.tecsup.crm.services;

import com.sforce.soap2.TECActualizarProductoRequestCls;
import com.sforce.soap3.ObjRequest;
import com.sforce.soap4.ObjRequest4;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.crm.repositories.CrmRepository;

import java.util.List;

@Service
public class CrmService {

	private static Logger log = Logger.getLogger(CrmService.class);
	
	@Autowired
	private CrmRepository crmRepository;

	public List<TECActualizarProductoRequestCls> productos() throws Exception {
		log.info("calling productos");
		return crmRepository.productos();
	}

	public void checkProducto(String sql) throws Exception {
		log.info("calling checkProducto");
		crmRepository.checkProducto(sql);
	}

	public void checkContacto(String idContacto, String codSujeto) throws Exception {
		log.info("calling checkContacto");
		crmRepository.checkContacto(idContacto,codSujeto);
	}

	public List<ObjRequest> inscripciones() throws Exception {
		log.info("calling inscripciones");
		return crmRepository.inscripciones();
	}

	public List<ObjRequest4> contactos() throws Exception {
		log.info("calling contactos");
		return crmRepository.contactos();
	}

    public void saveLogs(List<String> messages) {
        log.info("calling saveLogs");
        crmRepository.saveLogs(messages);
    }

}
