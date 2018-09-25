package com.greenfox.springsql;

import com.greenfox.springsql.Model.Todo;
import com.greenfox.springsql.Repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsqlApplication implements CommandLineRunner {


  private TodoRepo todoRepo;

	@Autowired
	public SpringsqlApplication(TodoRepo todoRepo) {
		this.todoRepo = todoRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringsqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

    todoRepo.save(new Todo("Start the day", true,false));
    todoRepo.save(new Todo("I have to learn Object Relational Mapping", false, true));
    todoRepo.save(new Todo("Finish with everything", false, false));
    todoRepo.save(new Todo("Go home", false, true));
    todoRepo.save(new Todo("Cry", false, true));
    todoRepo.save(new Todo("Repeat", false, false));

  }
}
