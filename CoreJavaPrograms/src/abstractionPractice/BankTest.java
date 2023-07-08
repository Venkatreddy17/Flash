package abstractionPractice;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1=new BankA();
		double balanceA=bank1.getBalance();
		System.out.println("The Deposited amount on bank A is : "+balanceA);
		
		Bank bank2=new BankB();
		double balanceB=bank2.getBalance();
		System.out.println("The Deposited amount on bank B is : "+balanceB);
		
		Bank bank3=new Bankc();
		double balanceC=bank3.getBalance();
		System.out.println("The Deposited amount on bank C is : "+balanceC);

	}

}
