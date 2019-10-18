package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.gkk.beans.Academy;
import com.gkk.beans.Profession;

public interface ProfessionInterface {
	
	ArrayList<Profession> getAllProfession();
	
	void getProfession(Integer id);

	Integer setProfession(String name, String content, int countId, Academy academy,Timestamp time);
}                
