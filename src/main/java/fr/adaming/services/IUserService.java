package fr.adaming.services;

import java.util.List;


import fr.adaming.model.User;

public interface IUserService {
	public List<User> getAll();
	public User creatUser(User user);
	public int deleteUser (long idUser);
	public User getUser (long idUser);
	public User updateUser (User user);
	public User getByPseudo(String pseudo);
	public User login (String login, String password);
}
  