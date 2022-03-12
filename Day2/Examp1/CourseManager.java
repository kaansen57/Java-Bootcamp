package classIntro;

public class CourseManager {

	public void add(Course course) {
		System.out.println(course.getCourseName() +" eklendi");
	}
	
	
	public void delete(Course course)  {
		System.out.println(course.getCourseName() +  " silindi");
	}
	
	public void update(Course course)  {
		System.out.println(course.getCourseName() +  " güncellendi");
	}
	
	public Course[] getAll() {
		Course course1 = new Course(1,"Vue kursu",1,2,50);
		Course course2 = new Course(2,"REACT kursu",1,2,30);
		Course[] courses = {course1,course2};
		return courses;
	}
}
