package entities;

public class OrderItem {
	
	private String name;
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Double subTotal() {
		return quantity*price;
	}
		
}
