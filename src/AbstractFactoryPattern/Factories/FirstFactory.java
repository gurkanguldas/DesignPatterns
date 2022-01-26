package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.FirstPatternName;
import AbstractFactoryPattern.FirstPatternType;
import AbstractFactoryPattern.IPatternName;
import AbstractFactoryPattern.IPatternType;

public class FirstFactory extends AbstractFactory{

	@Override
	public IPatternName patternName() 
	{
		return new FirstPatternName();
	}

	@Override
	public IPatternType patternType() 
	{
		return new FirstPatternType();
	}

}
