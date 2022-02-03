package FacadePattern;

import java.util.ArrayList;
import java.util.List;

public class BehavioralDesignPattern implements IPatternType{

	private List<String> patternNames;
	
	public BehavioralDesignPattern() 
	{
		patternNames = new ArrayList<String>();
	}
	
	@Override
	public String getPatternType() 
	{
		return "Behavioral Design Pattern";
	}

	@Override
	public void setPatternName(String name) 
	{
		patternNames.add(name);
	}

	@Override
	public List<String> getPatternNames() 
	{
		return patternNames;
	}

	@Override
	public String toString() {
		String str = "Behavioral Design Pattern\n";
		for (String pattern : patternNames) 
			str += " -"+pattern+"\n";
		return str;
	}
	
	
}
