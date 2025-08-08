package entities;

import entities.enums.Color;

public class Rectangle extends Shape { // aqui, ele já dá erro informando que essa classe é obrigada
	   								   // a sobreescrever o método abstrato area() da superclasse
	private Double width;
	private Double heigth;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	@Override
	public Double area() {
		return width*heigth;
	} 
	
}