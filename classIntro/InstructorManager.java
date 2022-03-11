package classIntro;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getInsructorName() +" eklendi");
	}
	
	
	public void delete(Instructor instructor)  {
		System.out.println(instructor.getInsructorName() +  " silindi");
	}
	
	public void update(Instructor instructor)  {
		System.out.println(instructor.getInsructorName() +  " güncellendi");
	}
	
	public Instructor[] getAll() {
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
		Instructor[] instructors = {instructor1};
		return instructors;
	}

}
