package AbstractFactoryPattern;

import AbstractFactoryPattern.Factories.FirstFactory;
import AbstractFactoryPattern.Factories.SecondFactory;

public class TestMain {
	public static void main(String[] args) 
	{
		//Subfactory
		AbstractFactoryTutorial aTutorial1 = new AbstractFactoryTutorial(new FirstFactory());
		AbstractFactoryTutorial aTutorial2 = new AbstractFactoryTutorial(new SecondFactory());

		
		System.out.println("Tutorial 1 Variables\n" + aTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n" + aTutorial2.toString());

		System.out.println("\nTutorial 1 Hashcode\n" + aTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n" + aTutorial2.hashCode());

		System.out.println("\nAre the references the same?\n" + (aTutorial1 == aTutorial2));

	}
}
