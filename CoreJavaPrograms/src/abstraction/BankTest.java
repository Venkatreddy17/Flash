package abstraction;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pAmount, years, rateSbi, rateHdfc;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle ammount and years ");
		pAmount = sc.nextFloat();
		years = sc.nextFloat();

		Bank b = new Sbi();
		rateSbi = b.getRateOfInterest();
		float simpleInterestSbi = pAmount * years * rateSbi / 100;
		System.out.println("Simple Interest for SBI bank is : " +simpleInterestSbi);

		Bank b1 = new Hdfc();
		rateHdfc = b1.getRateOfInterest();
		float simpleInterestHdfc = pAmount * years * rateHdfc / 100;
		System.out.println("Simple Interest for SBI bank is : " + simpleInterestHdfc);

	}

}
