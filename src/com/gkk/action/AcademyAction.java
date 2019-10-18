package com.gkk.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Profession;
import com.gkk.service.AcademyInterface;
import com.opensymphony.xwork2.ActionSupport;

public class AcademyAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AcademyInterface academyService;
	private String name;
	private String content;
	private Integer aid;
	
	public String setAcademy() {
		
		//public Integer setAcademy(String name, int countId, Set<Profession> professionList,Timestamp time) {
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//×¢²áÊ±¼ä
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		Set<Profession> professionList = new HashSet<Profession>();
		Integer id = academyService.setAcademy(name,countId,professionList,time);
		academyService.getAcademy(id);
		return SUCCESS;
		
	}
	
	public String getAcademy() {
		
		academyService.getAcademy(aid);
		return SUCCESS;
		
	}

	public AcademyInterface getAcademyService() {
		return academyService;
	}

	public void setAcademyService(AcademyInterface academyService) {
		this.academyService = academyService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}
	
}
