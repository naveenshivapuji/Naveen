package raghu.teaching.agrregation;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Employee {

	String name;
	int id;
	double sal;

	Address ad;

	Employee(String name, int id, double sal, Address ad) {

		this.name = name;
		this.id = id;
		this.sal = sal;

		this.ad = ad;
	}

	void personInfo() {

		System.out.println(" Employee Details");
		System.out.println("Name  : " + name);
		System.out.println("Emp ID : " + id);
		System.out.println("Emp salary : " + sal);

		System.out.println("Address : " + ad.getAddress());

	}

}
