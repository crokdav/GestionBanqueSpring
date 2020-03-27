package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Compte;
import fr.adaming.services.ICompteService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("compte")
public class CompteController {
@Autowired
ICompteService compteService;

@GetMapping("/all")
public List<Compte> getAll(){
	return compteService.getAll();
}
@GetMapping("/get/{idCompte}")
public Compte getbyId(@PathVariable long idCompte) {
	return compteService.getCompte(idCompte);
}

@PostMapping ("/creat")
public Compte creatCompte (@RequestBody Compte compte) {
	return compteService.creatCompte(compte);
}
@DeleteMapping ("/delete/{idCompte}")
public int deleteCompte (@PathVariable long idCompte) {
	return compteService.deleteCompte(idCompte);
}

@PutMapping ("/update/{idCompte}")
public Compte updateCompte (@PathVariable long idCompte, @RequestBody Compte compte) {
	Compte co = compteService.getCompte(idCompte);
	co.setNumero(compte.getNumero());
	co.setUtilisateur(compte.getUtilisateur());
	co.setConseille(compte.getConseille());
	return compteService.updateCompte(co);
}


}
