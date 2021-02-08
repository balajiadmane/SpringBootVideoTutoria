package com.EmployeeDataAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeDataAPI.Modal.APIResponse;
import com.EmployeeDataAPI.Modal.Employee;
import com.EmployeeDataAPI.Repository.EmployeeRepository;

@RestController
@CrossOrigin("*")
public class EmployeeController {

	
	@Autowired
	private EmployeeRepository empRepository;
	
	@GetMapping("/helloWord")
	public String helloWord() {
		return "hello world";
	}
	
	@PostMapping("/saveEmployee")
	public APIResponse saveEmployee(@RequestBody Employee emp) {
		
		APIResponse response;
		try {
			this.empRepository.save(emp);
			response = new APIResponse("Employee save successfully.",true);
		}catch(Exception e) {
			response = new APIResponse("Employee not saved.",false);
		}
		return response;
	}
	
	@GetMapping("/employeeList")
	public Iterable<Employee> getAllEmployee() {
		return this.empRepository.findAll();
	}
	
}
