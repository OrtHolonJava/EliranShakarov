package Octi;

import java.awt.Image;

public class Square 
{
	public enum Soldier { EMPTY , GREEN , ORANGE };
	private int _row;
	private int _col;
	private Soldier _soldier;
	private Image _imgBackground;
	private Image _imgSoldier;
	private boolean _canPutImg;
	
	
	public Square(int row, int col)
	{
		_row = row;
		_col = col;
		_canPutImg = false;
		_soldier = Soldier.EMPTY;
	}

	public int getRow() {
		return _row;
	}

	public void setRow(int row) {
		_row = row;
	}

	public int getCol() {
		return _col;
	}

	public void setCol(int col) {
		_col = col;
	}

	public Soldier getSoldier() {
		return _soldier;
	}

	public void setSoldier(Soldier soldier) {
		_soldier = soldier;
	}

	public boolean isCanPutImg() {
		return _canPutImg;
	}

	public void setCanPutImg(boolean canPutImg) {
		_canPutImg = canPutImg;
	}	
}
