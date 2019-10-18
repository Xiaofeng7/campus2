package com.gkk.dao;

import java.util.ArrayList;

import com.gkk.beans.Competition;

public interface CompetitionInterfaceDao {

	ArrayList<Competition> getAllCompetition();
	
	Integer setCompetition(Competition competition);
	
	Competition getCompetition(Integer id);
}
