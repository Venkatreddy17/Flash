package abstractionPractice;

public abstract class Bank {
	public abstract double getBalance() ;
	
}
class BankA extends Bank{
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 100;
	}
}
class BankB extends Bank{
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 150;
	}
}
class Bankc extends Bank{
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 200;
	}
}