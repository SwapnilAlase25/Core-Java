package perimeterFinder;

import java.util.Scanner;

public class mainfunc {

	public static void main(String[] args) {
		
		Perimeterfinder e = new Perimeterfinder();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side of sqaure: ");
		e.side=scan.nextInt();
		System.out.println("Area is "+ e.findPerimeter(e.side));
		
		System.out.println("Enter Radius of Circle: ");
		e.radius=scan.nextFloat();
		System.out.println("Area is "+ e.findPerimeter(e.radius));
		
		System.out.println("Enter length of rectangle: ");
		e.len=scan.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		e.bre=scan.nextInt();
		System.out.println("Area is "+ e.findPerimeter(e.len,e.bre));
		
		scan.close();
	}
}
