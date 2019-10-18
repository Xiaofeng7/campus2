package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Tips;

public class TipsDao extends HibernateDaoSupport implements TipsInterfaceDao {

	@Override
	public ArrayList<Tips> getAllTips() {
		@SuppressWarnings("unchecked")
		ArrayList<Tips> list = (ArrayList<Tips>) this.getHibernateTemplate().find("from Tips");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setTips(Tips tips) {
		Integer id = (Integer) this.getHibernateTemplate().save(tips);
		
		return id;
	}

	@Override
	public Tips getTips(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Tips> list = (ArrayList<Tips>) this.getHibernateTemplate().find("from Tips where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里