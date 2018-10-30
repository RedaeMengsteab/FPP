package assignment7p3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinSearchTestF {
	String s = "i'm the best & it's true";
	char c = 'a';

	// since char c which is a is not in the string s, this test will fail
	@Test
	void binarySearchTestF() {
		assertEquals(true, BinSearch.search(s, c));
	}


}
