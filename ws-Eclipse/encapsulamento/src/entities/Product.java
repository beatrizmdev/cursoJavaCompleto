package entities;

public class Product {
	
	// 1º deixamos todos os atributos privados
	private String name; 
	private double price;
	private int quantity;
	
	// construtor 1
	public Product(String name, double price, int quantity) {          
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// construtor 2: sobrecarga
	//(aqui, n se faz obrigatório inserir a quantidade, ela fica 0, valor padrão de inicialização)
	public Product(String name, double price) {         
		this.name = name;
		this.price = price;
	}
	
	// construtor 3: padrão (que n leva os parâmetros e precisa ainda ser instanciado)
	public Product() {
	}
	
	// como os atributos n serão acessíveis no programa principal, precisamos montar os métodos get e set pra pegar e alterar esses valores
	// por padrão são escritos: getNomeDoAtributo() e setNomeDoAtributo(String nomeDoAtributo)
	// também é uma convenção que devem ser escritos após os construtores 
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; // this: retorna o atributo name dessa classe e não o parâmeto name
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
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