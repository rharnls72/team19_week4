package team19.CalculateRate;

public class Plan {
  private double excessminuterate;
	private double includedMinutes;
	private double additionalrate;
	private double planrate;
	private Gold gold;
	private Silver silver;
	public Plan(User user){
		if("GOLD".equals(user.getType())){
			gold = new Gold();
			this.excessminuterate = gold.getExcessminuterate();
			this.includedMinutes = gold.getIncludedMinutes();
			this.additionalrate = gold.getAdditionalrate();
			this.planrate = gold.getPlanrate();
		}else if("SILVER".equals(user.getType())){
			silver = new Silver();
			this.excessminuterate = silver.getExcessminuterate();
			this.includedMinutes = silver.getIncludedMinutes();
			this.additionalrate = silver.getAdditionalrate();
			this.planrate = silver.getPlanrate();
		}
	}
	public double getExcessminuterate() {
		return excessminuterate; 
	}
	public double getIncludedMinutes() {
		return includedMinutes; 
	}
	public double getAdditionalrate() {
		return additionalrate;
	}
	public double getPlanrate() {
		return planrate;
	}
}
