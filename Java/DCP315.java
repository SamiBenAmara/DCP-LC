// In linear algebra, a Toeplitz matrix is one in which the elements on any given diagonal from top left to bottom right are identical.
// Write a program to determine whether a given input is a Toeplitz matrix.

class DCP315
{
	public static boolean toeplitz(int[][] matrix)
	{
		int rows = matrix.length;
		int cols = matrix[0].length;

		int i = rows - 1;		// Row counter 
		int j = 0;		// Column counter
		int orig = 0;	// Value at the top of the row / column to be compared with the rest of the diagonal 

		// Go down each diagonal in the matrix
		for (int k = 0; k < rows + cols - 1; k++)
		{
			int ii = i;
			int jj = j;
			orig = matrix[i][j];

			// This loop goes down a diagonal in the matrix determined by i and j
			for (; ii < rows && jj < cols; ii++, jj++)
				if (matrix[ii][jj] != orig) return false;

			if (i > 0) i--;
			else if (j > 0 || i == 0) j++;
		}

		return true;
	}

	public static void main(String[] args)
	{
		int[][] matrix = 	{{7, 8, 9}, 
							 {6, 7, 8},
							 {5, 6, 7},
							 {4, 5, 6},
							 {3, 4, 5}};

		System.out.println(toeplitz(matrix));
	}
}