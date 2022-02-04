package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.User.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {

	@ModelAttribute
    public UserForm setUpUserForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		
		return "exam04";
	}
	
	@RequestMapping("/result")
	public String result(@Validated UserForm userForm, BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			return index();
		}
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		redirectAttributes.addFlashAttribute("user", user);
		return "redirect:/exam04/result2";
	}
	
	@RequestMapping("result2")
	public String result2() {
		
		return "exam04-result";
	}
}
