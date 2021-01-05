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
import sc95.springboot.dao.StudentsDao;
import sc95.springboot.model.Students;

@RestController
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentsDao sDao;
	
	//Add new students
	@PostMapping("/addStudents")
	public String addStudents(@RequestBody List<Students> students) {
		sDao.saveAll(students);
		return "New Students added : "+students.size();
	}
	
	//Show Student details
	@GetMapping("/getAllStudents")
	public List<Students> getStudents(){
		return (List<Students>) sDao.findAll();
	}
	
	//Show Specific Students details
	@GetMapping("/getStudent/{id}")
	public Optional<Students> getStudent(@PathVariable int id ){
		return sDao.findById(id);
	}
	
	//Updating existing student details
	@RequestMapping(method = RequestMethod.PUT, value = "/updateStudent/{id}")	
	public String updateStudent(@RequestBody Students students, @PathVariable int id) {
		sDao.save(students);
		return "Students details updated : "+students.getName();
	}
	
	//Delete a student
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteStudent/{id}")	
	public String deleteStudent(@RequestBody Students students, @PathVariable int id) {
		sDao.deleteById(id);
		return "One Students details deleted.";
	}
}
