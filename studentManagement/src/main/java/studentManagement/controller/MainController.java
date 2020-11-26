package studentManagement.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import studentManagement.model.SomeEntity;
import studentManagement.model.Student;

@Controller
public class MainController {
	@Autowired
	private List<Student> students;

	@GetMapping("/home")
	public String studentManagerPage(Model model) {
//		chuyen du lieu qua lai giua fe voi be
//		Model, java.util.Map ==> chuyen du lieu sang fe
//		@pathVariable, @requestParam ===> Nhan du lieu (parameter) tu view
		model.addAttribute("students", students);
		return "studentManager";// resolver noi prefix suffix
	}

	@GetMapping("/students") // id la mot bien @pathVariable
	public String getStudentDetail(@RequestParam String id, Model model) {
		int index = students.indexOf(new Student(id));
		Student student = students.get(index);
		model.addAttribute("student", student);
		return "studentDetail";
	}

	@GetMapping("/{studentId}/edit")
	public String editStudent(@PathVariable String studentId, Model model) {
		int index = students.indexOf(new Student(studentId));
		Student student = students.get(index);
		model.addAttribute("student", student);
		return "editStudent";
	}

	@PostMapping("/{studentId}/edit")
	public String editStudent(@PathVariable String studentId, @RequestParam String name, @RequestParam boolean male,
			@RequestParam String birthday, @RequestParam String placeOfBirth, @RequestParam String address) {
		Student student = new Student(studentId, name, male, new Date(System.currentTimeMillis()), placeOfBirth,
				address, "depName");
		int index = students.indexOf(new Student(studentId));
		students.set(index, student);
		return "redirect:/home";
	}
//	@GetMapping("/new-student")
//	public String newStudent(@ModelAttribute("entity") SomeEntity someEntity) {
//		return "newStudent";
//	}
//	@PostMapping
//	public String newSt() {
//		
//	}
}
