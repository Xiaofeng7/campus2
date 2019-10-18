package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Club;
import com.gkk.dao.ClubInterfaceDao;

public class ClubService implements ClubInterface {

	private ClubInterfaceDao clubInterfaceDao;
	private Club club;
	@Override
	public ArrayList<Club> getAllClub() {
		ArrayList<Club> clubList = clubInterfaceDao.getAllClub();
		if (clubList!=null) {
			if (clubList.size()>0) {
				HttpSession httpSession = ServletActionContext.getRequest().getSession();
				httpSession.setAttribute("clubList", clubList);
			}
		}
		return null;
	}

	@Override
	public Integer setClub(String name, String content, int countId, Timestamp time) {
		System.out.println(name+"....."+content+time+"....."+countId);
		club = new Club();
		club.setContent(content);
		club.setCountId(countId);
		club.setTime(time);
		club.setName(name);
		return clubInterfaceDao.setClub(club);
	}

	@Override
	public void getClub(Integer id) {
		
		Club getClub = clubInterfaceDao.getClub(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getClub", getClub);
	}

	public ClubInterfaceDao getClubInterfaceDao() {
		return clubInterfaceDao;
	}

	public void setClubInterfaceDao(ClubInterfaceDao clubInterfaceDao) {
		this.clubInterfaceDao = clubInterfaceDao;
	}
	

}
