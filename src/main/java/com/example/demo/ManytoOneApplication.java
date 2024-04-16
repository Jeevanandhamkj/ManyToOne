package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repo.BookRepo;
import com.example.demo.Repo.StudentRepo;
import com.example.demo.model.Books;
import com.example.demo.model.Student;

@SpringBootApplication
public class ManytoOneApplication implements CommandLineRunner {
 @Autowired
	StudentRepo studentRepo;
  @Autowired
  BookRepo bookRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ManytoOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Books books=new Books();
		books.setId(1);
		books.setName("java");
		bookRepo.save(books);
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("jeeva");
		s1.setDept("MCA");
		s1.setBooks(books);
		studentRepo.save(s1);
		

		Student s2=new Student();
		s2.setId(1);
		s2.setName("jeeva");
		s2.setDept("MCA");
		s2.setBooks(books);
		studentRepo.save(s2);
		
	}

}
