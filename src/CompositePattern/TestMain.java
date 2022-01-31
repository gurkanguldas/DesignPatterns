package CompositePattern;

public class TestMain {
	public static void main(String[] args) 
	{
		
		IPattern body = new CompositeTutorial("Design Patterns");
		IPattern branch1 = new CompositeTutorial("Creational Design Pattern");
		
		IPattern leaf1 = new PatternName("Builder Design Pattern");
		IPattern leaf2 = new PatternName("Singleton Design Pattern");
		
		IPattern branch2 = new CompositeTutorial("Structural Design Pattern");
		
		IPattern leaf3 = new PatternName("Adapter Design Pattern");
		IPattern leaf4 = new PatternName("Bridge Design Pattern");
		
		IPattern branch3 = new CompositeTutorial("Behavioral Design Pattern");

		IPattern leaf5 = new PatternName("Memento Design Pattern");
		IPattern leaf6 = new PatternName("Observer Design Pattern");
		
		
		branch1.add(leaf1);
		branch1.add(leaf2);
		
		branch2.add(leaf3);
		branch2.add(leaf4);
		
		branch3.add(leaf5);
		branch3.add(leaf6);
		
		body.add(branch1);
		body.add(branch2);
		body.add(branch3);
		
		System.out.println(body.toString());
		
		System.out.println("\n"+branch1.toString());
		
		System.out.println("\n"+branch2.toString());
		
		System.out.println("\n"+branch3.toString());
		
	}
}
