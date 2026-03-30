package entities;

public class outsourceEmployee extends Employee{
	private Double additionalCharge;
	
	public outsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	public outsourceEmployee() {
		
	}
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public Double payment() {
		return super.payment() + (additionalCharge * 1.1);
	}
}
