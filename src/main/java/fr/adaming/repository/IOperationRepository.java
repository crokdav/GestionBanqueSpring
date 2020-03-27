package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Operations;

public interface IOperationRepository extends JpaRepository<Operations, Long> {

}
