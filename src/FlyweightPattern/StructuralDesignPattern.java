package FlyweightPattern;

public class StructuralDesignPattern implements IPattern{

	private String patternName;

	public StructuralDesignPattern(String patternName) 
	{
		this.patternName = patternName;
	}
	
	@Override
	public String toString() {
		return "PatternType : "+"Structural Design Pattern"+"\n"+
			   "PatternName : "+patternName;
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

}
