package Octi;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		BoardPanel bp = new BoardPanel(7,6);
		
		f.add(bp);
		f.setVisible(true);
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
