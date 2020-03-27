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

import fr.adaming.model.Role;
import fr.adaming.services.IRoleService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("role")
public class RoleController {
@Autowired
IRoleService roleService;

@GetMapping("/all")
public List<Role> getAll(){
	return roleService.getAll();
}
@GetMapping("/get/{id}")
public Role getbyId(@PathVariable long id) {
	return roleService.getRole(id);
}

@PostMapping("/creat")
public Role creatRole (@RequestBody Role role) {
	return roleService.creatRole(role);
}
@DeleteMapping("/delete/{id}")
public int deleteRole (@PathVariable long id) {
	return roleService.deleteRole(id);
}
@PutMapping("/update/{id}")
public Role updateRole (@PathVariable long id, @RequestBody Role role) {
	Role ro = roleService.getRole(id);
	ro.setRole(role.getRole());
	return roleService.updateRole(ro);
}

	
}
