package ObjectPoolPattern;

public class TestMain {
	public static void main(String[] args) 
	{
		Patterns pTutorial1 = ObjectPoolTutorial.getInstances().getPattern();
		pTutorial1.setPatternName("Proxy Design Pattern");
		pTutorial1.setPatternType("Structural Design Pattern");
		
		Patterns pTutorial2 = ObjectPoolTutorial.getInstances().getPattern();
		pTutorial2.setPatternName("Prototype Design Pattern");
		pTutorial2.setPatternType("Creational Design Pattern");
		
		
		Patterns pTutorial3 = ObjectPoolTutorial.getInstances().getPattern();
		
		ObjectPoolTutorial.getInstances().dispose(pTutorial2);
		
		System.out.println("Tutorial 1 Variables\n"+pTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+pTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+pTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+pTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(pTutorial1 == pTutorial2));	}
}
