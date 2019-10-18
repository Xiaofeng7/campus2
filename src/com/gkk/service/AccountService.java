package com.gkk.service;

import java.sql.Date;
import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.AccountNumber;
import com.gkk.dao.AccountInterfaceDao;

public class AccountService implements AccountInterface {

	private AccountInterfaceDao accountDao;
	
	@Override
	public boolean login(String userName,String passWord) {
		AccountNumber accountNumber = accountDao.login(userName);
		if(accountNumber == null)return false;
		if(accountNumber.getPassWord().equals(passWord)) {
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("accountId", accountNumber.getId());
			session.setAttribute("userName", accountNumber.getUserName());
			return true;
		}
		return false;
	}
	public boolean register(String userName,
							String passWord,
							String nickName,
							Date birthday,
							String tel,
							String email,
							String address,
							String studentNumber,
							String university,
							String academy,
							String profession,
							Integer grade,
							Timestamp register) {
		AccountNumber accountNumber= new AccountNumber();
		accountNumber.setAcademy(academy);
		accountNumber.setAddress(address);
		accountNumber.setBirthday(birthday);
		accountNumber.setEmail(email);
		accountNumber.setGrade(grade);
		accountNumber.setNickName(nickName);
		accountNumber.setPassWord(passWord);
		accountNumber.setProfession(profession);
		accountNumber.setRegister(register);
		accountNumber.setStudentNumber(studentNumber);
		accountNumber.setTel(tel);
		accountNumber.setUniversity(university);
		accountNumber.setUserName(userName);
		if (accountDao.register(accountNumber)!=null) {
			return true;
		}
		return false;
	}
	public AccountInterfaceDao getAccountDao() {
		return accountDao;
	}
	public void setAccountDao(AccountInterfaceDao accountDao) {
		this.accountDao = accountDao;
	}
	

}
