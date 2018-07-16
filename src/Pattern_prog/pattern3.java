package Pattern_prog;

import java.util.Scanner;


/*1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 */

public class pattern3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many rows you want in this pattern?");

		int rows = scan.nextInt();

		System.out.println("Here is your pattern....!!!");

		// first part
		for (int i = 1; i < rows; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}

			System.out.println();
		}

		// second part
 		for (int i = rows-2; i >= 1; i--) {

 			for (int j = 1; j <= i; j++) {

 				System.out.print(j + " ");
			}

			System.out.println();

		}
		

	}
}
