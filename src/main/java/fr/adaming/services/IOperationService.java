package fr.adaming.services;

import java.util.List;


import fr.adaming.model.Operations;

public interface IOperationService {
	public List<Operations> getAll();
	public Operations creatOpera(Operations operation);
	public Operations getOpera (long idOperation);

}
