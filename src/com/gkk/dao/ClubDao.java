package com.gkk.dao;

import java.util.ArrayList;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.gkk.beans.Club;

public class ClubDao extends HibernateDaoSupport implements ClubInterfaceDao {

	@Override
	public ArrayList<Club> getAllClub() {
		@SuppressWarnings("unchecked")
		ArrayList<Club> list = (ArrayList<Club>) this.getHibernateTemplate().find("from Club");
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list;
		}
		return null;
	}

	@Override
	public Integer setClub(Club club) {
		Integer id = (Integer) this.getHibernateTemplate().save(club);
		return id;
	}

	@Override
	public Club getClub(Integer id) {
		@SuppressWarnings("unchecked")
		ArrayList<Club> list = (ArrayList<Club>) this.getHibernateTemplate().find("from Club where id = ?",id);
		if(list.size()>0) {
			//System.out.println("................................"+list.get(0).getUserName()+"....Dao....OK!");
			 return list.get(0);
		}
		return null;
	}

}
//this.getHibernateTemplate().update(t);//保存到缓存里
//this.getHibernateTemplate().flush();//写入数据库里