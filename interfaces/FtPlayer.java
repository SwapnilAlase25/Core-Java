package interfaces;

public class FtPlayer implements Printables {

	String name;
	int goals;

	FtPlayer() {

	}

	public FtPlayer(String name, int goals) {
		// super();
		this.name = name;
		this.goals = goals;
	}

	public void printDetails() {
		System.out.println("Football players Name " + name);
		System.out.println("goals " + goals);
	}

}
