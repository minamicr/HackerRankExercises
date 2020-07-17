package Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import Main.Palindrome;


public class PalindromeTest {
	
	@Test
	public void testPalindromeWord() {
		String word = "madam";
		Assert.assertTrue(Palindrome.isPalindrome(word));
	}
	
	@Test
	public void testNotPalindromeWord() {
		String word = "ioio";
		Assert.assertFalse(Palindrome.isPalindrome(word));
	}
}
