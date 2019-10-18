package com.gkk.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.gkk.beans.Competition;

public interface CompetitionInterface {
	
	void getAllCompetition();
	
	void getCompetition(Integer id);

	Integer setCompetition(String name, String content, int countId, String accessory,Timestamp time);
}
