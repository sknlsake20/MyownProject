package com.src.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.src.dao.FileUploadDAO;
import com.src.entity.UploadFile;

@Controller
public class MyController {
	
	@Autowired
	private FileUploadDAO fileUploadDao;
	
	@RequestMapping("/")
	public String display()
	{
		return "display";
	}
	@RequestMapping("/login")
	public String display2()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String display3()
	{
		return "register";
	}
	

}
