package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.school.domain.SchoolInfo;
import com.school.services.DataService;

@Controller
public class DataController {
	
	@Autowired
	DataService dataService;

	@RequestMapping("form")
	public ModelAndView getForm(@ModelAttribute SchoolInfo schoolInfo) {
		return new ModelAndView("form");
	}
	
	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute SchoolInfo schoolInfo) {
		dataService.insertRow(schoolInfo);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("list")
	public ModelAndView getList() {
		List schoolList = dataService.getList();
		return new ModelAndView("list","schoolList",schoolList);
	}
	
	@RequestMapping("details")
	public ModelAndView detail(@RequestParam int id,@ModelAttribute SchoolInfo schoolInfo) {
		SchoolInfo schoolObject = dataService.getRowById(id);
		return new ModelAndView("details","schoolObject",schoolObject);
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.deleteRow(id);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("edit")
	public ModelAndView editUser(@RequestParam int id,@ModelAttribute SchoolInfo schoolInfo) {
		SchoolInfo schoolObject = dataService.getRowById(id);
		return new ModelAndView("edit","schoolObject",schoolObject);
	}
	
	@RequestMapping("update")
	public ModelAndView updateUser(@RequestParam int id, @ModelAttribute SchoolInfo schoolInfo) {
			dataService.updateRow(schoolInfo);			
		return new ModelAndView("redirect:details?id="+id);
	}

}
