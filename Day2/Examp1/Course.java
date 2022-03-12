package classIntro;

public class Course {
	private int id;
	private String courseName;
	private int categoryId;
	private int instructorId;
	private double unitPrice;
	

	public Course() {
	}

	public Course(int id, String courseName, int categoryId, int instructorId, double unitPrice) {
		this.id = id;
		this.courseName = courseName;
		this.categoryId = categoryId;
		this.instructorId = instructorId;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
