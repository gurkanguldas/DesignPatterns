package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.IPatternName;
import AbstractFactoryPattern.IPatternType;

public abstract class AbstractFactory
{
	public abstract IPatternName patternName();
	public abstract IPatternType patternType();
}
