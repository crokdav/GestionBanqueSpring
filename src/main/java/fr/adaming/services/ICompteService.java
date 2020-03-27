package fr.adaming.services;

import java.util.List;

import fr.adaming.model.Compte;

public interface ICompteService {

	public List<Compte> getAll();
	public Compte creatCompte(Compte compte);
	public int deleteCompte (long idCompte);
	public Compte getCompte (long idCompte);
	public Compte updateCompte (Compte compte);
	public int updateSolde (long ide, long idr, double montant);
}
