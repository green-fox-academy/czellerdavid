package com.practice.exampracticing.Services;


import com.practice.exampracticing.Models.Todo;
import com.practice.exampracticing.Repositories.TodosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

  TodosRepo todosRepo;

  @Autowired
  public TodoService(TodosRepo todosRepo) {
    this.todosRepo = todosRepo;
  }


  public TodosRepo getTodosRepo() {
    return todosRepo;
  }

  public void setTodosRepo(TodosRepo todosRepo) {
    this.todosRepo = todosRepo;
  }

  public List<Todo> getAllTodos() {

    return todosRepo.findAll();
  }

  public Todo todoById(Long id) {

    return todosRepo.findById(id).orElse(null);
  }

  public void save(Todo todo) {

    todosRepo.save(todo);

  }

  public void deleteById(Long id) {

    todosRepo.deleteById(id);

  }

  public List<Todo> getUrgents() {


    //  Todo[] urgentTodos = todosRepo.findAll().stream().filter(x -> x.isUrgent()).toArray(Todo[]::new);


    //return Arrays.asList(urgentTodos);

    List<Todo> urgentTodos = todosRepo.findByUrgent(true);
    return  urgentTodos;

  }

}
