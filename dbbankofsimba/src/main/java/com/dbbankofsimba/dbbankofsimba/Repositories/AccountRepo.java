package com.dbbankofsimba.dbbankofsimba.Repositories;

import com.dbbankofsimba.dbbankofsimba.Models.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo  extends CrudRepository<BankAccount, Long> {

  List<BankAccount> findAll();

}
