package classIntro;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private String description;
	private double discountRate;
	
	public Product() {
		
	}
	public Product(int id, String name, double unitPrice, String description, double discountRate) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice() {
		return this.unitPrice - (this.unitPrice * this.discountRate / 100);
	}

}
