package com.person2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.person2.model.Person2;
import com.person2.model.Person2DAOImpl;





@Controller
public class Person2Controller {
	@Autowired
	private Person2DAOImpl dao;
	
	@RequestMapping("person_insert.go")
	public String person_insert() {
		return "personForm";
	}
	
	@RequestMapping(value ="person_insert1.go", method=RequestMethod.POST) 
	public String person_insert(Person2 person) {
		dao.person_insert(person);
		return "redirect:person_list.go";
	}
	@RequestMapping("person_list.go")
	public String person_list(Model model) {
		System.out.println("hhhh");
	List<Person2> arr =	dao.person_list();
	System.out.println(arr.size());
	model.addAttribute("personlist",arr);
		return "personList";
	}
	
	@RequestMapping("person_view.go")
	public String person_view(String id, Model model) {
		Person2 person = dao.person_view(id);
		model.addAttribute("person",person);
		return "personView";
	}
}