package Main;

public class StringToken {
	
	//split(String regex) [A-Za-z !,?._'@]
	//He is a very very good boy, isn't he?
	
	private static void splitString(String sentence) {
		String removeToken = "!,?._'@";
		String[] words = sentence.split(" ");
		String[] sentenceAux = new String[sentence.length()];
	
		boolean included = false;
		
		for (int i = 0; i < words.length; i++) {
			String[] exclamation = splitAgain(words[i], "!");
			included = addElements(words, exclamation, i);

			
			String[] comma = splitAgain(words[i], ",");
			addElements(words, comma, i);
			
			String[] apost = splitAgain(words[i], "'");
			
			
			System.out.println(words[i]);
		}
	}
	
	private static String[] splitAgain(String original, String token) {
		if (original.contains(token)) {
			String[] split = original.split(token);
			return split;
		} else {
			return null;
		}
		
	}
	
	private static boolean addElements(String[] original, String[] newSplit, int wordIndex) {
		int lastElement = lastElementArray(original);
		boolean elementAdded = false;
		
		if (newSplit != null) {
			for (int i=0; i < newSplit.length; i++) {
				original[lastElement] = newSplit[i];
				lastElement++;
				elementAdded = true;
			}
		}
		return elementAdded;
	}

	private static int lastElementArray(String[] array) {
		for (int j=0; j < array.length; j++) {
			if (array[j] == null) {
				return j;
			}
		}
		return 0;
	}
	
	public static void main (String[] args) {
		String sentence = "He is a very very good boy, isn't he?";
		splitString(sentence);
	}
	

}
