package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Profession;

public class ProfessionDao extends HibernateDaoSupport implements ProfessionInterfaceDao {

	@Override
	public ArrayList<Profession> getAllProfession() {
		@SuppressWarnings("unchecked")
		ArrayList<Profession> list = (ArrayList<Profession>) this.getHibernateTemplate().find("from Profession");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setProfession(Profession profession) {
		Integer id = (Integer) this.getHibernateTemplate().save(profession);
		
		return id;
	}

	@Override
	public Profession getProfession(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Profession> list = (ArrayList<Profession>) this.getHibernateTemplate().find("from Profession where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里