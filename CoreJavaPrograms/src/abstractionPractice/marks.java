package abstractionPractice;

public abstract class marks {
	public abstract double getPercentage();

}
class StudentA extends marks{
	double m1,m2,m3;
	
	public StudentA(double m1,double m2,double m3) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	@Override
	public double getPercentage() {
		// TODO Auto-generated method stub
		return ((m1+m2+m3)/3);
	}
}
class StudentB extends marks{
	double m1,m2,m3,m4;
	public StudentB(double m1,double m2,double m3,double m4) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	@Override
	public double getPercentage() {
		// TODO Auto-generated method stub
		return ((m1+m2+m3+m4)/4);
	}
}

