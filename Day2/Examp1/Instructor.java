package classIntro;

public class Instructor {
	private int id;
	private String insructorName;

	public Instructor() {
	}

	public Instructor(int id, String insructorName) {
		this.id = id;
		this.insructorName = insructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsructorName() {
		return insructorName;
	}

	public void setInsructorName(String insructorName) {
		this.insructorName = insructorName;
	}
}
