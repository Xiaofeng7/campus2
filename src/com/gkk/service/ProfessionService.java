package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Academy;
import com.gkk.beans.Profession;
import com.gkk.dao.ProfessionInterfaceDao;

public class ProfessionService implements ProfessionInterface {

	private ProfessionInterfaceDao professionInterfaceDao;
	private Profession profession;
	@Override
	public ArrayList<Profession> getAllProfession() {
		// TODO Auto-generated method stub
		return professionInterfaceDao.getAllProfession();
	}

	@Override
	public Integer setProfession(String name, String content, int countId, Academy academy,Timestamp time) {
		System.out.println(name+"....."+content+time+"....."+countId);
		profession = new Profession();
		profession.setContent(content);
		profession.setCountId(countId);
		profession.setTime(time);
		profession.setName(name);
		profession.setAcademy(academy);
		return professionInterfaceDao.setProfession(profession);
	}

	@Override
	public void getProfession(Integer id) {
		
		Profession getProfession = professionInterfaceDao.getProfession(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getProfession", getProfession);
	}

	public ProfessionInterfaceDao getProfessionInterfaceDao() {
		return professionInterfaceDao;
	}

	public void setProfessionInterfaceDao(ProfessionInterfaceDao professionInterfaceDao) {
		this.professionInterfaceDao = professionInterfaceDao;
	}
	
}
