package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Notification;
import com.gkk.dao.NotificationInterfaceDao;

public class NotificationService implements NotificationInterface {

	private NotificationInterfaceDao notificationInterfaceDao;
	private Notification notification;
	@Override
	public void getAllNotification() {
		// TODO Auto-generated method stub
		ArrayList<Notification> list = notificationInterfaceDao.getAllNotification();
		if (list!=null) {
			if (list.size()>0) {
				HttpSession httpSession = ServletActionContext.getRequest().getSession();
				httpSession.setAttribute("notificationList", list);
			}
		}
	}

	@Override
	public Integer setNotification(String name, String content, int countId,String accessory, Timestamp time) {
		System.out.println(name+"....."+content+time+"....."+countId);
		notification = new Notification();
		notification.setContent(content);
		notification.setCountId(countId);
		notification.setTime(time);
		notification.setName(name);
		notification.setAccessory(accessory);
		return notificationInterfaceDao.setNotification(notification);
	}

	@Override
	public void getNotification(Integer id) {
		
		Notification getNotification = notificationInterfaceDao.getNotification(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getNotification", getNotification);
	}

	public NotificationInterfaceDao getNotificationInterfaceDao() {
		return notificationInterfaceDao;
	}

	public void setNotificationInterfaceDao(NotificationInterfaceDao notificationInterfaceDao) {
		this.notificationInterfaceDao = notificationInterfaceDao;
	}

}
