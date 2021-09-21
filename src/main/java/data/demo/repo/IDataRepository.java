package data.demo.repo;

import org.springframework.stereotype.Repository;

import data.demo.dto.MessageOuter;

@Repository
public interface IDataRepository {
	
	public MessageOuter getMessage(String status);

}
