package raghu.teaching.upcasting.downcasting;

abstract public class Vehicle {
	
	int cc;
	
	Vehicle (int cc)
	{
		this.cc = cc;
	}
	
	abstract void drive();
	abstract void model();

}
