package com.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.Entity.Student;
import com.demo.Service.EmailService;
import com.demo.Service.service;
import com.demo.dto.Studentdto;




@Controller
public class Student_Controller 

{ 	@Autowired
	service ser;

@Autowired
EmailService es;

	
	@RequestMapping("/view")
	
	public String view()
	{
		return "loginPage";
	}
	
	
//	@RequestMapping("/login")
//	public String storeInput( Student s1,@RequestParam("email") String email,ModelMap model)
//	{
//		ser.saveData(s1);
//		es.sendEmail(email, "TCS Offer Letter", "Dear Aryan !! you are selected");
//		model.addAttribute("x","data saved!");
//		
//		<%--Email:<input type="text" name="email">  (use this when using email service) --%>
//		return "loginPage" ;
//	}
	
	@RequestMapping("/login")
	public String insertData(Student s1, ModelMap model)
	
	{
		ser.saveData(s1);
		model.addAttribute("x","THE DATA IS STORED (Click on th elink to view)");
		return "loginPage";
		
	}
			
	
	
	@RequestMapping("/show")
	public String ShowData(ModelMap model)
	{
		
		List<Student> res = ser.displayData();
		model.addAttribute("res", res);
		
		return "showlist";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("id") int id, ModelMap model)
	{
		ser.deleteData(id);

		List<Student> res = ser.displayData();
		model.addAttribute("res", res);
		
		return "showlist";
	}
		
	
	
	
	@RequestMapping("/update")
	public String getData(@RequestParam("id") int id, ModelMap model)
	{
		Student res = ser.getDataById(id);
		 model.addAttribute("r",res);
		 return "udpatelist";
	}
	
	@RequestMapping("/updateReg")
	
	public String updateDTO(Studentdto dto,ModelMap model)
	{
		Student s1=new Student();
		
		s1.setId(dto.getId());
		s1.setUsername(dto.getUsername());
		s1.setPassword(dto.getPassword());
		ser.saveData(s1);
		List<Student> res = ser.displayData();
		model.addAttribute("res", res);
		
		return "showlist";
	}
	
	
	
	
	
	
		
	// http://localhost:8080/view
		
		
		
		
	
}



