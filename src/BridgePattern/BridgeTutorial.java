package BridgePattern;
/**
 * The bridge design pattern is used to separate inherited objects
 * from objects implemented via interfaces, thus providing a more
 * flexible structure and the two can change independently of each other.
 */
public abstract class BridgeTutorial 
{
	private String designType = "";
	private IPatternName patternName;
	
	public BridgeTutorial(IPatternName patternName) 
	{
		this.patternName = patternName;
	}

	public abstract String writeConsol();
	
	public String getDesignType() {
		return designType;
	}
	
	public void setDesignType(String designType) {
		this.designType = designType;
	}

	public IPatternName getPatternName() {
		return patternName;
	}
	
	public void setPatternName(IPatternName patternName) {
		this.patternName = patternName;
	}
	
	
}
