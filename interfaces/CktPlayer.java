package interfaces;

public class CktPlayer implements Printables {

	String name;
	int runs;

	CktPlayer() {

	}

	public CktPlayer(String name, int runs) {
		// super();
		this.name = name;
		this.runs = runs;
	}

	public void printDetails() {
		System.out.println("Cricket players Name " + name);
		System.out.println("Runs " + runs);
	}

}
