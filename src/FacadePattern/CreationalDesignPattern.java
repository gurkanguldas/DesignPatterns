package FacadePattern;

import java.util.ArrayList;
import java.util.List;

public class CreationalDesignPattern implements IPatternType{

	private List<String> patternNames;
	
	public CreationalDesignPattern() 
	{
		patternNames = new ArrayList<String>();
	}
	
	@Override
	public String getPatternType() 
	{
		return "Creational Design Pattern";
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
		String str = "Creational Design Pattern\n";
		for (String pattern : patternNames) 
			str += " -"+pattern+"\n";
		return str;
	}
}
