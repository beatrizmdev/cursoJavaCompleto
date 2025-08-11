package entities;

public class IndividualAccount extends TaxPayer{
	
	private Double health;
	
	public IndividualAccount() {
		super();
	}

	public IndividualAccount(String name, Double anualIncome, Double health) {
		super(name, anualIncome);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public Double Tax() {
		
		Double tax = super.getAnualIncome() * 0.15;
		if (super.getAnualIncome() >= 20.000) {
			tax = super.getAnualIncome() * 0.25;
		}
		
		if (health > 0.0) {
			tax -= health/2;
		}
		return tax;
	}
	
	
	
}
