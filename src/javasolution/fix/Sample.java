package javasolution.fix;

public class Sample {
	
	public static void seekHelpFrom(Friendable friend) {
		friend.listen();
	}

	public static void main(String[] args) {
		Human sam = new Human("Sam");
		Dog buddy = new Dog("Buddy");

		seekHelpFrom(sam);
		seekHelpFrom(buddy);
	}
}
