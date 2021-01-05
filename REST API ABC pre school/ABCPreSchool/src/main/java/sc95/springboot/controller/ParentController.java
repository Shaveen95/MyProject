package sc95.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sc95.springboot.dao.ParentDao;
import sc95.springboot.model.Parents;


@RestController
@RequestMapping("/parents")
public class ParentController { 
	
	@Autowired
	private ParentDao pDao;
	

	//Add new parents
	@PostMapping("/addParents")
	public String addPrents(@RequestBody List<Parents> parents) {
		pDao.saveAll(parents);
		return "No. of New Parents added : "+parents.size();
	}
	
	//Show parents details
	@GetMapping("/getAllParents")
	public List<Parents> getParents(){
		return (List<Parents>) pDao.findAll();
	}
	
	//Show Specific parent's details
	@GetMapping("/getParent/{idd}")
	public Optional<Parents> getParent(@PathVariable int id ){
		return pDao.findById(id);
	}
	
	//Updating existing parent details
	@RequestMapping(method = RequestMethod.PUT, value = "/updateParent/{id}")	
	public String updateParent(@RequestBody Parents parent, @PathVariable int id) {
		pDao.save(parent);
		return "Parent details updated : "+parent.getName();
	}
	
	//Delete a parent
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteParent/{id}")	
	public String deleteParent(@RequestBody Parents parent, @PathVariable int id) {
		pDao.deleteById(id);
		return "One Parent's details deleted.";
	}

}
