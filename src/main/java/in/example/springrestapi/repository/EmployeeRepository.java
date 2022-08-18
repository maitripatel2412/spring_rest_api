package in.example.springrestapi.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.example.springrestapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	@Query(value = "select * from tbl_employee", nativeQuery = true)
//	List<Employee> getEmployee();
	
	List<Employee> getAllRecords();
	
//	List<Employee> findByName(String name);
//	
//    List<Employee> findByNameAndLocation(String name,String location);
//
//    List <Employee> findByNameContaining(String keyword,Sort sort);
//    
//    @Query("FROm * FROM Employee WHERE name=:name OR location=:location")
//    List<Employee> getEmployeesByNameAndLocation(String name,String location);
//    
//    @Transactional
//    @Modifying
//    @Query("DELETE FROM Employee WHERE name=:name")
//    Integer deleteEmployeeByName(String name);

//	List<Employee> findByDepartmentName(String name);
//	
//	@Query("FROM Employee WHERE department.name=:name")
//	List<Employee> getEmployeesByDeptname(String name);

}
