package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Set;

import com.gkk.beans.Academy;
import com.gkk.beans.Profession;

public interface AcademyInterface {
	
	ArrayList<Academy> getAllAcademy();
	
	void getAcademy(Integer id);

	Integer setAcademy(String name, int countId, Set<Profession> professionList,Timestamp time);
}                
