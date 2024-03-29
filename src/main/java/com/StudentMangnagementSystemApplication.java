package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentMangnagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangnagementSystemApplication.class, args);
	}
    @Autowired
    private StudentRepository studentRepository;
    
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("suraj","chauhan","suraj1123@gmail.com");
//	    studentRepository.save(student1);
//	    
//	    Student student2 = new Student("ram","deshmukh","ram321@gmail.com");
//	    studentRepository.save(student2);
//	
//	    Student student3 = new Student("sham","deshmukh","sham321@gmail.com");
//	    studentRepository.save(student3);
	}

}
