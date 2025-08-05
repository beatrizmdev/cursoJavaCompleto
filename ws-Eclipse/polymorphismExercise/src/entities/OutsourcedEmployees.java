package entities;

public class OutsourcedEmployees extends Employees {
	
	private Double additionalCharge;
	
	public OutsourcedEmployees() {
		super();
	}
	public OutsourcedEmployees(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	@Override
	public Double payment() {
		return super.payment() + (1.1* additionalCharge);
	}
	
	
}
