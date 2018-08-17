package raghu.teaching.area.of.shape.abstrac;

public class BankRunner {

	public static void main(String[] args) {

		Bank b1 = new BankHdfc();
		b1.getInterestHdfc();
		b1.getInterestIcici();
		b1.disp();
	
		
		BankICICI i1 = new BankHdfc();
		i1.getInterestHdfc();
		i1.getInterestIcici();
		i1.disp();
		
		BankHdfc h1 = new BankHdfc();
		h1.getInterestHdfc();
		h1.getInterestIcici();
		h1.disp();


		
		
		
			
			
		
		
	}

}
