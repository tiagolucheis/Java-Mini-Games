package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import boardgame.Piece;
import game.BoardPosition;
import game.Match;

public class UI {

	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	// https://stackoverflow.com/questions/2979383/java-clear-the-console
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static BoardPosition readBoardPosition(Scanner sc) {
		
		try {
			
			String in = sc.nextLine();
			char column = in.charAt(0);
			int row = Integer.parseInt(in.substring(1));
	
			return new BoardPosition(column, row);

		}
		catch (RuntimeException e) {
			throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8.");
		}
		
	}
	
	public static void printMatch(Match match) {
		
		printBoard(match.getPieces());
		System.out.println();
		System.out.println("Turn: " + match.getTurn());
		
		/* if (!match.getCheckMate()) {
					
			System.out.println("Waiting player: " + match.getCurrentPlayer());
			
			if(match.getCheck()) {
				System.out.println("CHECK!");
			}
		
		}
		else {
			System.out.println("CHECKMATE!");
			System.out.println("Winner: " + match.getCurrentPlayer());
		} */
		
	}
	
	public static void printBoard(ArrayList<ArrayList<Piece>> pieces) {

		for (int i = 0; i < pieces.size(); i++) {
			System.out.print((pieces.size() - i) + " ");
			for (int j = 0; j < pieces.size(); j++) {
				printPiece(pieces.get(i).get(j), false);
			}
			System.out.println();
		}
		
		System.out.print(" ");
		for (int i = 1; i <= pieces.size(); i++) {
			System.out.print(" " + (char) (i + 96));
		}
		System.out.println();
		
	}
	
	private static void printPiece(Piece piece, boolean background) {
		
		if (background) {
			System.out.print(ANSI_BLUE_BACKGROUND);
		}
		if (piece == null) {
			System.out.print("-" + ANSI_RESET);
		}
		else {
			System.out.print(ANSI_WHITE + piece + ANSI_RESET);
        }
		System.out.print(" ");
		
	}
	
}
