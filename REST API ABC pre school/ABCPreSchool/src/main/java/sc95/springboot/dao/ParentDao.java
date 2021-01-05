package sc95.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import sc95.springboot.model.Parents;

public interface ParentDao extends CrudRepository<Parents, Integer> {

}
