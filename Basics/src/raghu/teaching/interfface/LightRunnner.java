package raghu.teaching.interfface;

public class LightRunnner {

	void study() {

		ISwitch i = new FilamentBulb();
		// ISwitch i = new TubeLight();
		// ISwitch i = new FilamentBulbImpl();
		i.on();
		i.off();

	}

	public static void main(String[] args) {
		LightRunnner p = new LightRunnner();
		p.study();
	}

}
