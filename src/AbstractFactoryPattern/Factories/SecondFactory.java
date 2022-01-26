package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.IPatternName;
import AbstractFactoryPattern.IPatternType;
import AbstractFactoryPattern.SecondPatternName;
import AbstractFactoryPattern.SecondPatternType;

public class SecondFactory extends AbstractFactory
{
	@Override
	public IPatternName patternName() 
	{
		return new SecondPatternName();
	}

	@Override
	public IPatternType patternType() 
	{
		return new SecondPatternType();
	}

}
