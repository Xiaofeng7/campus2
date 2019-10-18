package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Cathedra;

public interface CathedraInterfaceDao {

	ArrayList<Cathedra> getAllCathedra();
	
	Integer setCathedra(Cathedra cathedra);
	
	Cathedra getCathedra(Integer id);
}
