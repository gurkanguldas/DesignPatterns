package DecoratorPattern;

public class PatternType implements IPattern{

	private String patternType;
	
	public PatternType(String patternType) 
	{
		super();
		this.patternType = patternType;
	}

	@Override
	public String getPatternType() 
	{
		return patternType;
	}

	@Override
	public void setPatternType(String type) 
	{
		patternType = type;
	}

	@Override
	public String toString() {
		return "PatternType : "+patternType;
	}
	
	
}
