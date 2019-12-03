package perimeterFinder;

public class Perimeterfinder {
	
	int side;
	float radius;
	int len,bre;
	
	public int findPerimeter(int side){
		return side*side;
	}
	
	public float findPerimeter(float rad) {
		return (float) (3.14*rad*rad);
	}

	public int findPerimeter(int length, int breadth) {
		return length*breadth;
	}
}
