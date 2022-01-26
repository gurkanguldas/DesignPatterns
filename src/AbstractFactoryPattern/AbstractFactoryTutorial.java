package AbstractFactoryPattern;

import AbstractFactoryPattern.Factories.AbstractFactory;

public class AbstractFactoryTutorial 
{
	/**
	 * The abstract factory design pattern has multiple superclasses with 
	 * required object creation for subclasses of the same superclass. 
	 * Therefore, a factory runs for each superclass. The abstract factory
	 * design pattern acts as the main factory that produces these factories.
	 */

	private IPatternName patternName;
	private IPatternType patternType;
	//Superfactory
	public AbstractFactoryTutorial(AbstractFactory abstractFactory) 
	{
		this.patternName = abstractFactory.patternName();
		this.patternType = abstractFactory.patternType();
	}

	@Override
	public String toString() {
		return "Pattern Name: "+this.patternName.getPatternName()+"\n"+
			   "Pattern Type: "+this.patternType.getPatternType();
	}
	
	public String getPatternName()
	{
		return this.patternName.getPatternName();
	}
	
	public String getPatternType()
	{
		return this.patternType.getPatternType();
	}
	
}
