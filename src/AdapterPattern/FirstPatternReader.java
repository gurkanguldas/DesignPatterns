package AdapterPattern;

import java.util.Scanner;

public class FirstPatternReader implements IPatternReader{

	@Override
	public String readPattern() 
	{
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
