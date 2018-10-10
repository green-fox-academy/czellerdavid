package com.practice.exampracticing.Repositories;

import com.practice.exampracticing.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodosRepo extends CrudRepository<Todo, Long> {

  List<Todo> findAll();
}
