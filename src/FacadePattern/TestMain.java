package FacadePattern;

public class TestMain 
{
	public static void main(String[] args) {
		FacadeTutorial fTutorial = new FacadeTutorial();
		
		fTutorial.getCreationalPattern().setPatternName("Singleton Design Pattern");
		fTutorial.getCreationalPattern().setPatternName("Builder Design Pattern");
		
		fTutorial.getBehavioralPattern().setPatternName("Adapter Design Pattern");
		fTutorial.getBehavioralPattern().setPatternName("Bridge Design Pattern");
		fTutorial.getBehavioralPattern().setPatternName("Facade Design Pattern");

		fTutorial.getStructuralPattern().setPatternName("Iterator Design Pattern");
		fTutorial.getStructuralPattern().setPatternName("State Design Pattern");
		
		System.out.println("******************************************");
		System.out.println(fTutorial.toString());
		System.out.println("******************************************");
		
		System.out.println(fTutorial.getBehavioralPattern().toString());
		System.out.println("******************************************");
		
		System.out.println(fTutorial.getCreationalPattern().toString());
		System.out.println("******************************************");
		
		System.out.println(fTutorial.getStructuralPattern().toString());
		System.out.println("******************************************");
	}
}
