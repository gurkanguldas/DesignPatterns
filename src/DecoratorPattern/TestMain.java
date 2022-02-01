package DecoratorPattern;

public class TestMain {
	public static void main(String[] args) {
		IPattern dTutorial1 = new PatternType("Creation Design Pattern");
		//Pattern type has been added to the pattern as a new property.
		IPattern dTutorial2 = new PatternName(new PatternType("Structural Design Pattern"), "Decorator Design Pattern");
		
		System.out.println("Tutorial 1 Variables\n"+dTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+dTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+dTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+dTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(dTutorial1 == dTutorial2));
	}
}
