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

import fr.adaming.model.Login;
import fr.adaming.model.User;
import fr.adaming.services.IUserService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {
@Autowired
IUserService userService;
	
@GetMapping("/all")
public List<User> getAll(){
	return userService.getAll();
}
@GetMapping("/get/{idUser}")
public User getbyId(@PathVariable long idUser) {
	return userService.getUser(idUser);
}

@PostMapping ("/creat")
public User creatUser (@RequestBody User user) {
	return userService.creatUser(user);
}
@DeleteMapping ("/delete/{idUser}")
public int deleteUser (@PathVariable long idUser) {
	return userService.deleteUser(idUser);
}

@PutMapping ("/update/{idUser}")
public User updateUser (@PathVariable long idUser, @RequestBody User user) {
	User u1 = userService.getUser(idUser);
	u1.setNom(user.getNom());
	u1.setPrenom(user.getPrenom());
	u1.setPseudo(user.getPseudo());
	u1.setPassword(user.getPassword());
	u1.setRole(user.getRole());
	return userService.updateUser(u1);
}
@PostMapping ("/login")
public User login (@RequestBody Login log) {
	return userService.login(log.getPseudo(), log.getPassword());
}


}
