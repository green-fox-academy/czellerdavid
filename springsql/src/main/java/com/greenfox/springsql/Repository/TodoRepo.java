package com.greenfox.springsql.Repository;

import com.greenfox.springsql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(boolean done);
  List<Todo> findAll();

}
