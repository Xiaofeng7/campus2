package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Club;

public interface ClubInterfaceDao {

	ArrayList<Club> getAllClub();
	
	Integer setClub(Club club);
	
	Club getClub(Integer id);
}
