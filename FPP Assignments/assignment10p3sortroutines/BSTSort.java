package assignment10p3sortroutines;
import assignment10p3runtime.Sorter;

public class BSTSort extends Sorter {
	@Override
	public int[] sort(int[] arr) {
		MyBST m=new MyBST();
		m.insertAll(arr);
		return m.readIntoArray();
	}
}
