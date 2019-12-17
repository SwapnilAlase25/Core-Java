/*
 * Implementation of Interface "Drawable" is in this Class.
 * The method 'draw()' will add two numbers (a and b)
 * and store the result in c.
 * 
 */

package PRN_0018;

public class ClassDraw implements Drawable {

	private int a, b, c;

	public ClassDraw() {
		a = 0;
		b = 0;
		c = 0;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	// Definition of method 'draw' implemented from 'Drawable'
	@Override
	public void draw() {
		c = a + b;
		System.out.println("A =" + a);
		System.out.println("B =" + b);
		System.out.println("C =" + c);
	}

}
