package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Compte;


public interface ICompteRepository extends JpaRepository<Compte, Long> {

}
