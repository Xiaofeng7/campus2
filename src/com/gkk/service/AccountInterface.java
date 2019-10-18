package com.gkk.service;

import java.sql.Date;
import java.sql.Timestamp;

public interface AccountInterface {

	boolean login(String userName,String passWord);
	boolean register(String userName,
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
			Timestamp register);
}
