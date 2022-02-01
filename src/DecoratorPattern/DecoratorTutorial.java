package DecoratorPattern;
/**
 * The purpose of the decorator design pattern is to dynamically
 * attribute properties to objects, and the object itself must be 
 * unaware of the properties being added. In other words, the 
 * decorator design pattern can be used if certain properties are 
 * to be given to objects in certain parts of the code, and this 
 * must be done separately from the object's own class.
 */
public abstract class DecoratorTutorial implements IPattern{

	private IPattern pattern;
	
	public DecoratorTutorial(IPattern pattern) {
		super();
		this.pattern = pattern;
	}

	@Override
	public String getPatternType() 
	{
		return pattern.getPatternType();
	}

	@Override
	public void setPatternType(String type) 
	{
		setPatternType(type);
	}

	public abstract String getPatternName();
	public abstract void setPatternName(String name);
}
