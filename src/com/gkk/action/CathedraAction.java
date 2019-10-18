package com.gkk.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.service.CathedraInterface;
import com.opensymphony.xwork2.ActionSupport;

public class CathedraAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CathedraInterface cathedraService;
	private String name;
	private String content;
	private Integer cid;
	
	public String setCathedra() {
		
		
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//×¢²áÊ±¼ä
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		Integer id = cathedraService.setCathedra(name,content,countId,time);
		cathedraService.getCathedra(id);
		return SUCCESS;
		
	}
	
	public String getCathedra() {
		
		cathedraService.getCathedra(cid);
		return SUCCESS;
		
	}

	public CathedraInterface getCathedraService() {
		return cathedraService;
	}

	public void setCathedraService(CathedraInterface cathedraService) {
		this.cathedraService = cathedraService;
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
