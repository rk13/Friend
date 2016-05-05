package javasolution.problem;

public class Sample {
	
	public static void seekHelpFrom(Human friend) {
		friend.listen();
	}

	public static void main(String[] args) {
		Human sam = new Human("Sam");
		seekHelpFrom(sam);
	}
}
