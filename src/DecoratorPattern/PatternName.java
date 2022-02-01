package DecoratorPattern;

public class PatternName extends DecoratorTutorial{

	private String patternName;
	private IPattern pattern;
	
	public PatternName(IPattern pattern , String name) 
	{
		super(pattern);
		this.pattern = pattern;
		patternName = name;
	}

	@Override
	public String getPatternName() 
	{
		return patternName;
	}

	@Override
	public void setPatternName(String name) 
	{
		patternName = name;
	}

	@Override
	public String toString() {
		return "PatternType : "+pattern.getPatternType()+"\n"+
			   "PatternName : "+patternName;
	}
	
	

}
