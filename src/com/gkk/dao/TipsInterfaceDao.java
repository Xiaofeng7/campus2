package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Tips;

public interface TipsInterfaceDao {

	ArrayList<Tips> getAllTips();
	
	Integer setTips(Tips tips);
	
	Tips getTips(Integer id);
}
