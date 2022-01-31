package CompositePattern;

public class PatternName implements IPattern{

	private String patternName;
	
	public PatternName(String patternName) 
	{
		this.patternName = patternName;
	}

	@Override
	public String getPatternName() 
	{
		return patternName;
	}

	@Override
	public void setPatternName(String patternName) 
	{
		this.patternName = patternName;
		
	}

	@Override
	public void add(IPattern pattern) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "PatternName [patternName=" + patternName + "]";
	}
	
	

}
