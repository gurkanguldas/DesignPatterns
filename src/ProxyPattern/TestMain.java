package ProxyPattern;

public class TestMain {
	public static void main(String[] args) {
		ProxyTutorial pTutorial = new ProxyTutorial();
		
		pTutorial.setPatternName("Factory Design Pattern");
		
		pTutorial.setPatternName("Bridge Design Pattern");
		pTutorial.setPatternName("Proxy Design Pattern");
		
		pTutorial.setPatternName("Singleton Design Pattern");

		pTutorial.setPatternName("Interpreter  Design Pattern");
		pTutorial.setPatternName("Iterator  Design Pattern");
		
		System.out.println(pTutorial.toString());
	}
}
