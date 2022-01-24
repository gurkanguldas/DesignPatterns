package SingletonPattern;

public class SingletonTutorial {

	private String patternName;
	private String patternType;
	
	private static SingletonTutorial instance;
	
	private SingletonTutorial(String patternName, String patternType) {
		this.patternName = patternName;
		this.patternType = patternType;
	}
	
	//A mechanism that ensures that the object is created only once establishes.
	public static SingletonTutorial getInstance(String patternName, String patternType)
	{
		return instance == null ? instance = new SingletonTutorial(patternName, patternType) : instance;
	}
	
	@Override
	public String toString() {
		return "Pattern Name: "+patternName+
			   "\nPattern Tyoe: "+patternType;
	}
	public String getPatternName() {
		return patternName;
	}
	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}
	public String getPatternType() {
		return patternType;
	}
	public void setPatternType(String patternType) {
		this.patternType = patternType;
	}
	
	
}
