package com.dbbankofsimba.dbbankofsimba.Services;

import com.dbbankofsimba.dbbankofsimba.Repositories.AccountRepo;
import com.dbbankofsimba.dbbankofsimba.Models.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankaccountService {


  AccountRepo accountRepo;

  @Autowired
  public BankaccountService(AccountRepo accountRepo) {
    this.accountRepo = accountRepo;
  }

  public AccountRepo getAccountRepo() {

    return accountRepo;
  }

  public void setAccountRepo(AccountRepo accountRepo) {

    this.accountRepo = accountRepo;
  }

  public List<BankAccount> getAllAccount(){

    return accountRepo.findAll();
  }

  public void createAcc(String name, String animalType, Long balance){

    accountRepo.save(new BankAccount(balance, name, animalType));

  }
}

