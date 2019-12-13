package com.myspringsamples.repository;
import java.util.List;

import com.myspringsamples.model.*;

public interface ISpeakerRepository 
{
	public List<Speaker> findAll();
}
