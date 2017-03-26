package com.example.rest.DAO;

import com.example.rest.model.Employee;

import java.util.List;

/**
 * Created by gonzalo.gisbert on 26/03/17.
 */
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployee(long id);
    public List<Employee> getByLastName(String name);
    public List<Employee> getByTitle(String title);
    public List<Employee> getByDept(String dept);
    public boolean add(Employee employee);  // False equals fail
    public boolean update(long id, Employee employee); // False equals fail
    public boolean delete(long id); // False equals fail
}
