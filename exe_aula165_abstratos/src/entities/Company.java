package entities;

public class Company extends Payer {
	
	private Integer employeesNumber;
	
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer employeesNumber) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double taxPaid() {
		if (employeesNumber <= 10) {
			return getAnualIncome() * 0.16;
		} else {
			return getAnualIncome() * 0.14;
		}
	}

}
