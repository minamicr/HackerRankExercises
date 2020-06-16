package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToken2 {

	private String[] splitString(String sentence) {
		
		String removeToken = "!,?._'@";
		List<String> words = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
	
		String token = null;
		
		for (String word:words) {
			String wordAux = word;
			
			if(wordAux.contains("!")) {
				
			}
		}
		return null;
	}
}
