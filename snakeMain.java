package snake;
import javax.swing.*;
public class snakeMain {
	public static void main(String[] args) {
		int boardWidth = 600;
        int boardHeight = 600;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);//frame become visible
	    frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);// screen in middle
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close on cross
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();//to not include title size
        snakeGame.requestFocus();// focus on button
	}
}
