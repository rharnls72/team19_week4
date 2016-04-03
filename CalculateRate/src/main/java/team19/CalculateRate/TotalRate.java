package team19.CalculateRate;

public class TotalRate {
	private User user;
	private Plan plan;
	private double excessminute;
	private double familyrate;
	private double additionalrate;
	private double totalcost;

	public TotalRate(User user) {
		this.user = user;
		plan = new Plan(user);
		setCalculate();
	}
	private void setCalculate() {
		totalcost = getExcessMinuteRate() + getAdditionalLineRate() + getFamilyrate() + getPlanRate();
	}
	public double getTotalrate() {
		return totalcost;
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
	public static void main(String[] args){
	  TotalRate totalrate;
		System.out.print("Type : ");
		Scanner input = new Scanner(System.in);
		String type = input.nextLine().toUpperCase();
		System.out.print("Line : ");
		int line = input.nextInt();
		System.out.print("Minutes : ");
		double minutes = input.nextDouble();
		
		User user1 = new User(type, line, minutes);
		totalrate = new TotalRate(user1);
		System.out.println(totalrate.getTotalrate());
	}
}

