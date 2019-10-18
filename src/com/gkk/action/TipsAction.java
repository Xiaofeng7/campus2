package com.gkk.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.service.TipsInterface;
import com.opensymphony.xwork2.ActionSupport;

public class TipsAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TipsInterface tipsService;
	private String name;
	private String content;
	private Integer tid;
	
	public String setTips() {
		
		
		java.util.Date now = new java.util.Date();
		String timStringe = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		Timestamp time = Timestamp.valueOf(timStringe);//×¢²áÊ±¼ä
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		int countId = (int) httpSession.getAttribute("accountId");
		System.out.println(name+"....."+content+time+"....."+countId);
		Integer id = tipsService.setTips(name,content,countId,time);
		tipsService.getTips(id);
		return SUCCESS;
		
	}
	
	public String getTips() {
		
		tipsService.getTips(tid);
		return SUCCESS;
		
	}

	public TipsInterface getTipsService() {
		return tipsService;
	}

	public void setTipsService(TipsInterface tipsService) {
		this.tipsService = tipsService;
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

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}
	
}
