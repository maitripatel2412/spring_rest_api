package in.example.springrestapi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import in.example.springrestapi.request.EmployeeRequest;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
//@NamedNativeQuery(name="getAllRecords",query="select * from tbl_employee",resultClass = Employee.class)
@NamedQuery(name="Employee.getAllRecords",query="FROM Employee")
@Table(name = "tbl_employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@NotEmpty(message = "id should not be null")
	private Long id;
	
//	@NotBlank(message = "name should not be null")
	private String name;
	
//	@JoinColumn(name="department_id")
//	@OneToOne
//	private Department department;
	
//	@OneToMany(mappedBy="employee")
//	private List<Department> department;
//	
//	public Employee(EmployeeRequest req) {
//		this.name=req.getName();
//	}
	
//	private Long age=0L;
//	
//	@NotEmpty(message = "location should not be null")
	private String location;
//	
//	@Email(message = "email should not be null")
//	private String email;
//	
//	@NotBlank(message = "department should not be null")
//	private String department;
//	
//	@CreationTimestamp
//	@Column(name = "created_at",nullable = false, updatable = false)
//	private Date createdAt;
//	
//	@UpdateTimestamp
//	@Column(name = "updated_at")
//	private Date updatedAt;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public Long getAge() {
//		return age;
//	}
//
//	public void setAge(Long age) {
//		this.age = age;
//	}
//
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}

//	public Department getDepartments(Department department) {
//		return department=department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = (List<Department>) department;
//	}
//
//	public Department[] getDepartments() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}
