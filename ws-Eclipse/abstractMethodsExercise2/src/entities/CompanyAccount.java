package entities;

public class CompanyAccount extends TaxPayer{
	
	private Integer employees;
	
	public CompanyAccount() {
		super();
	}

	public CompanyAccount(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double Tax() {
		Double tax = super.getAnualIncome() * 0.16;
		if (employees > 10) {
			tax = super.getAnualIncome() * 0.14;
		}

		return tax;
	}
	
	
}
