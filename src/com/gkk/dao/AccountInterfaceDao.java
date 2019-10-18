package com.gkk.dao;


import com.gkk.beans.AccountNumber;

public interface AccountInterfaceDao {

	AccountNumber login(String userName);
	Integer register(AccountNumber accountNumber);
}
