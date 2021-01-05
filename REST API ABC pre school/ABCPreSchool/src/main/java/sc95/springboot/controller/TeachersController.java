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

import sc95.springboot.dao.TeachersDao;
import sc95.springboot.model.Teachers;

@RestController
@RequestMapping("/teachers")
public class TeachersController {

	@Autowired
	private TeachersDao tDao;

	//Add new teachers
	@PostMapping("/addTeachers")
	public String addTeachers(@RequestBody List<Teachers> teachers) {
		tDao.saveAll(teachers);
		return "New Teachers added : " + teachers.size();
	}

	//Show Teachers details
	@GetMapping("/getAllTeachers")
	public List<Teachers> getTeachers() {
		return (List<Teachers>) tDao.findAll();
	}

	//Show Specific Teachers details
	@GetMapping("/getTeachers/{id}")
	public Optional<Teachers> getTeacher(@PathVariable int id) {
		return tDao.findById(id);
	}

	//Updating existing teacher details
	@RequestMapping(method = RequestMethod.PUT, value = "/updateTeacher/{id}")
	public String updateTeacher(@RequestBody Teachers teachers, @PathVariable int id) {
		tDao.save(teachers);
		return "Teachers details updated : " + teachers.getName();
	}

	//Delete a teacher
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteTeacher/{id}")
	public String deleteTeacher(@RequestBody Teachers teachers, @PathVariable int id) {
		tDao.deleteById(id);
		return "One Teacher details deleted.";
	}

}
