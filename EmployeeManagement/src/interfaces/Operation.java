package interfaces;

import java.util.List;

import models.Employee;

public interface Operation {
	public Boolean save(Employee emp);
	public Boolean saveAll(List<Employee> lstEmp);
	public Employee get(String name);
	public List<Employee> getAll();
}
