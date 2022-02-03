package FacadePattern;
/**
 * By abstracting the classes that make up the parts of a system from 
 * the client, it provides an interface through which the client can 
 * access the system, makes it easy to use and hides the complexity of 
 * the system. In short, it hides the complexity of one or more classes 
 * behind a facade.
 */
public class FacadeTutorial 
{
	private CreationalDesignPattern creationalPattern;
	private BehavioralDesignPattern behavioralPattern;
	private StructuralDesignPattern structuralPattern;
	
	public FacadeTutorial() 
	{
		this.creationalPattern = new CreationalDesignPattern();
		this.behavioralPattern = new BehavioralDesignPattern();
		this.structuralPattern = new StructuralDesignPattern();
	}

	public CreationalDesignPattern getCreationalPattern() 
	{
		return creationalPattern;
	}

	public void setCreationalPattern(CreationalDesignPattern creationalPattern) 
	{
		this.creationalPattern = creationalPattern;
	}

	public BehavioralDesignPattern getBehavioralPattern() 
	{
		return behavioralPattern;
	}

	public void setBehavioralPattern(BehavioralDesignPattern behavioralPattern) 
	{
		this.behavioralPattern = behavioralPattern;
	}

	public StructuralDesignPattern getStructuralPattern() 
	{
		return structuralPattern;
	}

	public void setStructuralPattern(StructuralDesignPattern structuralPattern) 
	{
		this.structuralPattern = structuralPattern;
	}

	@Override
	public String toString() {
		return creationalPattern.toString() + "\n" + behavioralPattern.toString() + "\n" + structuralPattern.toString();
	}
	
	
	
}
