package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Academy;

public interface AcademyInterfaceDao {

	ArrayList<Academy> getAllAcademy();
	
	Integer setAcademy(Academy academy);
	
	Academy getAcademy(Integer id);
}
