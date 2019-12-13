package com.myspringsamples.repository;

import java.util.ArrayList;
import java.util.List;

import com.myspringsamples.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements ISpeakerRepository {
	
	public List<Speaker> findAll()
	{
		List<Speaker> speakerList = new ArrayList<Speaker>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("arocks");
		speaker.setLastName("king");
		
		speakerList.add(speaker);
		return speakerList; 
	}
}
