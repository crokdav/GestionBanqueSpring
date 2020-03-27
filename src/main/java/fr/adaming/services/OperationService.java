package fr.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.model.Operations;
import fr.adaming.repository.IOperationRepository;

@Service
public class OperationService implements IOperationService {

	@Autowired
	IOperationRepository operationRepository;

	@Override
	public List<Operations> getAll() {
		try {
			return operationRepository.findAll();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public Operations creatOpera(Operations operation) {
		try {
			return operationRepository.save(operation);
		}catch (Exception e) {
			return null;
		}
	}


	public Operations getOpera(long idOperation) {
		try {
		Optional<Operations> opo = operationRepository.findById(idOperation);
		Operations operation = new Operations();
		if (opo.isPresent()) {
			operation=opo.get();
		}
		return operation;
	}catch (Exception e) {
		return null;
	}
	} 



	
}
