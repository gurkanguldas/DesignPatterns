package FactoryPattern;

public class FactoryTutorial {

	/**
	 * The factory design pattern provides necessary object creation for subclasses of 
	 * the same superclass using inheritance. It is used to make the right choice among 
	 * many similar classes and to create the necessary object according to the information 
	 * in its structure.
	 */
	
	public static Pattern getPattern(String pattern)
	{
		if(pattern.equalsIgnoreCase("Singleton"))
			return new FirstPattern();
		
		else if(pattern.equalsIgnoreCase("Prototype"))
			return new SecondPattern();
		
		else
			return null;
	}
}
