package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Academy;

public class AcademyDao extends HibernateDaoSupport implements AcademyInterfaceDao {

	@Override
	public ArrayList<Academy> getAllAcademy() {
		@SuppressWarnings("unchecked")
		ArrayList<Academy> list = (ArrayList<Academy>) this.getHibernateTemplate().find("from Academy");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setAcademy(Academy academy) {
		Integer id = (Integer) this.getHibernateTemplate().save(academy);
		
		return id;
	}

	@Override
	public Academy getAcademy(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Academy> list = (ArrayList<Academy>) this.getHibernateTemplate().find("from Academy where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里