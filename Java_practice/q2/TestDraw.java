/*
 *  Main Method for 'ClassDraw' (which implements Drawable)
 *  is in this class (TestDraw)
 *  
 *  Creating 'n' number of Objects
 *  
 */

package PRN_0018;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDraw {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, objnum = 0;

		// Creating an Array List
		ArrayList<ClassDraw> objs = new ArrayList<>();

		System.out.println("Enter the number of Objects : ");
		n = sc.nextInt();

		// Setting the values of 'a' and 'b'
		for (int i = 0; i < n; i++) {
			System.out.println("For Object " + (i + 1));
			ClassDraw dd = new ClassDraw();
			System.out.println("Enter A : ");
			dd.setA(sc.nextInt());
			System.out.println("Enter B : ");
			dd.setB(sc.nextInt());
			objs.add(dd);
		}

		// Invoking Draw Method for each object using Enhanced For Loop
		for (ClassDraw obj : objs) {
			System.out.println("Object Number " + (objnum + 1));
			obj.draw();
			objnum++;
		}

		sc.close();

	}

}
