package in.example.springrestapi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import in.example.springrestapi.model.Employee;

@Repository
public class EmployeeDAOImpl {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Employee> getAll(){
		return manager.createNamedQuery("getAllRecords",Employee.class).getResultList();
	}

}
