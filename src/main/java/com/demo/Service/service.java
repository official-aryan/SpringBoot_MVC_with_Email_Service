package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.Student;
import com.demo.Repository.StudentRepository;

@Service
public class service

{
	@Autowired
	StudentRepository sr;
	
	//TO DISPLAY ALL
	public List<Student> displayData()
	{
		List<Student> result = sr.findAll();
		return result;
	}

	//TO STORE DATA
	public void saveData(Student s1)
	{
		sr.save(s1);
	}
	
	//TO DELETE
	public void deleteData(int id)
	{
		sr.deleteById(id);
	}
	//TO UPDATE
	public Student getDataById(int id)
	{
		Student result=sr.findById(id).get();
		return result;
		
	}
}
