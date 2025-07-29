package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> Items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}
	
	public void addItem(OrderItem item) {
		Items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		Items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.00;
		for (OrderItem item : Items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public void printingItemsInfo() {
		for (OrderItem item : Items) {
			System.out.println(item.getName()
					+ ", $"
					+ String.format("%.2f", item.getPrice())
					+ ", "
					+ "quantity: "
					+ item.getQuantity()
					+ ", subtotal: $"
					+ String.format("%.2f", item.subTotal())); 
		}
	}
}
