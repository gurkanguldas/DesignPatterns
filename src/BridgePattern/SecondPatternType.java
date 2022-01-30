package BridgePattern;

public class SecondPatternType extends BridgeTutorial{

	public SecondPatternType(IPatternName patternName) 
	{
		super(patternName);
		setDesignType("Structural Design Pattern");
	}

	@Override
	public String writeConsol() {
		
		return "Pattern Name: "+getPatternName().getName()+"\n"+
			   "Pattern Type: "+getDesignType();
		
	}

}
