package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.DepartmentBean;

@Repository
public class DepartmentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private final class DepartmentMapper implements RowMapper<DepartmentBean> {

		@Override
		public DepartmentBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			DepartmentBean departmentBean = new DepartmentBean();
			departmentBean.setdId(rs.getInt("did"));
			departmentBean.setdName(rs.getString("dname"));
			return departmentBean;
		}

	}

	public List<DepartmentBean> getAllDepartment() {

		return jdbcTemplate.query("select * from department", new DepartmentMapper());
	}

}
