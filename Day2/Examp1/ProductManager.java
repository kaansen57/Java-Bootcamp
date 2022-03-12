package classIntro;

public class ProductManager {
	public void add(Product product) {
		System.out.println(product.getName() +  " eklendi");
	}
	
	public void delete(Product product) {
		System.out.println(product.getName() +  " silindi");
	}
	
	public void update(Product product) {
		System.out.println(product.getName() +  " güncellendi");
	}
	
	public Product[] getAll() {
		Product product1 = new Product(1,"laptop",2222,"laptop açıklama",10);
		Product product2 = new Product(2,"mouse",5000,"laptop açıklama",20);
		Product[] products = {product1,product2};
		return products;
	}

}
