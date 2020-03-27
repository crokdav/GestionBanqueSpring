package fr.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Role;
import fr.adaming.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService {

	@Autowired
	IRoleRepository roleRepository;
	
	@Override
	public List<Role> getAll() {
		try {
			return roleRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Role creatRole(Role role) {
		try {
			return roleRepository.save(role);
		}catch (Exception e) {
		return null;
	}
	}

	@Override
	public int deleteRole(long id) {
		try {
			roleRepository.deleteById(id);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	

	@Override
	public Role getRole(long id) {
		try {
			Optional<Role> op = roleRepository.findById(id);
			Role role =new Role();
			if (op.isPresent()) {
				role = op.get();
			}
			return role;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

}
