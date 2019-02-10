package com.surbhi.mpt.service;

import java.util.List;

import com.surbhi.mpt.bean.Account;
import com.surbhi.mpt.bean.Options;
import com.surbhi.mpt.dao.AccountDao;
import com.surbhi.mpt.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
private AccountDao daoRef = new AccountDaoImpl();

@Override
public List <Account> findAll() {
	List<Account> accounts = daoRef.findAll();
	return accounts; 
}

@Override
public List<Account> sortAccountDetails(Options option) {
	return daoRef.sortAccountDetails(option);
}

@Override
public boolean create(Account newAccount) {
	return daoRef.create(newAccount);
}

@Override
public boolean delete(int id) {
	return daoRef.delete(id);
}

@Override
public boolean update(int id, Account account) {
	return daoRef.update(id, account);
}

@Override
public Account findById(int id) {
	return daoRef.findById(id);
}
	
	
	
}
