package AdapterPattern;

public class TestMain {
	public static void main(String[] args) 
	{
		IPattern aTutorial1 = new FirstPattern();
		IPattern aTutorial2 = new AdapterTutorial(new FirstPatternReader());
		
		System.out.println("Tutorial 1 Variables\n"+aTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+aTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+aTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+aTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(aTutorial1 == aTutorial2));
		
	}
}
