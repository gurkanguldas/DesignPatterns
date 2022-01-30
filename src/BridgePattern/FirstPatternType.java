package BridgePattern;

public class FirstPatternType extends BridgeTutorial{

	public FirstPatternType(IPatternName patternName) 
	{
		super(patternName);
		setDesignType("Creation Design Pattern");
	}

	@Override
	public String writeConsol() {
		
		return "Pattern Name: "+getPatternName().getName()+"\n"+
			   "Pattern Type: "+getDesignType();
		
	}

}
