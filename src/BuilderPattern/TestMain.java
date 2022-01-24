package BuilderPattern;

public class TestMain {
	public static void main(String[] args) {
		BuilderTutorial bTutorial1 = new BuilderTutorial.Builder()
										.patternName("Builder Design Pattern")
										.patternType("Creational Design Pattern")
										.build();
		
		BuilderTutorial bTutorial2 = new BuilderTutorial.Builder()
										.patternType("Creational Design Pattern")
										.patternName("Singleton Design Pattern")
										.build();
		

		System.out.println("Tutorial 1 Variables\n"+bTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+bTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+bTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+bTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(bTutorial1 == bTutorial2));
		
										
				
				
	}
}
