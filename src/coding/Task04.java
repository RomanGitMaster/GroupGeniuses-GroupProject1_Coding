package coding;

public class Task04 {

	public static void main(String[] args) {
		/*#4
		 * Create a 2D array or integer type where you will store odd and even
		 * numbers. Develop a program which will identify/print the even numbers only.
		 */

		int[][] num = { { 3, 6, 4, 8, 5 }, { 7, 9, 2, 4, 8 }, { 8, 3, 1, 5, 4 } };
		for (int a = 0; a < num.length; a++) {
			for (int e = 0; e < num[a].length; e++) {
				if (num[a][e] % 2 == 0) {
					System.out.print(num[a][e] + " ");
				}
			}
		}
	}

}
