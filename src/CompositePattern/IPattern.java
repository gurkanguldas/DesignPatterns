package CompositePattern;

public interface IPattern 
{
	public String getPatternName();
	public void setPatternName(String patternName);
	
	public void add(IPattern pattern);
	
}
