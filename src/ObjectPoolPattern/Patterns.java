package ObjectPoolPattern;

public class Patterns{
	private String patternName = "sa";
	private String patternType = "as";
	
	private Boolean active = false;
	
	public Patterns()
	{
		this.active = true;
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
	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
