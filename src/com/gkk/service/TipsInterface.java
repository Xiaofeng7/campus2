package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.gkk.beans.Tips;

public interface TipsInterface {
	
	ArrayList<Tips> getAllTips();
	
	void getTips(Integer id);

	Integer setTips(String name, String content, int countId, Timestamp time);
}
