package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Competition;
import com.gkk.dao.CompetitionInterfaceDao;

public class CompetitionService implements CompetitionInterface {

	private CompetitionInterfaceDao competitionInterfaceDao;
	private Competition competition;
	@Override
	public void getAllCompetition() {
		// TODO Auto-generated method stub
		ArrayList<Competition> list = competitionInterfaceDao.getAllCompetition();
		if (list != null) {
			if (list.size()>0) {
				HttpSession httpSession = ServletActionContext.getRequest().getSession();
				httpSession.setAttribute("competitionList", list);
			}
		}
	}

	@Override
	public Integer setCompetition(String name, String content, int countId,String accessory, Timestamp time) {
		System.out.println(name+"....."+content+time+"....."+countId);
		competition = new Competition();
		competition.setContent(content);
		competition.setCountId(countId);
		competition.setTime(time);
		competition.setName(name);
		competition.setAccessory(accessory);
		return competitionInterfaceDao.setCompetition(competition);
	}

	@Override
	public void getCompetition(Integer id) {
		
		Competition getCompetition = competitionInterfaceDao.getCompetition(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getCompetition", getCompetition);
	}

	public CompetitionInterfaceDao getCompetitionInterfaceDao() {
		return competitionInterfaceDao;
	}

	public void setCompetitionInterfaceDao(CompetitionInterfaceDao competitionInterfaceDao) {
		this.competitionInterfaceDao = competitionInterfaceDao;
	}

}
