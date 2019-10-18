package com.gkk.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Academy;
import com.gkk.beans.Profession;
import com.gkk.service.AcademyInterface;
import com.gkk.service.ProfessionInterface;
import com.opensymphony.xwork2.ActionSupport;

public class ProfessionAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProfessionInterface professionService;
	private AcademyInterface academyService;
	private String name;
	private String content;
	private String academyId;
	
	public String setProfession() {
		
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//×¢²áÊ±¼ä
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		academyService.getAcademy(Integer.parseInt(academyId));
		Academy academy = (Academy) httpSession.getAttribute("getAcademy");
		Integer id = professionService.setProfession(name,content,countId,academy,time);
		professionService.getProfession(id);
		return SUCCESS;
		
	}
	
	public String getProfession() {
		
		
		return SUCCESS;
		
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

	public ProfessionInterface getProfessionService() {
		return professionService;
	}

	public void setProfessionService(ProfessionInterface professionService) {
		this.professionService = professionService;
	}

	public AcademyInterface getAcademyService() {
		return academyService;
	}

	public void setAcademyService(AcademyInterface academyService) {
		this.academyService = academyService;
	}

	public String getAcademyId() {
		return academyId;
	}

	public void setAcademyId(String academyId) {
		this.academyId = academyId;
	}
	
}
