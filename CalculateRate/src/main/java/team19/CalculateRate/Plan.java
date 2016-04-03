package team19.CalculateRate;

public class Plan {
  private double excessminute_rate;
	private double includedMinutes;
	private double additional_rate;
	private double planrate;
	Gold gold;
	Silver silver;
	public Plan(User user){
		if(user.getType().equals("gold")){
			gold = new Gold();
			this.excessminute_rate = gold.getExcessminute_rate();
			this.includedMinutes = gold.getIncludedMinutes();
			this.additional_rate = gold.getAdditional_rate();
			this.planrate = gold.getPlanrate();
		}else if(user.getType().equals("silver")){
			silver = new Silver();
			this.excessminute_rate = silver.getExcessminute_rate();
			this.includedMinutes = silver.getIncludedMinutes();
			this.additional_rate = silver.getAdditional_rate();
			this.planrate = silver.getPlanrate();
		}
	}
	public double getExcessminute_rate() {
		return excessminute_rate; 
	}
	public double getIncludedMinutes() {
		return includedMinutes; 
	}
	public double getAdditional_rate() {
		return additional_rate;
	}
	public double getPlanrate() {
		return planrate;
	}
}
