package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Notification;

public class NotificationDao extends HibernateDaoSupport implements NotificationInterfaceDao {

	@Override
	public ArrayList<Notification> getAllNotification() {
		@SuppressWarnings("unchecked")
		ArrayList<Notification> list = (ArrayList<Notification>) this.getHibernateTemplate().find("from Notification");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setNotification(Notification Notification) {
		Integer id = (Integer) this.getHibernateTemplate().save(Notification);
		return id;
	}

	@Override
	public Notification getNotification(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Notification> list = (ArrayList<Notification>) this.getHibernateTemplate().find("from Notification where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里