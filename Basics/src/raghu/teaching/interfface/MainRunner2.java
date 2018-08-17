package raghu.teaching.interfface;

public class MainRunner2 {

	public static void main(String[] args) {

		I1 i1 = new C2();
		i1.m1();
		i1.m2();

		I2 i2 = (I2)i1;

		i2.m3();
		i2.m1();
		i2.m2();
	}

}
