package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.bean.Employee;


@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;	
	
	public int addNewEmployee(Employee employee) {
		try {
			return jdbcTemplate.update("insert into employee values(?,?,?)",
					employee.geteID(),employee.getfName(),employee.getlName(),employee.getDepartment(),employee.getActiveStatus());
			} catch (Exception e) {
			System.err.println(e.toString());
			return 0;
			}
	}
	
	public List<Map<String,Object>> retrieveEmployeeAsMap() {
			try {
	return jdbcTemplate.queryForList("select * from employee"); //display ONLY returns MAP Object.
			} catch (Exception e) {
				System.err.println(e.toString());
				return null;
			}
		}
	class MyRowMapper implements RowMapper<Employee>{
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.seteID(rs.getInt(1));
			emp.setfName(rs.getString(2));
			emp.setlName(rs.getString(3));
			emp.setDepartment(rs.getString(4));
			emp.setActiveStatus(rs.getInt(5));
			return emp;
		}
	}
}
