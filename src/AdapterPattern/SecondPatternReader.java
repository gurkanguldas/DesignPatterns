package AdapterPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondPatternReader implements IPatternReader{

	@Override
	public String readPattern() {
		
		try 
		{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			return bufferedReader.readLine();
		} 
		catch (IOException e) 
		{
			return null;
		}
	}

}
