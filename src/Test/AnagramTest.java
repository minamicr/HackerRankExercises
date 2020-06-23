package Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Main.Anagram;

public class AnagramTest {

	@Test
	public void wordsAreAnagram() {
		String word1 = "madam";
		String word2 = "madam";
		
		Assert.assertTrue(Anagram.isAnagram(word1, word2));
		
		word1 = "ioio";
		word2 = "oioi";
		
		Assert.assertTrue(Anagram.isAnagram(word1, word2));
		
		word1 = "io io";
		word2 = "oi oi";
		
		Assert.assertTrue(Anagram.isAnagram(word1, word2));
		
		word1 = "  ";
		word2 = "  ";
		
		Assert.assertTrue(Anagram.isAnagram(word1, word2));
		
		word1 = null;
		word2 = null;
		
		Assert.assertTrue(Anagram.isAnagram(word1, word2));
		
		word1 = "hello";
		word2 = "HelLO";
		
		Assert.assertTrue(Anagram.isAnagram(word1, word2));
	}
	
	@Test
	public void wordsAreNotAnagram() {
		String word1 = "madam";
		String word2 = "madness";
		
		Assert.assertFalse(Anagram.isAnagram(word1, word2));
		

	}
	
	@Test
	public void wordsAreNotAnagramDifferentLength() {
		String word1 = "abcdbcda";
		String word2 = "bbccddaaxyzt";
		
		Assert.assertFalse(Anagram.isAnagram(word1, word2));
	}

	@Test
	public void wordsAreNotAnagramDifferentSpaces() {
		String word1 = "  ";
		String word2 = "   ";
		
		Assert.assertFalse(Anagram.isAnagram(word1, word2));
	}
	
	
	
	@Test
	public void wordsAreNotAnagramDifferentWords() {
		String word1 = "ab";
		String word2 = "abXY";
		
		Assert.assertFalse(Anagram.isAnagram(word1, word2));
	}
	
	@Test
	public void wordsAreNotAnagramTotallyDifferentWords() {
		String word1 = "abc";
		String word2 = "def";
		
		Assert.assertFalse(Anagram.isAnagram(word1, word2));
	}
}
