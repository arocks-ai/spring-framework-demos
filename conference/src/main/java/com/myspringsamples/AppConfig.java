package com.myspringsamples;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.myspringsamples.repository.HibernateSpeakerRepositoryImpl;
import com.myspringsamples.repository.ISpeakerRepository;
import com.myspringsamples.service.ISpeakerService;
import com.myspringsamples.service.SpeakerServiceImpl;

// @Configuration indicated spring context start point 
@Configuration
public class AppConfig {

	// Create bean for SpeakerServiceImpl
	// default scope is singleton, i.e single instance for multiple calls
	@Bean(name="speakerService")
	@Scope(value=BeanDefinition.SCOPE_SINGLETON)	// Singleton is default
	public ISpeakerService getSpeakerService()
	{
		return new SpeakerServiceImpl((HibernateSpeakerRepositoryImpl)getSpeakerRepository());
	}
	
	@Bean(name="speakerRepository")
	@Scope(value=BeanDefinition.SCOPE_SINGLETON)	// Singleton is default
	public ISpeakerRepository getSpeakerRepository()
	{
		return new HibernateSpeakerRepositoryImpl();
	}
	
	
}
