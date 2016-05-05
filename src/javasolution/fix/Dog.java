package javasolution.fix;

class Dog implements Friendable {
	
	public final String name;

	public Dog(String theName) {
		name = theName;
	}

	FriendImpl friend = new FriendImpl();

	@Override
	public void listen() {
		friend.listen(name);
	}
}