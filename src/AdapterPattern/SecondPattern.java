package AdapterPattern;

public class SecondPattern implements IPattern{

	private String patternName = "Prototype Design Pattern";
	private String patternType = "Creational Design Pattern";
	
	public SecondPattern() {
		// TODO Auto-generated constructor stub
	}
	
	public SecondPattern(String patternName, String patternType) {
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
