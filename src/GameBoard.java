
// @ Audra Flores
// @ version 4.5
// 9/22/15
// Mine Sweeper Game
// None needed
// GameBoard class, mineSweeper class

import java.util.Random;

public class GameBoard {

	private char[][] board = new char[10][10];

	public void getGameBoard() {
		System.out.print("   ");
		for (int i = 0; i < 10; i++) {
			System.out.print("|" + i + "|");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print("|" + i + "|");
			for (int j = 0; j < 10; j++) {
				board[i][j] = 'x';

				System.out.print("|" + board[i][j] + "|");

			}
			System.out.println();
		}
	}

	private char bombs[][] = new char[10][10];

	public void loadBombs() {
		for (int i = 0; i < 8; i++) {
			int x = new Random().nextInt(10);
			int y = new Random().nextInt(10);

			if (bombs[x][y] == 'B') {
				i--;
			} else {
				bombs[x][y] = 'B';

				System.out.println(x + " " + y);

			}
		}
	}

	public boolean isMine(int x, int y) {
		if (bombs[x][y] == 'B') {
			return true;
		} else {
			return false;
		}
	}

}