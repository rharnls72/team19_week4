package team19.CalculateRate;

import java.util.Scanner;
public class Main {
	public Main(){
		
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
