package pe.edu.tecsup.crm.services;

import com.sforce.soap2.TECActualizarProductoRequestCls;
import com.sforce.soap3.ObjRequest;
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

	public List<ObjRequest> inscripciones() throws Exception {
		log.info("calling inscripciones");
		return crmRepository.inscripciones();
	}

    public void saveLogs(List<String> messages) {
        log.info("calling saveLogs");
        crmRepository.saveLogs(messages);
    }

}
