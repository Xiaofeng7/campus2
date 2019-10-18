package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.gkk.beans.Club;

public interface ClubInterface {
	
	ArrayList<Club> getAllClub();
	
	void getClub(Integer id);

	Integer setClub(String name, String content, int countId, Timestamp time);
}
