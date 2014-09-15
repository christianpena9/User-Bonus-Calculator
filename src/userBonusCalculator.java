import java.util.Scanner;

public class userBonusCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bonusMessage;
		
		System.out.print("How much do you make: ");
		Scanner salaryScan = new Scanner(System.in);
		String salaryInput = salaryScan.nextLine();
		int salary = Integer.parseInt(salaryInput);
		
		
		System.out.print("How much is the bonus rate as decimal: ");
		Scanner bonusRateScan = new Scanner(System.in);
		String bonusRateInput = bonusRateScan.nextLine();
		double bonusRate = Double.parseDouble(bonusRateInput);
		
		double salaryRaise = salary * bonusRate;
		double total = salaryRaise + salary;
		//int test = (int) total; // this converts double back to int
		
		bonusMessage = "Your salary: $" + salaryInput + ", bonusRate: " + bonusRateInput + "%, salary raise: $" + salaryRaise + ", Total: $" + total;
		System.out.println(bonusMessage);
		
		salaryScan.close();
		bonusRateScan.close();
	} // end main

} // end of userBonusCalculator
