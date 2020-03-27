package fr.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import fr.adaming.model.User;
import fr.adaming.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	@Autowired
	BCryptPasswordEncoder cryptageService;
	
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public List<User> getAll() {
		try {
			return userRepository.findAll();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public User creatUser(User user) {
		try {
			if(userRepository.getByPseudo(user.getPseudo()) == null) {
			user.setPassword(cryptageService.encode(user.getPassword()));
			}
			return userRepository.save(user);
			
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public int deleteUser(long idUser) {
		try {
		userRepository.deleteById(idUser);
			return 1;
		}catch (Exception e) {
			return 0;
		}
	}

	@Override
	public User getUser(long idUser) {
		try {
			Optional<User> op = userRepository.findById(idUser);
			User user =new User();
			if (op.isPresent()) {
				user = op.get();
			}
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public User updateUser(User user) {
		try {
			user.setPassword(cryptageService.encode(user.getPassword()));
			return userRepository.save(user);
		}catch (Exception e) {
			return null;
		}
	}
	
	public User login(String pseudo, String password) {
		User user = new User();
		user =this.getByPseudo(pseudo);
		if (user != null) {
		if (cryptageService.matches(password, user.getPassword())) {
			return user;
		}}
		return null;
		
	}

	@Override
	public User getByPseudo(String pseudo) {
		try {
			return userRepository.getByPseudo(pseudo);
	}catch (Exception e ) {
		return null;
	}
}
}



