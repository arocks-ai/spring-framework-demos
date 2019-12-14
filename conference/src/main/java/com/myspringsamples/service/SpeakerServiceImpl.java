package com.myspringsamples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myspringsamples.model.Speaker;
import com.myspringsamples.repository.HibernateSpeakerRepositoryImpl;
import com.myspringsamples.service.*;

public class SpeakerServiceImpl implements ISpeakerService
{
	private HibernateSpeakerRepositoryImpl speakerRepoImpl;
	

	public SpeakerServiceImpl(HibernateSpeakerRepositoryImpl speakerRepoImpl)
	{
		this.speakerRepoImpl = speakerRepoImpl;
		System.out.println("Inside SpeakerServiceImpl single arg ctor");
	}
	public List<Speaker> findAll()
	{
		return speakerRepoImpl.findAll();		
	}



	
}
