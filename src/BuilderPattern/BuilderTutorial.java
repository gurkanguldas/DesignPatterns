package BuilderPattern;

public class BuilderTutorial {
	

	private String patternName;
	private String patternType;

	public BuilderTutorial(Builder builder) {
		this.patternName = builder.patternName;
		this.patternType = builder.patternType;
	}
	
	//It enables as many parts as needed to be created from a complex set of objects using a single interface.
	public static class Builder
	{
		private String patternName;
		private String patternType;
		
		public Builder patternName(String patternName) {
			this.patternName = patternName;
			return this;
		}
		public Builder patternType(String patternType) {
			this.patternType = patternType;
			return this;
		}
		
		public BuilderTutorial build()
		{
			return new BuilderTutorial(this);
		}	
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
