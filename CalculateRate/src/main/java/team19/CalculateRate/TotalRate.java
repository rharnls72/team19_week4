package team19.CalculateRate;

public class TotalRate {
	private User user;
	private Plan plan;
	private double excessminute;
	private double familyrate;
	private double additionalrate;
	private double totalrate;

	public TotalRate(User user) {
		this.user = user;
		plan = new Plan(user);
		setCalculate();
	}
	private void setCalculate() {
		totalrate = getExcessMinuteRate() + getAdditionalLineRate() + getFamilyrate() + getPlanRate();
	}
	public double getTotalrate() {
		return totalrate;
	}
	public double getExcessMinuteRate() {
		if(user.getMinutesofuse() > plan.getIncludedMinutes()) {
			double temp = user.getMinutesofuse()-plan.getIncludedMinutes();
			this.excessminute= temp*plan.getExcessminuterate();
		}
		else
			this.excessminute= 0;
		return excessminute;
	}
	public double getAdditionalLineRate() {
		int temp = user.getNumberofline()-1;
		if(temp<3){
			additionalrate = plan.getAdditionalrate()*temp;
		}else{
			additionalrate = plan.getAdditionalrate()*2;
		}
		return additionalrate;
	}
	public double getFamilyrate() {
		if (user.getNumberofline()>3){ 
			familyrate = (user.getNumberofline() - 3)*5;
		}
		else familyrate = 0;
		return familyrate;
	}
	public double getPlanRate() {
		return plan.getPlanrate();
	}
}
}
