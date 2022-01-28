package AdapterPattern;

public class FirstPattern implements IPattern{

	private String patternName = "Singleton Design Pattern";
	private String patternType = "Creational Design Pattern";
	
	public FirstPattern() {
		// TODO Auto-generated constructor stub
	}
	
	public FirstPattern(String patternName, String patternType) {
		super();
		this.patternName = patternName;
		this.patternType = patternType;
	}

	@Override
	public String toString() {
		return "Pattern Name: "+patternName+
			   "\nPattern Tyoe: "+patternType;
	}

	@Override
	public String getPatternName() {
		// TODO Auto-generated method stub
		return patternName;
	}

	@Override
	public void setPatternName(String name) {
		// TODO Auto-generated method stub
		patternName = name;
	}

	@Override
	public String getPatternType() {
		// TODO Auto-generated method stub
		return patternType;
	}

	@Override
	public void setPatternType(String type) {
		// TODO Auto-generated method stub
		patternType = type;
	}

}
