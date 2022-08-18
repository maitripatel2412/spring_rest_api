package in.example.springrestapi.service;

import java.util.List;
import in.example.springrestapi.model.Employee;

public interface EmployeeService {
	
	
	
	List<Employee> getEmployees(int pageNumber,int pageSize);
	
	Employee saveEmployee(Employee employee);
	
	Employee getSingleEmployee(Long id);
	
	void deleteEmployee(Long id);
	
	Employee updateEmployee(Employee employee);
//	
//	List<Employee> getEmployeesbyName(String name);
//	
//	List<Employee> getEmployeeByNameAndLocation(String name,String location);
//	
//	List<Employee> getEmployeeByKeyword(String name);
//	
	List<Employee> getAllEmployees();
//	
//	//List<Employee> getEmployeesByNameOrLocation(String name,String location);
//	
//	Integer deleteEmployeeByName(String name);
}
