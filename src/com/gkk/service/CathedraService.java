package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Cathedra;
import com.gkk.dao.CathedraInterfaceDao;

public class CathedraService implements CathedraInterface {

	private CathedraInterfaceDao cathedraInterfaceDao;
	private Cathedra cathedra;
	@Override
	public ArrayList<Cathedra> getAllCathedra() {
		ArrayList<Cathedra> cathedraList = cathedraInterfaceDao.getAllCathedra();
		if (cathedraList!=null) {
			if (cathedraList.size()>0) {
				HttpSession httpSession = ServletActionContext.getRequest().getSession();
				httpSession.setAttribute("cathedraList", cathedraList);
			}
		}
		return null;
	}

	@Override
	public Integer setCathedra(String name, String content, int countId, Timestamp time) {
		System.out.println(name+"....."+content+time+"....."+countId);
		cathedra = new Cathedra();
		cathedra.setContent(content);
		cathedra.setCountId(countId);
		cathedra.setTime(time);
		cathedra.setName(name);
		return cathedraInterfaceDao.setCathedra(cathedra);
	}

	@Override
	public void getCathedra(Integer id) {
		
		Cathedra getCathedra = cathedraInterfaceDao.getCathedra(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getCathedra", getCathedra);
	}

	public CathedraInterfaceDao getCathedraInterfaceDao() {
		return cathedraInterfaceDao;
	}

	public void setCathedraInterfaceDao(CathedraInterfaceDao cathedraInterfaceDao) {
		this.cathedraInterfaceDao = cathedraInterfaceDao;
	}
	

}
