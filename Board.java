package com.konovalov;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
	private Shape[] board = new Shape[4];

	public void add(Shape figure, int position) {
		if (position - 1 >= 0 && position - 1 < board.length) {
			if (board[position - 1] == null) {
				board[position - 1] = figure;
			} else {
				if (replace() == true) {
					board[position - 1] = figure;

				}
			}
		} else {
			System.out.println("Error position ");
		}

	}

	public boolean replace() {
		Scanner sc = new Scanner(System.in);
		System.out.println("There is already a figure on this position, to replace press `y` and Enter");
		if (sc.next() == "y") {
			return true;
		}
		return false;
	}

	public void delete(int position) {
		if (position - 1 >= 0 && position - 1 < board.length) {
			board[position - 1] = null;
			System.out.println("Removed position " + position);
		} else {
			System.out.println("Invalid position ");
		}
	}

	public String fullArea() {
		double fullArea = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				fullArea += board[i].getArea();
			}
		}

		return "Area= " + fullArea;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				sb.append("position "+(i+1)+" ");
				sb.append(board[i]);
				sb.append(System.lineSeparator());
			}
			
		}
sb.append(fullArea());
		return sb.toString();
	}

}
