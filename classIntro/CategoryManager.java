package classIntro;

public class CategoryManager {
	
	public void add(Category category) {
		System.out.println(category.getCategoryName() +" eklendi");
	}
	
	
	public void delete(Category category)  {
		System.out.println(category.getCategoryName() +  " silindi");
	}
	
	public void update(Category category)  {
		System.out.println(category.getCategoryName() +  " güncellendi");
	}
	
	public Category[] getAll() {
		Category category1 = new Category(1,"Yazılım");
		Category category2 = new Category(2,"Matematik");
		Category[] categoryies = {category1,category2};
		return categoryies;
	}
}
