package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.BookBean;

@Repository
public class BookDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addBook(BookBean bookBean) {

		return jdbcTemplate.update("insert into book(bname,bprice,bqty)values(?,?,?)", bookBean.getbName(),
				bookBean.getbPrice(), bookBean.getbQty());
	}

	public class BookMapper implements RowMapper<BookBean> {

		@Override
		public BookBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			BookBean bookBean = new BookBean();
			bookBean.setbId(rs.getInt("bid"));
			bookBean.setbName(rs.getString("bname"));
			bookBean.setbPrice(rs.getInt("bprice"));
			bookBean.setbQty(rs.getInt("bqty"));
			return bookBean;
		}

	}

	public List<BookBean> getAllBooks() {

		return jdbcTemplate.query("select * from book", new BookMapper());
	}

	public BookBean getBookById(int bId) {

		return jdbcTemplate.queryForObject("select * from book where bid =?", new BookMapper(), bId);

	}

	public int updateBook(BookBean bean) {

		return jdbcTemplate.update("update book set bname = ?,bprice=?,bqty =? where bid = ?", bean.getbName(),
				bean.getbPrice(), bean.getbQty(), bean.getbId());
	}

}
