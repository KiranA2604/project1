package com.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.crud.dto.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
   NamedParameterJdbcTemplate template;
   
   public void setTemplate(NamedParameterJdbcTemplate template)throws Exception
   {
	   this.template=template;
   }
	public List<Employee> getListOfEmployees() {
		String query = "select * from employee";
		List<Employee> list = template.query(query, getSqlParamsbyModel(null), EmployeeMapper());
		return null;
	}
	
	
	private SqlParameterSource getSqlParamsbyModel(Employee emp)
	{
		MapSqlParameterSource parametersource = new MapSqlParameterSource();
	
		
		if(emp!=null) 
		{
			parametersource.addValue("employeeid", emp.getEmployeeid());
			parametersource.addValue("firstname", emp.getFirstname());
			parametersource.addValue("lastname", emp.getLastname());
			parametersource.addValue("email", emp.getEmail());
		}
		return parametersource;
	}
	
	 private static final class EmployeeMapper implements RowMapper
	 {

		public Employee mapRow(ResultSet rs, int rowNum)throws SQLException
		{
			Employee employee = new Employee();
			employee.setEmployeeid(rs.getInt("employeeid"));
			employee.setFirstname(rs.getString("firstname"));
			employee.setLastname(rs.getString("lastname"));
			employee.setEmail(rs.getString("email"));
			return employee;
			
		}

		public int[] getRowsForPaths(TreePath[] path) {
			// TODO Auto-generated method stub
			return null;
		}
		
	 }
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(String firstname) {
		// TODO Auto-generated method stub
		
	}

	public Employee findEmployee(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

