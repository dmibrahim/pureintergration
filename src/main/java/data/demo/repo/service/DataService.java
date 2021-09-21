package data.demo.repo.service;

import org.springframework.stereotype.Service;

import data.demo.dto.MessageOuter;
import data.demo.repo.IDataRepository;

@Service
public class DataService implements IDataRepository {

	@Override
	public MessageOuter getMessage(String status) {
		MessageOuter message = new MessageOuter(status);
		return message;
	}

}
