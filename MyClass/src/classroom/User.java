package classroom;

public class User {

	private long id;
	private String user;
	private String password;

	public User() {

	}

	public User(String password) {
		this.password = password;
	}

	public User(long id, String user, String password) {
		this.id = id;
		this.user = user;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {

		User u = new User();
		User u1 = new User("123456");
		User user = new User(01, " 罗祺林", "luoqilin");
		System.out.println(
				"id:" + user.getId() + "\n" + "user:" + user.getUser() + "\n" + "password:" + user.getPassword());

	}

}
