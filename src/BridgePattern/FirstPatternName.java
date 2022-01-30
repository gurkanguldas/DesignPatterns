package BridgePattern;

public class FirstPatternName implements IPatternName{

	private String patternName = "Builder Design Pattern";
	@Override
	public String getName() 
	{
		return patternName;
	}

	@Override
	public void setName(String name) 
	{
		patternName = name;
	}

}
