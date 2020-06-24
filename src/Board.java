import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Board extends JFrame {
	protected static final int WIDTH = 900;
	protected static final int HEIGHT = 900;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2195379760914381351L;
	
	public Board() {
		setTitle("Tic Tac Toe");
		getContentPane().addMouseListener(new TicTacToe());
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public void redraw() {
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		//Screen boarder
		g2.drawLine(0, 0, WIDTH, 0);
		g2.drawLine(0, HEIGHT, WIDTH, HEIGHT);
		g2.drawLine(0, 0, 0, HEIGHT);
		g2.drawLine(WIDTH, 0, WIDTH, HEIGHT);
		//Grid
		g2.drawLine(WIDTH/3, 0, WIDTH/3, HEIGHT);
		g2.drawLine(WIDTH-WIDTH/3, 0, WIDTH-WIDTH/3, HEIGHT);
		g2.drawLine(0, HEIGHT/3, WIDTH, HEIGHT/3);
		g2.drawLine(0, HEIGHT-HEIGHT/3, WIDTH, HEIGHT-HEIGHT/3);
		
		
		g2.setFont(new Font("TimesRoman", Font.PLAIN, 300));
		
		//  00|01|02
		//  --+--+--
		//  10|11|21
	    //  --+--+--
		//  20|21|22
		if(!TicTacToe.reset) {
		
			//00
			if(TicTacToe.cell[0][0] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 50, 250);
			} else if (TicTacToe.cell[0][0] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 50, 250);
			} 
			//10
			if(TicTacToe.cell[1][0] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 50, 550);
			} else if (TicTacToe.cell[1][0] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 50, 550);
			} 
			//20
			if(TicTacToe.cell[2][0] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 50, 850);
			} else if (TicTacToe.cell[2][0] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 50, 850);
			}
			//01
			if(TicTacToe.cell[0][1] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 350, 250);
			} else if (TicTacToe.cell[0][1] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 350, 250);
			} 
			//11
			if(TicTacToe.cell[1][1] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 350, 550);
			} else if (TicTacToe.cell[1][1] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 350, 550);
			} 
			//21
			if(TicTacToe.cell[2][1] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 350, 850);
			} else if (TicTacToe.cell[2][1] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 350, 850);
			}
			//02
			if(TicTacToe.cell[0][2] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 650, 250);
			} else if (TicTacToe.cell[0][2] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 650, 250);
			}
			//12
			if(TicTacToe.cell[1][2] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 650, 550);
			} else if (TicTacToe.cell[1][2] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 650, 550);
			} 
			//22
			if(TicTacToe.cell[2][2] == "X") {
				g2.setColor(Color.CYAN);
				g2.drawString("X", 650, 850);
			} else if (TicTacToe.cell[2][2] == "O") {
				g2.setColor(Color.RED);
				g2.drawString("O", 650, 850);
			}
		
		}
		
	}

}
