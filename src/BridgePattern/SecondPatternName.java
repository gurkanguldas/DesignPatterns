package BridgePattern;

public class SecondPatternName implements IPatternName{

	private String patternName = "Bridge Design Pattern";
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
