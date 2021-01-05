package sc95.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import sc95.springboot.model.Teachers;

public interface TeachersDao extends CrudRepository<Teachers, Integer> {
	
}
