package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * The composite design pattern allows a group of different objects 
 * to be used as one whole object. It combines objects into a tree 
 * structure to represent entire hierarchies and reorganizes the 
 * part-whole relationship throughout the application.
 */
public class CompositeTutorial implements IPattern {

	private List<IPattern> patterns;

	private String patternType;
	
	public CompositeTutorial(String patternType) 
	{
		this.patterns = new ArrayList<IPattern>();
		this.patternType = patternType;
	}

	@Override
	public void add(IPattern pattern) 
	{
		this.patterns.add(pattern);
	}
	
	@Override
	public String getPatternName() 
	{
		return patternType;
	}

	@Override
	public void setPatternName(String patternName) 
	{
		this.patternType = patternName;
		
	}

	@Override
	public String toString() {
		String str = "CompositeTutorial [patternType=" + patternType + "]";
		
		for (IPattern pattern : patterns) 
		{
			str += "\n"+pattern.toString();
		}
		
		return str;
	}

	
	
	
}
