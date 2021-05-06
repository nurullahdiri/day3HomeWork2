
public class Instructor extends User{
	private int userId;
	private String firsName;
	private String lastName;
	
	

	public Instructor(int id, String email, int userId, String firsName, String lastName) {
		super(id, email);
		this.userId = userId;
		this.firsName = firsName;
		this.lastName = lastName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
