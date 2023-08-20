package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.BookBean;

@Repository
public class BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addBook(BookBean bookBean) {
		
		return jdbcTemplate.update("insert into book(bname,bprice,bqty)values(?,?,?)",bookBean.getbName(),bookBean.getbPrice(),bookBean.getbQty());		
	}

}
