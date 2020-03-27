package fr.adaming.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.User;



public interface IUserRepository extends JpaRepository<User, Long> {

public User getByPseudo (String pseudo);
}
