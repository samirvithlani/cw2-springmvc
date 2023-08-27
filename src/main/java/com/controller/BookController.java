package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.BookBean;
import com.dao.BookDao;

@Controller
public class BookController {

	@Autowired
	BookDao bookDao;

	@GetMapping("/bookform")
	// model spring container...
	public String bookForm(Model model) {
		BookBean bookBean = new BookBean();
		model.addAttribute("book", bookBean);
		return "bookform";
	}

	@PostMapping("/addbook")
	public String saveBook(@ModelAttribute("book") BookBean bookBean) {

		int res = bookDao.addBook(bookBean);
		if (res > 0) {
			System.out.println("book added..");
		} else {
			System.out.println("book not added...con");
		}
		return "redirect:booklist";
	}

	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("bId") int bId, Model model) {

		BookBean bookBean = bookDao.getBookById(bId);
		model.addAttribute("book", bookBean);

		return "updatebook";
	}

	@GetMapping("/booklist")
	public String getBooks(Model model) {

		List<BookBean> books = bookDao.getAllBooks();
		model.addAttribute("books", books);
		return "booklist";
	}

	@PostMapping("/updatebook")
	public String updateBook(@ModelAttribute("book") BookBean bookBean) {

		System.out.println(bookBean.getbId());
		int res = bookDao.updateBook(bookBean);
		return "redirect:booklist";

	}
}
