package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.StudentService;;

@Controller
public class HomeController {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public String landingPage() {
		return "/views/index.jsp";
	}

	@RequestMapping("/register")
	public String registrationPage() {
		return "/views/register.jsp";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "/views/login.jsp";
	}

	@RequestMapping("/logincheck")
	public String logincheck(@RequestParam String username, @RequestParam String password, Model model) {
//		

		List<Student> sList = service.loginCheck(username, password);

		System.out.println(sList);

		if (!sList.isEmpty()) {
			
			model.addAttribute("data", sList);
			return "/views/success.jsp";
		} else {
			return "/views/login.jsp";
		}
	}

	@RequestMapping("/savestudent")
	public String savestudent(@ModelAttribute Student stu) {
		System.out.println("Student Contructor Called : " + stu);
		System.out.println(stu);
		service.saveStudent(stu);
		return "/views/register.jsp";
	}
}
