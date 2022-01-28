package ObjectPoolPattern;

import java.util.ArrayList;
import java.util.List;


public class ObjectPoolTutorial 
{
	/**
	 * The Object Pool Pattern is based on the principle of reusing an 
	 * existing object, rather than recreating a costly object every 
	 * time, which will strain performance. Basically, a certain amount 
	 * of costly objects already exist in the Object pool. Once an object 
	 * is removed from the pool, it is not in the pool until it is put back 
	 * in. Objects in the repository have a lifecycle (creation, validation,
	 * and destruction).
	 */
	private static List<Patterns> patternsList;
	protected static ObjectPoolTutorial instance;
	
	private static final int maxInstance = 2;
	
	protected ObjectPoolTutorial()
	{
		patternsList = new ArrayList<>();
	}
	
	public static ObjectPoolTutorial getInstances()
	{
		if(instance == null)
		{
			instance = new ObjectPoolTutorial();
			for (int i = 0; i < maxInstance; i++) 
			{
				Patterns pattern = new Patterns();
				pattern.setActive(false);
				patternsList.add(pattern);
			}
		}
		return instance;
	}
	
	public Patterns getPattern()
	{
		
		for (Patterns patterns : patternsList) 
		{
			if(!patterns.isActive())
			{
				patterns.setActive(true);
				return patterns;
			}
		}
		return null;
	}
	public void dispose(Patterns pattern)
	{
		pattern.setActive(false);
	}
	
}
