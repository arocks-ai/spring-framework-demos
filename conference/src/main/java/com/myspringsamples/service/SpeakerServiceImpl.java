package com.myspringsamples.service;

import java.util.List;

import com.myspringsamples.model.Speaker;
import com.myspringsamples.repository.HibernateSpeakerRepositoryImpl;
import com.myspringsamples.service.*;

public class SpeakerServiceImpl implements ISpeakerService
{
	public List<Speaker> findAll()
	{
		HibernateSpeakerRepositoryImpl speakerRepoImpl = new HibernateSpeakerRepositoryImpl();
		return speakerRepoImpl.findAll();		
	}

}
