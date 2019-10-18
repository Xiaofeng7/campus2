package com.gkk.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.AccountNumber;

public class AccountDao extends HibernateDaoSupport implements AccountInterfaceDao {

	public AccountNumber login(String userName) {
		@SuppressWarnings("unchecked")
		List<AccountNumber> list = this.getHibernateTemplate().find("from AccountNumber where userName = ?",userName);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

	@Override
	public Integer register(AccountNumber accountNumber) {
		return (Integer)this.getHibernateTemplate().save(accountNumber);
	}

}
