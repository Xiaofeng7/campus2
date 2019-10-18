package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Cathedra;

public class CathedraDao extends HibernateDaoSupport implements CathedraInterfaceDao {

	@Override
	public ArrayList<Cathedra> getAllCathedra() {
		@SuppressWarnings("unchecked")
		ArrayList<Cathedra> list = (ArrayList<Cathedra>) this.getHibernateTemplate().find("from Cathedra");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setCathedra(Cathedra cathedra) {
		Integer id = (Integer) this.getHibernateTemplate().save(cathedra);
		return id;
	}

	@Override
	public Cathedra getCathedra(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Cathedra> list = (ArrayList<Cathedra>) this.getHibernateTemplate().find("from Cathedra where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里