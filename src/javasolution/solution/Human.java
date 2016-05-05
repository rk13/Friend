package javasolution.solution;

public class Human implements Friendable {
	
	public final String name;

	public Human(String theName) {
		name = theName;
	}

	public void listen() {
		System.out.println(String.format("I'm %s, listening", name));
	}
}