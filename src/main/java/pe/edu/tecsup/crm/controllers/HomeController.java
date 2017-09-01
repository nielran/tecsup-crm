package pe.edu.tecsup.crm.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.crm.schedules.SynchronizationCrmSchedule;
import pe.edu.tecsup.crm.services.CrmService;

@Controller
public class HomeController {

	private static final Logger log = Logger.getLogger(HomeController.class);

    @Autowired
    private CrmService crmService;

	@GetMapping("/")
	public String index(Model model) throws Exception {
		log.info("calling index");

		return "index";
	}

	@Autowired
    private SynchronizationCrmSchedule synchronizationCrmSchedule;

    @GetMapping("/test")
    public String test() throws Exception {
        log.info("calling test");

        synchronizationCrmSchedule.run();

        return "index";
    }

    @GetMapping("/test2")
    public String test2() throws Exception {
        log.info("calling test2");

        synchronizationCrmSchedule.runInscritos();

        return "index";
    }
}
