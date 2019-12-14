package com.myspringsamples;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myspringsamples.model.Speaker;
import com.myspringsamples.repository.HibernateSpeakerRepositoryImpl;
import com.myspringsamples.service.ISpeakerService;
import com.myspringsamples.service.SpeakerServiceImpl;

public class Application {
	public static void main(String args[])
	{
		// run in spring application context
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Get speakerService object using beans
		ISpeakerService speakerService =  appContext.getBean("speakerService", ISpeakerService.class);
		System.out.println(speakerService);
		
		List<Speaker> speakers =  speakerService.findAll();	
		System.out.println("first speaker = " + speakers.get(0).getFirstName() + " "+ speakers.get(0).getLastName());
	
		ISpeakerService speakerService2 =  appContext.getBean("speakerService", ISpeakerService.class);
		System.out.println(speakerService2);	// for singleton address is same as speakerService
	}

}
