package javasolution.fix;

class Human implements Friendable {
	public final String name;

	public Human(String theName) {
		name = theName;
	}

	FriendImpl friend = new FriendImpl();

	@Override
	public void listen() {
		friend.listen(name);
	}
}