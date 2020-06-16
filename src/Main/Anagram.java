package Main;


public class Anagram {

	public static boolean isAnagram(String word1, String word2) {
		
		if (word1 == null || word2 == null) {
			return true;
		}
		
		int maxLengthArray = word1.length() + word2.length();
		String[] letters = new String[maxLengthArray];
		int[] amountWord1 = new int[maxLengthArray];
		int[] amountWord2 = new int[maxLengthArray];
		
		int index = 0;
		boolean letterFound = false;
		
		for (int i = 0; i < word1.length(); i++) {
			letterFound = false;
			
			for (int j = 0; j < letters.length; j++) {
				if (String.valueOf(word1.charAt(i)).equalsIgnoreCase(letters[j])) {
					letterFound = true;
					break;
				}
			}
			if (!letterFound) {
				letters[index] = String.valueOf(word1.charAt(i)).toUpperCase();
				index ++;
			}
			
		}
		
		for (int i = 0; i < word2.length(); i++) {
			letterFound = false;
			
			for (int j = 0; j < letters.length; j++) {
				if (String.valueOf(word2.charAt(i)).equalsIgnoreCase(letters[j])) {
					letterFound = true;
					break;
				}
			}
			if (!letterFound) {
				letters[index] = String.valueOf(word2.charAt(i)).toUpperCase();
				index ++;
			}
			
		}
		
		for (int i = 0; i < letters.length; i++) {
			int initialPos = 0;
			String letter = letters[i];
			
			if (letter == null) break;
			
			while(word1.toUpperCase().indexOf(letter, initialPos) >= 0) {
				amountWord1[i]++;
				initialPos = word1.toUpperCase().indexOf(letter, initialPos) + 1;
			}
			
			initialPos = 0;
			
			while(word2.toUpperCase().indexOf(letter, initialPos) >= 0) {
				amountWord2[i]++;
				initialPos = word2.toUpperCase().indexOf(letter, initialPos) + 1;
			}
			
			if (amountWord1[i] != amountWord2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main (String[] args) {
		System.out.println(isAnagram("madam", "madness"));
	}
}
