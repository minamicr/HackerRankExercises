package Main;

import java.util.Arrays;
import java.util.List;

public class StringToken {
	
	
	public List<String> splitString(String sentence) {
		String signals = "!,?._'@";
		
		String cleanSentence = removeSignalsBySpaces(sentence, signals);
		String cleanAditionalSpaces = cleanSentence.trim().replaceAll("\\s{2,}", " ");
		return removeSpaces(cleanAditionalSpaces);
		
	}
	
	public void printWords(String sentence) {
		List<String> words = splitString(sentence);
		
		System.out.println(words.size());
		
		for (String word : words) {
			System.out.println(word);
		}	
	}
	
	public int countWords(List<String> words) {
		return words.size();
		
	}
	private String removeSignalsBySpaces(String sentence, String signals) {
		for (int i = 0; i < signals.length(); i++) {
			sentence= sentence.replace(String.valueOf(signals.charAt(i)), " ");
		}
		return sentence;
	}
	
	private List<String> removeSpaces(String sentence) {
		return Arrays.asList(sentence.split(" "));
	}
	

}
