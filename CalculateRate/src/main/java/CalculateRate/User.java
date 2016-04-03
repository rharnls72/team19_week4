package CalculateRate;

public class User {
	private String type;
	private int numberofline;
	private double minutesofuse;
	
	public User(String type, int numberofline, double minutesofuse) {
		this.type = type;
		this.numberofline = numberofline;
		this.minutesofuse = minutesofuse;
	}
	
	public String getType() {
		return type;
	}
	
	public int getNumberofline() {
		return numberofline;
	}
	
	public double getMinutesofuse() {
		return minutesofuse;
	}
}
