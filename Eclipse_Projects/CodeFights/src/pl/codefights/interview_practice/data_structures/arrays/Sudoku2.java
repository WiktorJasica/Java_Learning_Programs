package pl.codefights.interview_practice.data_structures.arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way 
 * that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all 
 * of the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku 
puzzle according to the layout rules described above. Note that the puzzle represented by grid does not 
have to be solvable.

Example

For

grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
        ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
        ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
        ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
        ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
        ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
        ['.', '.', '.', '5', '.', '.', '.', '7', '.']]
the output should be
sudoku2(grid) = true;

For

grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
        ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
        ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
        ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
        ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
        ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
        ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
        ['.', '2', '.', '.', '3', '.', '.', '.', '.']]
the output should be
sudoku2(grid) = false.

The given grid is not correct because there are two 1s in the second column. Each column, each row, 
and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.
 */
public class Sudoku2 {

	public static void main(String[] args) {

		char[][] A = { { '.', '.', '.', '1', '4', '.', '.', '2', '.' }, { '.', '.', '6', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '1', '.', '.', '.', '.', '.', '.' },
				{ '.', '6', '7', '.', '.', '.', '.', '.', '9' }, { '.', '.', '.', '.', '.', '.', '8', '1', '.' },
				{ '.', '3', '.', '.', '.', '.', '.', '.', '6' }, { '.', '.', '.', '.', '.', '7', '.', '.', '.' },
				{ '.', '.', '.', '5', '.', '.', '.', '7', '.' } };

		System.out.println(sudoku2(A));
	}

	public static boolean sudoku2(char[][] grid) {
		
		//values initialization 
		int n = grid.length;
		int tab[] = new int[128];
		Set<Character> square = new HashSet<>();

		//checking of rows in the grid
		for (char[] x : grid) {

			for (int i = 0; i < tab.length; i++) {
				tab[i] = 0;
			}

			for (char y : x) {
				if (y != '.') {
					tab[y]++;
				}
			}

			for (char c : x) {
				if (tab[c] > 1) {
					return false;
				}
			}
		}

		//rotate grid 90 deg. reverse clockwise 
		char b[][] = new char[n][n];
		int el = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][el - j] = grid[j][i];
			}
		}

		//checking rows in rotated grid 
		for (char[] x : b) {

			for (int i = 0; i < tab.length; i++) {
				tab[i] = 0;
			}

			for (char y : x) {
				if (y != '.') {
					tab[y]++;
				}
			}

			for (char c : x) {
				if (tab[c] > 1) {
					return false;
				}
			}
		}

		//checking 3x3 squares in  the grid
		for (int i = 0; i < n; i++) {
			int firstRow = (i / 3) * 3;
			int firstColumn = (i % 3) * 3;
			System.out.print(firstRow +" "+ firstColumn);
			System.out.println();
			for (int j = firstRow; j < firstRow + 3; j++) {
				for (int k = firstColumn; k < firstColumn + 3; k++) {
					if (grid[j][k] != '.') {
						if (!square.add(grid[j][k])) {
							return false;
						}
					}
				}
			}
			square.clear();
		}

		return true;
	}

}
