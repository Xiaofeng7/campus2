package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Notification;

public interface NotificationInterfaceDao {

	ArrayList<Notification> getAllNotification();
	
	Integer setNotification(Notification notification);
	
	Notification getNotification(Integer id);
}
