package in.example.springrestapi.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeRequest {
	
	private String name;
	
	private List<String> department;

	public String getName() {
		return name;
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	public void setName(String name) {
		this.name = name;
	}
}
