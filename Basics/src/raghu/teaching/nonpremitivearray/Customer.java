package raghu.teaching.nonpremitivearray;

public class Customer implements Person {

	int custId;

	long custMobile;

	int custAge;

	public Customer(int custId, long custMobile, int custAge) {
		super();
		this.custId = custId;
		this.custMobile = custMobile;
		this.custAge = custAge;
	}

	@Override
	public int compareAge() {
		// TODO Auto-generated method stub
		return custAge;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custMobile=" + custMobile + ", custAge=" + custAge + "]";
	}

	
}
