package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Competition;

public class CompetitionDao extends HibernateDaoSupport implements CompetitionInterfaceDao {

	@Override
	public ArrayList<Competition> getAllCompetition() {
		@SuppressWarnings("unchecked")
		ArrayList<Competition> list = (ArrayList<Competition>) this.getHibernateTemplate().find("from Competition");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setCompetition(Competition Competition) {
		Integer id = (Integer) this.getHibernateTemplate().save(Competition);
		return id;
	}

	@Override
	public Competition getCompetition(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Competition> list = (ArrayList<Competition>) this.getHibernateTemplate().find("from Competition where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里