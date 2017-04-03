package pe.edu.tecsup.crm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pe.edu.tecsup.crm.clients.LoginClient;

@SpringBootApplication
public class TecsupCrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(TecsupCrmApplication.class, args);
	}

}
