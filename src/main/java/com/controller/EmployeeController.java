package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.DepartmentBean;
import com.bean.EmployeeBean;
import com.dao.DepartmentDao;
import com.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	DepartmentDao departmentDao;

	@Autowired

	EmployeeDao employeDao;

	@GetMapping("/empform")
	public String employeeForm(Model model) {

		EmployeeBean employeeBean = new EmployeeBean();
		List<DepartmentBean> departmentList = departmentDao.getAllDepartment();

		model.addAttribute("employeeBean", employeeBean);
		model.addAttribute("departmentList", departmentList);

		return "Addemployee";
	}

	@GetMapping("/login")
	public String loginForm(Model model) {

		EmployeeBean employeeBean = new EmployeeBean();
		model.addAttribute("employeeBean", employeeBean);

		return "loginForm";
	}

	@PostMapping("/loginEmployee")
	public String loginEmployee(@ModelAttribute EmployeeBean employeeBean, HttpSession session) {

		EmployeeBean employeeBea2 = employeDao.loginEmployee(employeeBean);
		System.out.println(employeeBea2);
		if (employeeBea2 != null) {

			session.setAttribute("logemp", employeeBea2);
		}
		return "/";
	}

}
