package assignment7p3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinSearchTestT {
	String s = "i'm the best  nd it's truea";
	char c = 'a';

	@Test
	void binarySearchTestT() {
		assertTrue( BinSearch.search(s, c));
	}

}
