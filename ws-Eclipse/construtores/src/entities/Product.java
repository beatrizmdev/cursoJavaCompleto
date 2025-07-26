package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// o construtor vem após as declarações de var e comumente leva o nome da classe em que está inserido
	public Product(String name, double price, int quantity) {          
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// sobrecarga é você disponibilizar mais de uma versão da mesma operação
	//(aqui, n se faz obrigatório inserir a quantidade, ela fica 0, valor padrão de inicialização)
	public Product(String name, double price) {         
		this.name = name;
		this.price = price;
	}
	
	// e vc pode ainda manter um construtor padrão (que n leva os parâmetros e precisa ainda ser instanciado)
	public Product() {
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}