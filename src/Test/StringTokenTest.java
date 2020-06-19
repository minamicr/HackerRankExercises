package Test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Main.StringToken;


public class StringTokenTest {
	
	@Test
	public void numberOfItensCorrect() {
		StringToken st = new StringToken();
		String sentence = "He is a very very good boy, isn't he?";
		
		boolean test = false;
		
		List<String> words = st.splitString(sentence);
		
		if (st.countWords(words) == 10) {
			test = true;
		}
		
		Assert.assertTrue(test);
	}

}
