package fr.adaming.services;

import java.util.List;


import fr.adaming.model.Role;

public interface IRoleService {
	public List<Role> getAll();
	public Role creatRole(Role role);
	public int deleteRole (long id);
	public Role getRole (long id);
	public Role updateRole (Role role);
}
