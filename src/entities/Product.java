package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String nameProduct, Double price) {
		this.name = nameProduct;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameProduct) {
		this.name = nameProduct;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
