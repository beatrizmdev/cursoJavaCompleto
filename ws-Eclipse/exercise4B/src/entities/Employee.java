package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	   
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary() {
		grossSalary *= 1 + (percentage/100);
		return grossSalary;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
