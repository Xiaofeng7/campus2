package com.gkk.service;

import java.sql.Timestamp;

public interface NotificationInterface {
	
	void getAllNotification();
	
	void getNotification(Integer id);

	Integer setNotification(String name, String content, int countId, String accessory,Timestamp time);
}
