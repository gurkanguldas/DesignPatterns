package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * The Flyweight design pattern aims to use shared memory spaces 
 * rather than creating similar objects over and over. This 
 * approach ensures that the memory usage caused by object creation
 * is minimized.
 */
public class FlyweightTutorial 
{
	private static final Map<String, IPattern> patterns = new HashMap<>();
	
	public static IPattern getPattern(String patternName)
	{
		IPattern pattern = patterns.get(patternName);
		
		if(pattern != null)
		{
			return pattern;
		}
		else
		{
			System.out.println("New pattern created.");
			
			pattern = new StructuralDesignPattern(patternName);
			patterns.put(patternName, pattern);
			return pattern;
		}
	}
	
}
