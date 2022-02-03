package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

import FacadePattern.IPatternType;

/**
 * Proxy design pattern means an object that represents another 
 * object. Provides control for accessing the original object. 
 * Thus, many operations such as hiding the information of the 
 * original object, optional loading can be performed.
 */

public class ProxyTutorial implements IPatternType{

	private CreationalDesignPattern creationalPattern;
	
	public ProxyTutorial() 
	{
		creationalPattern = new CreationalDesignPattern();
	}
	
	private List<String> creationalPatterns()
	{
		List<String> patternList = new ArrayList<String>();
		
		patternList.add("Factory Design Pattern");
		patternList.add("Abstract Factory Design Pattern");
		patternList.add("Singleton Design Pattern");
		patternList.add("Prototype Design Pattern");
		patternList.add("Builder Design Pattern");
		
		return patternList;
	}
	
	@Override
	public String getPatternType() 
	{
		return creationalPattern.getPatternType();
	}

	@Override
	public void setPatternName(String name) 
	{
		boolean isPattern = false;
		
		for (String patternName : creationalPatterns())
			if(name.equalsIgnoreCase(patternName))
				isPattern = true;
		
		if(isPattern)
			creationalPattern.setPatternName(name);
		else
			System.out.println("You made an incorrect entry. "+name+
					" is not a pattern type belonging to "+creationalPattern.getPatternType()+".");
		
	}

	@Override
	public List<String> getPatternNames() 
	{
		return creationalPattern.getPatternNames();
	}

	@Override
	public String toString() {
		String str = creationalPattern.getPatternType()+"\n";
		for (String pattern : creationalPattern.getPatternNames()) 
			str += " -"+pattern+"\n";
		return str;
	}

}
