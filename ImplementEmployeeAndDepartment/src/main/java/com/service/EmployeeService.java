package com.service;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

@Autowired
EmployeeDao employeeDao;
	//private EmployeeDao ed = new EmployeeDao(); This is replaced by the @Autowired employeeDao 2 line statement.
	
	public List<Map<String, Object>> getEmployeeAsMap() {
		return employeeDao.retrieveEmployeeAsMap();
	}
	public List<Employee> getAllEmployeeAsListOfEmployee() {
		List<Employee> listOfEmployees = employeeDao.getEmployee();
		Iterator<Employee> li = listOfEmployees.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			return li.Employee;
		}
	}
}
