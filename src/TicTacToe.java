import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class TicTacToe extends MouseAdapter {
	static int count = 0;
	static int move = 0;
	static boolean draw = false;
	static boolean reset = false;

	static String[][] cell = { { "", "", "" }, { "", "", "" }, { "", "", "" } };
	
	public TicTacToe() {
		// TODO Auto-generated constructor stub
	}	
	

	public boolean drawPlayer(String s) {
		return draw;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(!hasWon()){
			//row 1
			if (e.getX() > 0 && e.getX() < Board.WIDTH/3 
					&& e.getY() > 0 && e.getY() < Board.HEIGHT/3 
					&& cell[0][0] == "") {
				if (count % 2 == 0) {
					cell[0][0] = "X";
				} else {
					cell[0][0] = "O";
				}
				draw = true;
				count++;
				hasWon();
			} else if (e.getX() > Board.WIDTH/3 && e.getX() < Board.WIDTH-(Board.WIDTH/3) 
					&& e.getY() > 0 && e.getY() < Board.HEIGHT/3 
					&& cell[0][1] == "") {
				if (count % 2 == 0) {
					cell[0][1] = "X";
				} else {
					cell[0][1] = "O";
				}
				draw = true;
				count++;
				hasWon();
			} else if (e.getX() > Board.WIDTH-(Board.WIDTH/3) && e.getX() < Board.WIDTH
					&& e.getY() > 0 && e.getY() < Board.HEIGHT/3 
					&& cell[0][2] == "") {
				if (count % 2 == 0) {
					cell[0][2] = "X";
				} else {
					cell[0][2] = "O";
				}
				draw = true;
				count++;
				hasWon();
				//row 2
			} else if (e.getX() > 0 && e.getX() < Board.WIDTH/3 
					&& e.getY() > Board.HEIGHT/3 && e.getY() < Board.HEIGHT-(Board.HEIGHT/3)
					&& cell[1][0] == "") {
				if (count % 2 == 0) {
					cell[1][0] = "X";
				} else {
					cell[1][0] = "O";
				}
				draw = true;
				count++;
				hasWon();
			} else if (e.getX() > Board.WIDTH/3 && e.getX() < Board.WIDTH-(Board.WIDTH/3)
					&& e.getY() > Board.HEIGHT/3 && e.getY() < Board.HEIGHT-(Board.HEIGHT/3)
					&& cell[1][1] == "") {
				if (count % 2 == 0) {
					cell[1][1] = "X";
				} else {
					cell[1][1] = "O";
				}
				draw = true;
				count++;
				hasWon();
			} else if (e.getX() > Board.WIDTH-(Board.WIDTH/3) && e.getX() < Board.WIDTH
					&& e.getY() > Board.HEIGHT/3 && e.getY() < Board.HEIGHT-(Board.HEIGHT/3)
					&& cell[1][2] == "") {
				if (count % 2 == 0) {
					cell[1][2] = "X";
				} else {
					cell[1][2] = "O";
				}
				draw = true;
				count++;
				hasWon();
				//row 3
			} else if (e.getX() > 0 && e.getX() < Board.WIDTH/3
					&& e.getY() > Board.HEIGHT-(Board.HEIGHT/3) && e.getY() < Board.HEIGHT
					&& cell[2][0] == "") {
				if (count % 2 == 0) {
					cell[2][0] = "X";
				} else {
					cell[2][0] = "O";
				}
				draw = true;
				count++;
				hasWon();
			} else if (e.getX() > Board.WIDTH/3 && e.getX() < Board.WIDTH-(Board.WIDTH/3) 
					&& e.getY() > Board.HEIGHT-(Board.HEIGHT/3) && e.getY() < Board.HEIGHT
					&& cell[2][1] == "") {
				if (count % 2 == 0) {
					cell[2][1] = "X";
				} else {
					cell[2][1] = "O";
				}
				draw = true;
				count++;
				hasWon();
			} else if (e.getX() > Board.WIDTH-(Board.WIDTH/3) && e.getX() < Board.WIDTH
					&& e.getY() > Board.HEIGHT-(Board.HEIGHT/3) && e.getY() < Board.HEIGHT
					&& cell[2][2] == "") {
				if (count % 2 == 0) {
					cell[2][2] = "X";
				} else {
					cell[2][2] = "O";
				}
				draw = true;
				count++;
				hasWon();
			}
			//checkCells();
			if(count == 9 && !hasWon()) {
				showDialog(null);
			}
		}
	}
	
	/**
	 * Used for testing without gui
	 */
	private void checkCells() {
		for(int i = 0; i<cell.length; i++) {
			for(int j = 0; j<cell[0].length; j++) {
				System.out.print("["+cell[i][j]+"]");
				if(j == 2) {
					System.out.println();
				}
			}
		}
	}


	private void showDialog(String s) {
		int result = JOptionPane.showConfirmDialog(null,
				"Reset", "Game Over", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION){
		    reset();
		} else {
			System.exit(1);
		}
		TicTacToe.reset = false;
	}
	
	private boolean hasWon() {
		// TODO Auto-generated method stub
		//X
		//down a column
		if(cell[0][0] == "X" && cell[1][0] == "X" && cell[2][0] == "X") {showDialog("X");return true;}
		else if(cell[0][1] == "X" && cell[1][1] == "X" && cell[2][1] == "X") {showDialog("X");return true;}
		else if(cell[0][2] == "X" && cell[1][2] == "X" && cell[2][2] == "X") {showDialog("X");return true;}
		//across a row
		else if(cell[0][0] == "X" && cell[0][1] == "X" && cell[0][2] == "X") {showDialog("X");return true;}
		else if(cell[1][0] == "X" && cell[1][1] == "X" && cell[1][2] == "X") {showDialog("X");return true;}
		else if(cell[2][0] == "X" && cell[2][1] == "X" && cell[2][2] == "X") {showDialog("X");return true;}
		//across X
		else if(cell[0][0] == "X" && cell[1][1] == "X" && cell[2][2] == "X") {showDialog("X");return true;}
		else if(cell[2][0] == "X" && cell[1][1] == "X" && cell[0][2] == "X") {showDialog("X");return true;}
		//O
		//down a column
		else if(cell[0][0] == "O" && cell[1][0] == "O" && cell[2][0] == "O") {showDialog("O");return true;}
		else if(cell[0][1] == "O" && cell[1][1] == "O" && cell[2][1] == "O") {showDialog("O");return true;}
		else if(cell[0][2] == "O" && cell[1][2] == "O" && cell[2][2] == "O") {showDialog("O");return true;}
		//across a row
		else if(cell[0][0] == "O" && cell[0][1] == "O" && cell[0][2] == "O") {showDialog("O");return true;}
		else if(cell[1][0] == "O" && cell[1][1] == "O" && cell[1][2] == "O") {showDialog("O");return true;}
		else if(cell[2][0] == "O" && cell[2][1] == "O" && cell[2][2] == "O") {showDialog("O");return true;}
		//across X
		else if(cell[0][0] == "O" && cell[1][1] == "O" && cell[2][2] == "O") {showDialog("O");return true;}
		else if(cell[2][0] == "O" && cell[1][1] == "O" && cell[0][2] == "O") {showDialog("O");return true;}
		
		return false;
	}

	public boolean reset() {
		for(int i = 0; i<cell.length; i++) {
			for(int j = 0; j<cell[0].length; j++) {
				TicTacToe.cell[i][j] = "";
			}
		}
		//checkCells();
		return reset = true;
	}
	
	public static void main(String[] args) {
		new TicTacToe();
		Board b = new Board();
		reset = false;
		while(true) {
			System.out.println();
			if(draw) {
				b.redraw();
				draw = false;
			}
		}
	}
}
