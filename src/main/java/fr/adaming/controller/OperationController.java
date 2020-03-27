package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Compte;
import fr.adaming.model.Operations;
import fr.adaming.services.ICompteService;
import fr.adaming.services.IOperationService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("operation")
public class OperationController {
@Autowired
IOperationService operationService;
@Autowired
ICompteService compteService;

@GetMapping("/all")
public List<Operations> getAll(){
	return operationService.getAll();
}
@GetMapping("/get/{idOperation}")
public Operations getbyId(@PathVariable long idOperation) {
	return operationService.getOpera(idOperation);
}

@PostMapping ("/creat")
public Operations creatOpera(@RequestBody Operations operation) {
	Compte emetteur = operation.getEmetteur();
	Compte recepteur = operation.getRecepteur();
	compteService.updateSolde(emetteur.getIdCompte(), recepteur.getIdCompte(), operation.getMontant());
	return operationService.creatOpera(operation);
		



}

}
