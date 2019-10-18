package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Profession;

public interface ProfessionInterfaceDao {

	ArrayList<Profession> getAllProfession();
	
	Integer setProfession(Profession profession);
	
	Profession getProfession(Integer id);
}
