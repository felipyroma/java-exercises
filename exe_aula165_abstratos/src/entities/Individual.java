package entities;

public class Individual extends Payer {
	
	private Double healthExpenditures = 0.0;
	
	public Individual() {
		
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxPaid() {
		if (getAnualIncome() < 20000.0) {
			if (healthExpenditures > 0) {
				return (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
				
			} else {
				return getAnualIncome() * 0.15;
			}
			
		} else {
			if (healthExpenditures > 0) {
				return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
				
			} else {
				return getAnualIncome() * 0.25;
			}
		}
	}
	


}
