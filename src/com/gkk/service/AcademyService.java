package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Academy;
import com.gkk.beans.Profession;
import com.gkk.dao.AcademyInterfaceDao;

public class AcademyService implements AcademyInterface {

	private AcademyInterfaceDao academyInterfaceDao;
	private Academy academy;
	@Override
	public ArrayList<Academy> getAllAcademy() {
		ArrayList<Academy> academyList = academyInterfaceDao.getAllAcademy();
		if (academyList!=null) {
			if (academyList.size()>0) {
				HttpSession httpSession = ServletActionContext.getRequest().getSession();
				httpSession.setAttribute("academyList", academyList);
			}
		}
		return null;
	}

	@Override
	public Integer setAcademy(String name, int countId, Set<Profession> professionList,Timestamp time) {
		academy = new Academy();
		academy.setCountId(countId);
		academy.setTime(time);
		academy.setName(name);
		academy.setProfessionList(professionList);
		return academyInterfaceDao.setAcademy(academy);
	}

	@Override
	public void getAcademy(Integer id) {
		
		Academy getAcademy = academyInterfaceDao.getAcademy(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getAcademy", getAcademy);
	}

	public AcademyInterfaceDao getAcademyInterfaceDao() {
		return academyInterfaceDao;
	}

	public void setAcademyInterfaceDao(AcademyInterfaceDao academyInterfaceDao) {
		this.academyInterfaceDao = academyInterfaceDao;
	}
	
}
