package sc95.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import sc95.springboot.model.Students;

public interface StudentsDao extends CrudRepository<Students, Integer> {

}
