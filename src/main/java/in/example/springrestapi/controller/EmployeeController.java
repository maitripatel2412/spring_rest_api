package in.example.springrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.example.springrestapi.dao.EmployeeDAOImpl;
import in.example.springrestapi.model.Department;
import in.example.springrestapi.model.Employee;
import in.example.springrestapi.repository.DepartmentRepository;
import in.example.springrestapi.repository.EmployeeRepository;
import in.example.springrestapi.request.EmployeeRequest;
import in.example.springrestapi.response.EmployeeResponse;
import in.example.springrestapi.service.EmployeeService;

@RestController
public class EmployeeController {

//	@Autowired
//	private EmployeeService eService;
	
	@Autowired
	private EmployeeDAOImpl eDAO;
	
	@Autowired
	private EmployeeRepository eRepo;
	
//	@Autowired
//	private DepartmentRepository dRepo;

//	@Value("${app.name:Employee Tracker}")
//	private String appName;
//	
//	@Value("${app.version:version1}")
//	private String appVersion;
//	
//	@GetMapping("/version")
//	public String getAppDetails() {
//		return appName+" - "+appVersion;
//	}

//	@GetMapping("/allemployyes") 
//	public ResponseEntity<List<Employee>> getAllEmployees() {
//		return new ResponseEntity<List<Employee>>(eService.getAllEmployees(), HttpStatus.OK);
//	}

//	@GetMapping("/employees")
//	public ResponseEntity<List<Employee>> getEmployees(@RequestParam Integer pageNumber,
//			@RequestParam Integer pageSize) {
//		return new ResponseEntity<List<Employee>>(eService.getEmployees(pageNumber, pageSize), HttpStatus.OK);
//	}
	
//	@GetMapping("/employees")
//	public ResponseEntity<List<EmployeeResponse>> getEmployees(){
//		List<Employee> list = eRepo.findAll();
//		List<EmployeeResponse> responseList = new ArrayList<>();
//		list.forEach(e -> {
//			EmployeeResponse eResponse = new EmployeeResponse();
//			eResponse.setId(e.getId());
//			eResponse.setEmployeeName(e.getName());
//			List<String> depts = new ArrayList<>();
//			for (Department d : e.getDepartments()) {
//				depts.add(d.getName());
//			}
//			eResponse.setDepartment(depts);
//			responseList.add(eResponse);
//		});
//		return new ResponseEntity<List<EmployeeResponse>>(responseList,HttpStatus.OK);
//	}

//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
//		return new ResponseEntity<Employee>(eService.getSingleEmployee(id), HttpStatus.OK);
//	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee() {
		//return eRepo.getEmployee();
		//return eDAO.getAll();
		return eRepo.getAllRecords();
	}

	@PostMapping("/employees")
	public Employee saveEmployee (@RequestBody Employee employee) {
		return eRepo.save(employee);
	}
//	public ResponseEntity<String> saveEmployee(@Valid @RequestBody EmployeeRequest eRequest) {
//		Department dept = new Department();
//		dept.setName(eRequest.getDepartment());
//		
//		dept = dRepo.save(dept);
//		
//		Employee employee = new Employee(eRequest);
//		employee.setDepartment(dept);
//		
//		employee = eRepo.save(employee);
//		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
		
		
//		Employee employee = new Employee(eRequest);
//		employee = eRepo.save(employee); 
//		
//		for(String s : eRequest.getDepartment()) {
//			Department d = new Department();
//			d.setName(s);
//			d.setEmployee(employee);
//		
//			dRepo.save(d);
//		}
//		return new ResponseEntity<String>("record save successfully", HttpStatus.CREATED);
//	}

//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
//		employee.setId(id);
//		return new ResponseEntity<Employee>(eService.updateEmployee(employee), HttpStatus.OK);
//	}
//
//	@DeleteMapping("/employees")
//	public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id) {
//		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
//	}
//
//	@GetMapping("/employees/filterByName")
//	public ResponseEntity<List<Employee>> getEmployeeByName(@RequestParam String name) {
//		return new ResponseEntity<List<Employee>>(eService.getEmployeesbyName(name), HttpStatus.OK);
//	}
//
//	@GetMapping("/employees/filterByNameAndLocation")
//	public ResponseEntity<List<Employee>> getEmployeeByNameAndLocation(@RequestParam String name,
//			@RequestParam String location) {
//		return new ResponseEntity<List<Employee>>(eService.getEmployeeByNameAndLocation(name, location), HttpStatus.OK);
//	}
//
//	@GetMapping("/employees/filterByKeyword")
//	public ResponseEntity<List<Employee>> getEmployeeByKeyword(@RequestParam String name) {
//		return new ResponseEntity<List<Employee>>(eService.getEmployeeByKeyword(name), HttpStatus.OK);
//	}
//	
//	@GetMapping("/employees/{name}/{location}")
//	public ResponseEntity<List<Employee>> getEmployeesByNameOrLocation(@PathVariable String name,@PathVariable String location) {
//		return new ResponseEntity<List<Employee>>(eService.getEmployeesByNameOrLocation(name,location), HttpStatus.OK);
//	}
//	
//	@DeleteMapping("/employees/delete/{name}")
//	public ResponseEntity<String> deleteEmployeeByName(@PathVariable String name) {
//		return new ResponseEntity<String>(eService.deleteEmployeeByName(name)+"no of records deleted",HttpStatus.OK);
//	}
	
//	@GetMapping("/employees/filter/{name}")
//	public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String name){
//		//return new ResponseEntity<List<Employee>>(eRepo.findByDepartmentName(name),HttpStatus.OK);
//		return new ResponseEntity<List<Employee>>(eRepo.getEmployeesByDeptname(name),HttpStatus.OK);
//	}

}
