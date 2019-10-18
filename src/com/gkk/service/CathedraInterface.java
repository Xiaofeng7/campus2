package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.gkk.beans.Cathedra;

public interface CathedraInterface {
	
	ArrayList<Cathedra> getAllCathedra();
	
	void getCathedra(Integer id);

	Integer setCathedra(String name, String content, int countId, Timestamp time);
}
