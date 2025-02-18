package ibm.pracpro.service;

import java.util.List;

import ibm.pracpro.model.Employee;

public interface EmployeeService {
	List<Employee> selectAll();

	int save(Employee e);

	int delete(String id);

	int update(Employee e);

	Employee getEmployeeById(String id);

	List<Employee> selectNameLike(String name);
	
	List<Employee> initSelect(int pageNum);
}
