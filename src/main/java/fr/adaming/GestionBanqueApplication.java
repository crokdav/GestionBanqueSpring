package fr.adaming;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.adaming.services.ICompteService;
import fr.adaming.services.IOperationService;
import fr.adaming.services.IRoleService;
import fr.adaming.services.IUserService;


@SpringBootApplication
public class GestionBanqueApplication implements CommandLineRunner {
@Autowired
IRoleService roleService;
@Autowired
IUserService userService;
@Autowired
ICompteService compteService;
@Autowired
IOperationService operationService;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionBanqueApplication.class, args);
	}
	public void run(String... args) throws Exception {

		
		
		
	}
}