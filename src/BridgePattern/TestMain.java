package BridgePattern;

public class TestMain {
	public static void main(String[] args) {
		BridgeTutorial bTutorial1 = new FirstPatternType(new FirstPatternName());
		BridgeTutorial bTutorial2 = new SecondPatternType(new SecondPatternName());
		
		System.out.println("Tutorial 1 Variables\n"+bTutorial1.writeConsol());
		System.out.println("Tutorial 2 Variables\n"+bTutorial2.writeConsol());
		
		System.out.println("\nTutorial 1 Hashcode\n"+bTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+bTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(bTutorial1 == bTutorial2));
	}
}
