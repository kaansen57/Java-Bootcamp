package classIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("telefon");
		product1.setUnitPrice(1000);
		product1.setDescription("telefon açıklama");
		product1.setDiscountRate(10);
		
		Product product2 = new Product(2,"laptop",5000,"laptop açıklama",20);
		

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

		Product[] products = { product1 , product2 };

		for (Product product : products) {
			System.out.println(product.getName() + " " + product.getUnitPrice() + " indirimli hali : "
					+ product.getDiscountedPrice());
		}
		
		
		ProductManager productManager = new ProductManager();
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
		
		for (Product product : productManager.getAll()) {
			System.out.println(product.getName());
		}
		

	}

}
