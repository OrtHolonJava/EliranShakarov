package Octi;

import java.awt.Graphics;
import javax.swing.JPanel;

public class BoardPanel extends JPanel
{
	private Square _board[][];
	private Img _img;
	
	public BoardPanel(int rows, int cols)
	{
		_board = new Square[rows][cols];
		_img = new Img("Octi\\Images\\image1.png", 0, 0, 1000, 1000);
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < cols; j++)
				_board[i][j] = new Square(i,j);
	}
	
	public void paintComponent(Graphics g)
	{
		_img.drawImg(g);
	}
}
