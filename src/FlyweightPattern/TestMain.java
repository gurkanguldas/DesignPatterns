package FlyweightPattern;

public class TestMain 
{
	public static void main(String[] args) {
		
		String patternArray[] = { "Adapter Design Pattern", 
								  "Bridge Design Pattern", 
								  "Composite Design Pattern", 
								  "Decorator Design Pattern", 
								  "Flyweight Design Pattern" };

		
		for (int i = 1; i <= 10; i++) 
		{
			int index = (int)(Math.random()*patternArray.length);
			
			IPattern pattern = FlyweightTutorial.getPattern(patternArray[index]);

			System.out.println(i+". Iterator: "+pattern.getPatternName());
		}
		
		
	}
}
