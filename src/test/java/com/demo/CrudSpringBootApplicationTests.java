package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.Entity.Student;
import com.demo.Repository.StudentRepository;

@SpringBootTest
class CrudSpringBootApplicationTests {

	@Autowired
	StudentRepository studentRepo;
	
	@Test
	void saveData() 
	
	{

	Student s1 = new Student();
	s1.setId(10);
	s1.setUsername("Arkadeb");
	s1.setPassword("555");
	
	studentRepo.save(s1);
	}

}
