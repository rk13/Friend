package javasolution.solution;

public class Dog implements Friendable {
	
	public final String name;

	public Dog(String theName) {
		name = theName;
	}

	@Override
	public void listen() {
		System.out.println(String.format("I'm %s, listening", name));
	}
}