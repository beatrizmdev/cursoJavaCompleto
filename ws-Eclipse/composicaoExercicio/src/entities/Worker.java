package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	public Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(Integer month, Integer year) { // salário base + o que ele ganhou em todos os contratos naquele mês
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_month = 1 + cal.get(Calendar.MONTH); // "1 +" porque o mês do Calendar inicia-se em 0
			int c_year = cal.get(Calendar.YEAR);
			
			if (c_month == month && c_year == year) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}