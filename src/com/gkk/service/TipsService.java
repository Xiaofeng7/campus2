package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gkk.beans.Tips;
import com.gkk.dao.TipsInterfaceDao;

public class TipsService implements TipsInterface {

	private TipsInterfaceDao tipsInterfaceDao;
	private Tips tips;
	@Override
	public ArrayList<Tips> getAllTips() {
		ArrayList<Tips> tipsList = tipsInterfaceDao.getAllTips();
		if (tipsList!=null) {
			if (tipsList.size()>0) {
				HttpSession httpSession = ServletActionContext.getRequest().getSession();
				httpSession.setAttribute("tipsList", tipsList);
			}
		}
		return null;
	}

	@Override
	public Integer setTips(String name, String content, int countId, Timestamp time) {
		System.out.println(name+"....."+content+time+"....."+countId);
		tips = new Tips();
		tips.setContent(content);
		tips.setCountId(countId);
		tips.setTime(time);
		tips.setName(name);
		return tipsInterfaceDao.setTips(tips);
	}

	@Override
	public void getTips(Integer id) {
		
		Tips getTips = tipsInterfaceDao.getTips(id);
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		httpSession.setAttribute("getTips", getTips);
	}

	public TipsInterfaceDao getTipsInterfaceDao() {
		return tipsInterfaceDao;
	}

	public void setTipsInterfaceDao(TipsInterfaceDao tipsInterfaceDao) {
		this.tipsInterfaceDao = tipsInterfaceDao;
	}

}
