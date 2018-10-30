package assignment7p3;
import java.util.Arrays;

public class BinSearch {
	public static void main(String []args) {
		String s="I'm the best and It's true";
		char c='a';
		System.out.println(search(s,c));
	}
 
//		char[] sc = s.toCharArray();// this method changes string to character of Array
//		Arrays.sort(sc);
		
		public static boolean search(String s, char c) {
		if (s == null || s.length() == 0 || c == '\u0000')
			return false;
		int m = s.length() / 2;
		if (s.charAt(m) == c)
			return true;
		else if (s.charAt(m) < c) {
			return search(s.substring(m + 1), c);
		} else if (s.charAt(m) > c) {
			return search(s.substring(0, m), c);
		}
		return false;
	}
}
