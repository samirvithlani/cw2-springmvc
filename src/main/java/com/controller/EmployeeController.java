package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bean.DepartmentBean;
import com.bean.EmployeeBean;
import com.dao.DepartmentDao;

@Controller
public class EmployeeController {

	@Autowired

	DepartmentDao departmentDao;

	@GetMapping("/empform")
	public String employeeForm(Model model) {

		EmployeeBean employeeBean = new EmployeeBean();
		List<DepartmentBean> departmentList = departmentDao.getAllDepartment();

		model.addAttribute("employeeBean", employeeBean);
		model.addAttribute("departmentList", departmentList);

		return "Addemployee";
	}

}
