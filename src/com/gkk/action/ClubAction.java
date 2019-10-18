package com.gkk.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.service.ClubInterface;
import com.opensymphony.xwork2.ActionSupport;

public class ClubAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClubInterface clubService;
	private String name;
	private String content;
	private Integer cid;
	
	public String setClub() {
		
		
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//×¢²áÊ±¼ä
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		Integer id = clubService.setClub(name,content,countId,time);
		clubService.getClub(id);
		return SUCCESS;
		
	}
	
	public String getClub() {
		
		clubService.getClub(cid);
		return SUCCESS;
		
	}

	public ClubInterface getClubService() {
		return clubService;
	}

	public void setClubService(ClubInterface clubService) {
		this.clubService = clubService;
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

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
}
