/*
 * Main-Method for the Class Movie is in the Class (ThisIsMain)
 * First, getting the details of the movies (using standard for loop)
 * Next, displaying the details of all the movies (using enhanced for loop)
 * 
 */

package PRN_0018;

import java.util.Scanner;

public class ThisIsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter the Number of Movies : ");
		n = sc.nextInt();

		// Creating an Array of 'n' Movie Objects
		Movie[] movs = new Movie[n];
		for (int i = 0; i < movs.length; i++) {
			movs[i] = new Movie();
		}

		// Getting Details of 'n' Movies
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Details of " + (i + 1) + " Movie :");
			System.out.println("Enter Movie ID : ");
			movs[i].setMovieID(sc.nextInt());
			System.out.println("Enter Movie Name : ");
			movs[i].setMovieName(sc.nextLine() + sc.nextLine());
			System.out.println("Enter Movie Rating (Out of 10) : ");
			movs[i].setMovieRating(sc.nextInt());
		}

		// Printing the Array Objects using Enhanced For Loop
		for (Movie mov : movs) {
			mov.printMovie();
		}

		sc.close();

	}

}
