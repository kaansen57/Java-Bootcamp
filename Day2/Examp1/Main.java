package classIntro;

public class Main {

	public static void main(String[] args) {


		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Yazılım");

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInsructorName("Engin Demiroğ");
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("Angular Bootcamp");
		course1.setCategoryId(1);
		course1.setInstructorId(1);
		course1.setUnitPrice(0);

		CourseManager courseManager = new CourseManager();
		CategoryManager categoryManager = new CategoryManager();
		InstructorManager instructorManager = new InstructorManager();
		
		courseManager.add(course1);
		
		for (Course course : courseManager.getAll()) {
			System.out.println(course.getCourseName());
		}
		
		for (Category category : categoryManager.getAll()) {
			System.out.println(category.getCategoryName());
		}
		
		for (Instructor instructor : instructorManager.getAll()) {
			System.out.println(instructor.getInsructorName());
		}

	}

}
