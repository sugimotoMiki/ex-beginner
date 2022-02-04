package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Conttoller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		
		return "exam02";
	}
	
	@RequestMapping("/result")
	public String result(Integer num1, Integer num2, Model model) {
		Integer answer = num1 + num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		return "exam02-result";
	}
	
	@RequestMapping("/result2")
	public String result2() {
		return "exam02-result2";
	}
}
