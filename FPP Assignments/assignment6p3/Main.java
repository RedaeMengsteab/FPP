package assignment6p3;
import java.awt.EventQueue;

public class Main {
	
		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyFrame mf = new MyFrame();
				mf.setVisible(true);
			}
		});
	}

}
