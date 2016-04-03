package team19.CalculateRate;

public class TotalRate {
	private User user;
	private Plan plan;
	private double basic_monthly_rate;
	private double excessminute;
	private double familyrate;
	static private double basic_family_rate;
	private double additionalrate;
	private double totalrate;

	public TotalRate(User user) {
	}
	private void setCalculate() {
	}
	public double getTotalrate() {
		return totalrate;
	}
	public double getExcessMinuteRate() {
		return excessminute;
	}
	public double getAdditionalLineRate() {
		return additionalrate;
	}
	public double getFamilyrate() {
		return familyrate;
	}
	public double getPlanRate() {
		return plan.getPlanrate();
	}
}
}
