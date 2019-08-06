package pl.codefights.core.intogates;

public class SeatsInTheater {
	
	public static void main(String[] args) {

		System.out.println(seatsInTheater(16, 11, 5, 3));
	}

	public static int seatsInTheater(int nCols, int nRows, int col, int row) {
		return ((nCols - col) + 1) * (nRows - row);
	}
}
