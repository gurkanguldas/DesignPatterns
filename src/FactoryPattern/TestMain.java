package FactoryPattern;

public class TestMain {
	public static void main(String[] args) {
		
		Pattern fTutorial1 = FactoryTutorial.getPattern("Singleton");
		Pattern fTutorial2 = FactoryTutorial.getPattern("Prototype"); 
		
		System.out.println("Tutorial 1 Variables\n"+fTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+fTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+fTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+fTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(fTutorial1 == fTutorial2));
	}
}
