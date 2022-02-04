package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Exam03Form;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		
		return "exam03";
	}
	
	@RequestMapping("/result")
	public String result(Exam03Form exam03Form) {
		Integer answer = exam03Form.getPrice1() + exam03Form.getPrice2() + exam03Form.getPrice3();
		Integer answerTax = (int)(answer * 1.1);
		application.setAttribute("answer", answer);
		application.setAttribute("answerTax", answerTax);
		return "exam03-result";
	}
	
}
