
// @ Audra Flores
// @ version 4.5
// 9/22/15
// Mine Sweeper Game
// None needed
// Gameboard class, mineSweeper class

import java.util.Scanner;

public class mineSweeper {

	public static void main(String[] args) {

		Scanner scrn = new Scanner(System.in);
		System.out.println("If you want to play Mine Sweeper enter 'yes' if not enter 'no' ");
		String input = scrn.next();
		if (input.compareToIgnoreCase("yes") == 0) {
			boolean keepPlaying = true;
			while (keepPlaying) {
				GameBoard gb = new GameBoard();
				gb.getGameBoard();
				gb.loadBombs();
				boolean bomb = false;
				while (!bomb) {
					System.out.print("enter x ");
					int x = scrn.nextInt();
					System.out.print("enter y ");
					int y = scrn.nextInt();
					bomb = gb.isMine(x, y);
					if (bomb) {
						System.out.println("You hit a bomb. Game Over");
					}
				}

				System.out.println(" ");
				System.out.println("Enter 1 for a New Game");
				System.out.println("Enter 2 to Quit ");
				int menuOpt = scrn.nextInt();
				if (menuOpt != 1) {
					keepPlaying = false;
				}
			}

		}
		System.out.println("Goodbye!");
	}
}
