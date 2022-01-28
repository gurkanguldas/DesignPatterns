package AdapterPattern;
/**
 * It is a software design pattern that allows the interface of an 
 * existing class to be used as another interface. It is often used 
 * to make existing classes work with others without changing their 
 * source code.
 */
public class AdapterTutorial implements IPattern{

	private String patternName;
	private String patternType;
	
	public AdapterTutorial(IPatternReader patternReader) 
	{
		System.out.print("Pattern Name: ");
		patternName = patternReader.readPattern();
		
		System.out.print("Pattern Type: ");
		patternType = patternReader.readPattern();
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
