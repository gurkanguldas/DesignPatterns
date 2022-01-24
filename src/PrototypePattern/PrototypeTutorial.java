package PrototypePattern;

public abstract class PrototypeTutorial implements Cloneable{
	
	private String patternName = "Prototype Design Pattern";
	private String patternType = "Creational Design Pattern";
	//...
	//Multiple methods and fields are available.
	
	/**
	 * It is based on the principle of copying the existing instance when new instances are created 
	 * from an existing class, rather than creating a new instance.If the object to be created is 
	 * costly and resource-intensive, this model should be followed.
	 **/
	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
	//...
	
}
