
public class StringCompressor {
	
	
	// assumes string only has characters/ no input verification, treats uppercase/lowercase seperatly
	public static String compress(String input) {
		String compressed = "";
		char currentLetter = input.charAt(0);
		int letterCount = 0;
		for(int i = 0; i<input.length(); i++)
		{
			
			if(currentLetter == input.charAt(i))
			{
				letterCount++;
			}
			else {
				compressed = compressed + currentLetter + letterCount;
				letterCount = 1;
				currentLetter = input.charAt(i);
			}
		}	
		compressed = compressed + currentLetter + letterCount;
		if(compressed.length()<input.length())
			return compressed;
		else
			return input;
	}
	
	
	

}
