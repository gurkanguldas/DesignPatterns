package SingletonPattern;

public class TestMain {

	public static void main(String[] args) 
	{
		SingletonTutorial sTutorial1 = SingletonTutorial.getInstance("Singleton Design Pattern", "Creational Design Pattern");
		SingletonTutorial sTutorial2 = SingletonTutorial.getInstance("Builder Design Pattern", "Creational Design Pattern");
		
		System.out.println("Tutorial 1 Variables\n"+sTutorial1.toString());
		System.out.println("Tutorial 2 Variables\n"+sTutorial2.toString());
		
		System.out.println("\nTutorial 1 Hashcode\n"+sTutorial1.hashCode());
		System.out.println("Tutorial 2 Hashcode\n"+sTutorial2.hashCode());
		
		System.out.println("\nAre the references the same?\n"+(sTutorial1 == sTutorial2));
	}
}
