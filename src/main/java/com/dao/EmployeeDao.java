package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addEmployee(EmployeeBean employeeBean) {

		return jdbcTemplate.update("insert into employee (ename,eemail,eage,did)values(?,?,?,?)");
	}

	private final static class EmployeeMapper implements RowMapper<EmployeeBean> {

		@Override
		public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			EmployeeBean employeeBean = new EmployeeBean();
			employeeBean.setdId(rs.getInt("eid"));
			employeeBean.seteEmail(rs.getString("ename"));
			employeeBean.seteAge(rs.getInt("eage"));
			employeeBean.seteName(rs.getString("ename"));
			employeeBean.setdId(rs.getInt("did"));
			employeeBean.setdName(rs.getString("dname"));
			return employeeBean;
		}

	}

	public List<EmployeeBean> getAllEmployees() {

		return jdbcTemplate.query("select * from employee natural join department", new EmployeeMapper());

	}

}
