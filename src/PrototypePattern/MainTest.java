package PrototypePattern;

public class MainTest {
	public static void main(String[] args) {
		PrototypeTutorial pTutorial1 = new FirstPattern();
		pTutorial1.setPatternName("Singleton Design Pattern");
		
		PrototypeTutorial pTutorial2 = (PrototypeTutorial)pTutorial1.clone();
		pTutorial2.setPatternName("Proxy Design Pattern");
		pTutorial2.setPatternType("Structural Design Pattern");
		
		System.out.println("Tutorial 1 Variables\n"+pTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+pTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+pTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+pTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(pTutorial1 == pTutorial2));
	}
}
