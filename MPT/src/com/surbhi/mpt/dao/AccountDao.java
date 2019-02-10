package com.surbhi.mpt.dao;

import java.util.List;

import com.surbhi.mpt.bean.Account;
import com.surbhi.mpt.bean.Options;

public interface AccountDao {
public List<Account> findAll();
public List<Account> sortAccountDetails(Options option);
public boolean create(Account newAccount);
public boolean delete(int id);
public boolean update(int id,Account account);
public Account findById(int id);

}