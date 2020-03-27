package fr.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Compte;
import fr.adaming.repository.ICompteRepository;

@Service
public class CompteService implements ICompteService{

	@Autowired
	ICompteRepository compteRepository;
	
	@Override
	public List<Compte> getAll() {
		try {
			return compteRepository.findAll();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public Compte creatCompte(Compte compte) {
		try {
			return compteRepository.save(compte);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int deleteCompte(long idCompte) {
		try {
			compteRepository.deleteById(idCompte);
			return 1;
		}catch (Exception e) {
			return 0;
		}
	}

	@Override
	public Compte getCompte(long idCompte) {
		try {
			Optional<Compte> ope = compteRepository.findById(idCompte);
			Compte compte = new Compte();
			if (ope.isPresent()) {
				compte=ope.get();
			}
			return compte;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public Compte updateCompte(Compte compte) {
		try {
			return compteRepository.save(compte);
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public int updateSolde(long ide, long idr, double montant) {
		try {
			Optional<Compte> op1 = compteRepository.findById(ide);
			Optional<Compte> op2 = compteRepository.findById(idr);
			Compte compte1 = new Compte();
			Compte compte2 = new Compte();
			if (op1.isPresent() && op2.isPresent()) {
				compte1 = op1.get();
				compte2 = op2.get();
			
				compte1.setSolde(compte1.getSolde() - Math.abs(montant));
				compte2.setSolde(compte2.getSolde() + Math.abs(montant));
				return 1;
			} else {
				return 0;
			}
		}catch (Exception e) {
			e.printStackTrace();
		return 0;
	}
	}

}
