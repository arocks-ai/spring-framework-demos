import java.util.List;

import com.myspringsamples.model.Speaker;
import com.myspringsamples.service.ISpeakerService;
import com.myspringsamples.service.SpeakerServiceImpl;

public class Application {
	public static void main(String args[])
	{
		ISpeakerService speakerService = (ISpeakerService) new SpeakerServiceImpl();
		
		List<Speaker> speakers =  speakerService.findAll();
		
		System.out.println("first speaker = " + speakers.get(0).getFirstName() + " "+ speakers.get(0).getLastName());
	}

}
